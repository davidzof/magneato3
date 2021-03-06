package org.magneato.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringHelper {
    private static final ObjectMapper mapper = new ObjectMapper();
    private static final Logger log = LoggerFactory
            .getLogger(StringHelper.class);
    // strip html - only works on well formed html but should be ok with our editor, note Pattern is thread safe
    private static final Pattern p = Pattern.compile("<[^>]*>");

    // https://github.com/slugify/slugify
    private static final Pattern NONLATIN = Pattern.compile("[^\\w-]");
    private static final Pattern WHITESPACE = Pattern.compile("[\\s]");
    private static final Pattern EDGESDHASHES = Pattern.compile("(^-|-$)");

    public static String toSlug(String input) {
        String nowhitespace = WHITESPACE.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace,
                Normalizer.Form.NFD);
        String slug = NONLATIN.matcher(normalized).replaceAll("");
        slug = EDGESDHASHES.matcher(slug).replaceAll("");
        return slug.toLowerCase(Locale.ENGLISH);
    }

    /**
     * Return a snippet end tag or first 100 characters of string
     *
     * @param snippet - string to snip
     * @param max     - max length of snippet
     * @return
     */
    public static String getSnippet(String snippet, int max) {
        
        // remove well formed tags
        Matcher m = p.matcher(snippet);
        snippet = m.replaceAll("");

        if (snippet.length() > max) {
            snippet = snippet.substring(0, max);
        }
        
        // cut at sentence boundary if possible
        int i = snippet.lastIndexOf('.');
        if (i > 0) {
            snippet = snippet.substring(0, i+1);
        }

        return snippet;
    }

    /**
     * tags are: {image:0} - reference to attached file
     *
     * @param snippet
     * @param node
     * @return
     */
    public static String parseTags(String snippet, JsonNode node) {
        Pattern p = Pattern.compile("\\{[a-z:0-9]+\\}");
        Matcher m = p.matcher(snippet);
        StringBuffer sb = new StringBuffer();
        JsonNode files = node.get("files");
        if (files == null) {
            return snippet;
        }

        // consume tags
        while (m.find()) {
            String tag = m.group(0);
            int i = tag.indexOf(':');
            if (i == -1) {
                log.error("Invalid tag format {}", tag);
                continue; // process next tag
            }
            try {
                int index = Integer.parseInt(tag.substring(i + 1,
                        tag.length() - 1));
                if (index < files.size() && index >= 0) {
                    String url = files.get(index).get("url").asText();
                    // TODO check ending - can be .jpeg, .jpg, .png, .gif for
                    // image types
                    m.appendReplacement(sb,
                            "<img class=\"img-responsive\" src=\"" + url
                                    + "\"/>");
                } else {
                    log.error("tag index out of range {}", tag);

                }
            } catch (NumberFormatException e) {
                log.error("tag bad index format {}", tag);
                continue; // process next tag
            }
        }
        m.appendTail(sb);

        return sb.toString();
    }

    public static JsonNode toJsonNode(String json) {
        JsonNode jsonNode = null;
        try {
            ObjectReader reader = mapper.reader();
            jsonNode = reader.readTree(json);
        } catch (IOException e) {
            log.error("Something went wrong reading json " + e.getMessage()
                    + " " + json);
        }

        return jsonNode;
    }

}