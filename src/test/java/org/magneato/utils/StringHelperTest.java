package org.magneato.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.junit.Test;

import java.io.IOException;

public class StringHelperTest {
	@Test
	public void getSnippet() {
		String content = "<p>Inspite of the recent snowfall  snow-depths remain&nbsp; below average..<br><br>It has not snowed since before Christmas <br></p>";
		String result = StringHelper.getSnippet(content, 20);
		System.out.println(result);
	}

    @Test
    public void longSnippet() {
        String content = "<p>Inspite of the recent snowfall  snow-depths remain&nbsp; below average..<br><br>It has not snowed since before Christmas <br></p>";
        String result = StringHelper.getSnippet(content, 100);
        System.out.println(result);
    }
    
    @Test
    public void iframe() {
    	String content = "<p>This video looks at how to make a template for mounting tech / pintech type bindings.</p><p><iframe src=\"//www.youtube.com/embed/Own0BXzzNb4\" class=\"note-video-clip\" width=\"640\" height=\"360\" frameborder=\"0\"></iframe><br></p>";

        String result = StringHelper.getSnippet(content, 200);
        System.out.println(result);
    }
    
    
    @Test
    public void longSnippet2() {
        String content = "<p class=\"myclass test\">Skating in fresh powder seems to be a regular thing this January and it is character building to say the least. Still not enough snow at the lower and more convenient le Sappey slopes but it is coming!</p>";
        String result = StringHelper.getSnippet(content, 100);
        System.out.println(result);
    }
    
    @Test
    public void realSnippet() {
    	String content = "<div>The Foulée Blanche (<i>the white stride</i>) is a long distance cross country skiing event organized on the Vercors Plateau at Autrans. The event grew out of a desire to preserve something of the spirit of the 1968 Grenoble Olympics - most of the infrastructure had been abandoned with the exception of the small ski jump at Autrans.</div><div><br></div><div>{image:0}</div><div><br></div><div>The first Foulée Blanche took place in 1979 and was more a social event with 3000 skiers skiing over 3 distances (5, 10 and 20km) with no timing. The event reached a peak in 1985 during the glory years of cross country with nearly 18,000 participants. The even was blighted by a succession of poor winters with 6 cancellations between 1988 and 1998&nbsp; and a drop in interest in cross country skiing.</div><div><br></div><div>With a move to higher altitude terrain the race has run almost normally since although there are&nbsp; frequently headaches with the snow cover in the villages of Meaudre and Autrans. For 2019 the go ahead was only given 8 days before the start date thanks to fresh snow. Interest in endurance sports such as trail and cross country skiing, particularly among young competitors, both male and female, has also grown in the last few years. In 2014 3300 school kids took part in the Foulée des Jeunes and in 2016 the Foulée joined the prestigious FIS Worldloppet Cup. This year there were 5,500 competitors.</div><div><br></div><div>I’d intended to ski last year’s race but the long distance event was increased to a whopping 50 km to coincide with the 50th anniversary of the Grenoble Olympics. A recce of the course the week before put me off the idea. This year I had the more reasonable objective of the 20k event - I can ski 20 km on cross country skis in a couple of hours so figured I’d at least finish before dark. I’d also need a complicated medical for the 42km event.</div><div><br></div><div>The week before the start saw a number of changes in the course before settling on linking Meaudre with Autrans but due to limited snow on the plateau this would be via the mountains with some 550 meters of climbing to Gève before plunging back down the switchback descent to Autrans. On Sunday it looked like there would be a window of more or less settled weather in the morning before snow in the afternoon.</div><h3>Ben Hur</h3><div>I arrived at 9am and was directed to a parking spot at the top of Autrans village near the ski de fond trails. No need to take anything but myself and my skis. I picked up a bib at the ski de fond building - this has a transponder attached for timing and has to be worn the right way round. Apparently they have sensors on the course so people can follow your progress, or lack of it. I then took a bus over to Meaudre and the start at 10h30. You can take gear with you and have it sent back to Autrans and there is a coffee and cake tent for pre-course sustenance.</div><div><iframe frameborder=\"0\" src=\"//www.youtube.com/embed/81F1IjPd3UY\" width=\"640\" height=\"360\" class=\"note-video-clip\"></iframe><br></div><div>536 competitors took the start line for the 20k event, 428 were already on the course for the 42km marathon. Celine, my colleague from the SN Chartrousin ski club said the start <i>“is like the jungle”.</i> Meaning it was everyone for themselves as skiers jostle for position, only the elite get a privileged start in front of the crowds. Think Ben Hur on skis.</div><div><br></div><div>We were off, careful not to cross skis or entangle and break ski poles, parallel skiing and double polling at the start then slowly things opened up a bit before funnelling into the ski tracks. After a couple of km a 20% wall stopped most skiers in their tracks and a traffic jam formed. Luckily I had followed Celine out of the gate and was right behind her near the front. Over the top and a long fast descent, somewhere an alpine skier like me could gain a bit of time but I had a skier in front of me, first he moved right so I went for the gap on the left, then he closed the gap so I quickly switched right but he then swerved violently right - it was more poor skiing rather than a desire to block me but I shouted and made it past with a whisker only just able to round the bend at the bottom of the hill.</div><h3>Tower of Pain</h3><div>Then the <i>“big one”</i> started. The climb is nearly 5km at 7% but if the first 3km are a not unreasonable 6% there follows 1.5km at around 10% with a few nasty little walls closer to 15%. I tried to ski tempo to the final ramp and not lose time. When you watch cross country on the TV you can see the skiers gracefully following each other in perfect, graceful, timing. That takes a lot of practice and the skiers are at a similar level. In reality it is hard to match the pace of the skier just in front even if they are climbing at a similar speed, couple that with people stopped on the right (to get their breath or remove layers) and skiers overtaking on the left and it makes for a lot of pole and ski “interaction”. It is also a case of getting into a “train” at the right level so you don’t blow up on the climb, when the slope ramped up I let the “train” I was in move ahead and I skied alone at my own pace. I caught up at the first feed stop at around 10km but lost contact on a final wall.</div><h3>Wipe-out</h3><div>There followed a nice rolling few km through the forests of the Gève area. On the dow hills I would catch skiers but would tend to lose contact on the climbs. There then followed the big, fast descent to Autrans. A skier caught me up on the left, I moved to let him through. He came flying past at high speed and plouf, straight off at the first bend right in front of me. We reached the bottom of the hill, I thought the finish must only be a few hundred meters. I was really suffering especially my elbow where I have a mild tendinitis but no, the signs read 3km and we had a long tour across Autrans village, through the school playing fields, a nasty steep ramp, round the football pitch, past some houses. The snow was very sticky in the sun and warmth and it felt like skiing treacle. The man who’d overtaken me on the downhill caught back up and… whoumpf, he crashed coming off the back of the little ramp as he was unable to turn his skis in the snow. I was finding it hard to lift my feet but finally the little descent to the finish arrived, then the long loop to double back into the finish zone. We had good skiers from the 42km race join us on this section. Into the finish line and for some reason another competitor crashed straight into me in his effort to sprint for the line - given the finish zone is 50 meters wide it was hard to understand this “attraction”.&nbsp;</div><h3>Old Fools</h3><div>I checked my finish time, 12th in my category (out of how many I don’t know and what category I know not neither - “<i>old fools who should know better</i>?”), 218th overall out of 536 finishers in 1h37m. I rolled in 3 minutes behind the “train” I’d followed to the steep section of the climb. I’d never managed to catch up on the descent as I’d rather unrealistically planned. The winner, Paul Fontaine, had flown over the course in around 52 minutes and the first woman, Debhora Laffont was not far behind at 1h02m. The final skier took some 2h53m. To give a bit more perspective the winning 42km competitor, Gérard Agnellet took just 1h48m, not far off my 20km time and the first lady was Céline Chopard in 2h09. Both the 20k and 42k share the same difficult main climb so maybe not so bad. There were 7 abandons and the last skier came home in 5h20m. Everyone agreed that this year’s 20km had been <i>difficult</i>, the fastest taking 10 minutes longer than last year.</div><div><br></div><div>What did I learn? Well I’m never going to be a Martin Fourcade, even in my age category. The Rhone-Alpes has a very serious and hard core gang of sportsmen and women. In my ski club there is a current U23 world champion at ski de fond and the club across the valley has a current Olympic gold medallist and winners on the World and European biathlon circuit. The Vercors is home to 7 times Crystal Globe winner Martin Fourcade. Even among the amateurs there are people out training before, during and after work. I’m not a minnow in a large pond but more like in an ocean of talent. That said, skiers were all levels from international athletes to others looking for a challenge who were not necessarily good cross country skiers.</div><div><br></div><div>Everyone can improve. Cross country skiing is not just power and fitness but technique, landing the skis just right to get the minimum resistance when you glide then the optimum power as you push off. It is the eternal <i>la recherche de la glisse</i>[1], in both the classic and skating forms, that makes the sport so addictive.</div><div><br></div><div>[1] seeking gliding;</p></a>";
    	String result = StringHelper.getSnippet(content, 400);
        System.out.println(result);
    }


    //@Test
    public void imageTagParsingExact() {
        String content = "<p>Inspite of the recent snowfall{image:0}  snow-depths remain&nbsp; below average..<br>{image:1}<br>It has not snowed since before Christmas <br></p>";
        String json = "{\"title\":\"Couloir Virgule before Carmen\",\"child\":false,\"activity_c\":\"Ski Touring\",\"trip_date\":\"01/01/2018\",\"content\":\"<p><p>The weather service announced a window from 10 to 2 pm, just before the arrival of storm Carmen. It had snowed overnight but only about 15cm. With the heavy rain at the weekend the snow depths have reduced from 70 to 30cm at 1000m but still enough to tour as it is relatively dense but somewhat discontinuous in the Chartreuse forests. The ski lift at the Col de Marcieu was not running due to a technical fault so the ski runs had not been pisted, some of the best skiing of the tour. The trail was made to the summit. I was a bit slow today, 1h10 for the 800 meter climb. In the cirque of the alpe du Seuil a slab had descended the day before yesterday and there was a purge in the middle of the bowl covering the tracks - so probably around midday.</p><p>The couloir already had 1 track, the snow was a bit dense to ski easily but not enough to cover the icy base and the &quot;staircases&quot; left by previous skiers. The side slopes and forest offered some good skiing - although neither I nor the skier in front had attempted to go too far onto these avalanche prone areas.</p></p><p><strong>Weather: </strong>Sun, turning stormy, rain at 15h</p><p><strong>Access: </strong>Snow at the pass</p><p><strong>Country: </strong>France<strong> Area: </strong>Chartreuse<strong> Trailhead: </strong>Col de Marcieu</p>\",\"ski_difficulty_c\":{\"bra\":\"2\",\"snowline\":1040},\"technical_c\":{\"imperial\":\"false\",\"distance\":6.3,\"climb\":800},\"files\":[{\"name\":\"54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"size\":\"397567\",\"url\":\"/library/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"thumbnailUrl\":\"/library/images/542/4e8/thumb_54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"deleteUrl\":\"/delete/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"deleteType\":\"DELETE\"},{\"name\":\"54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"size\":\"440751\",\"url\":\"/library/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"thumbnailUrl\":\"/library/images/542/4e8/thumb_54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"deleteUrl\":\"/delete/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"deleteType\":\"DELETE\"}],\"metadata\":{\"canonical_url\":\"aulp-du-seuil-couloir-en-virgule.18471522013-route\",\"edit_template\":\"tripreport\",\"display_template\":\"tripreport\",\"create_date\":\"2018-01-01 23:42:58\",\"ip_addr\":\"178.79.148.217\",\"owner\":\"davidof\",\"groups\":[\"editors\"],\"relations\":[\"rb9c8be8816f5\"],\"perms\":11275}}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = mapper.reader().readTree(json);
            String result =StringHelper.parseTags(content, jsonNode);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   // @Test
    public void imageTagParsingOutOfRange() {
        String content = "<p>Inspite of the recent snowfall{image:0}  snow-depths remain&nbsp; below average..<br>{image:10}<br>It has not snowed since before Christmas <br></p>";
        String json = "{\"title\":\"Couloir Virgule before Carmen\",\"child\":false,\"activity_c\":\"Ski Touring\",\"trip_date\":\"01/01/2018\",\"content\":\"<p><p>The weather service announced a window from 10 to 2 pm, just before the arrival of storm Carmen. It had snowed overnight but only about 15cm. With the heavy rain at the weekend the snow depths have reduced from 70 to 30cm at 1000m but still enough to tour as it is relatively dense but somewhat discontinuous in the Chartreuse forests. The ski lift at the Col de Marcieu was not running due to a technical fault so the ski runs had not been pisted, some of the best skiing of the tour. The trail was made to the summit. I was a bit slow today, 1h10 for the 800 meter climb. In the cirque of the alpe du Seuil a slab had descended the day before yesterday and there was a purge in the middle of the bowl covering the tracks - so probably around midday.</p><p>The couloir already had 1 track, the snow was a bit dense to ski easily but not enough to cover the icy base and the &quot;staircases&quot; left by previous skiers. The side slopes and forest offered some good skiing - although neither I nor the skier in front had attempted to go too far onto these avalanche prone areas.</p></p><p><strong>Weather: </strong>Sun, turning stormy, rain at 15h</p><p><strong>Access: </strong>Snow at the pass</p><p><strong>Country: </strong>France<strong> Area: </strong>Chartreuse<strong> Trailhead: </strong>Col de Marcieu</p>\",\"ski_difficulty_c\":{\"bra\":\"2\",\"snowline\":1040},\"technical_c\":{\"imperial\":\"false\",\"distance\":6.3,\"climb\":800},\"files\":[{\"name\":\"54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"size\":\"397567\",\"url\":\"/library/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"thumbnailUrl\":\"/library/images/542/4e8/thumb_54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"deleteUrl\":\"/delete/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"deleteType\":\"DELETE\"},{\"name\":\"54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"size\":\"440751\",\"url\":\"/library/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"thumbnailUrl\":\"/library/images/542/4e8/thumb_54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"deleteUrl\":\"/delete/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"deleteType\":\"DELETE\"}],\"metadata\":{\"canonical_url\":\"aulp-du-seuil-couloir-en-virgule.18471522013-route\",\"edit_template\":\"tripreport\",\"display_template\":\"tripreport\",\"create_date\":\"2018-01-01 23:42:58\",\"ip_addr\":\"178.79.148.217\",\"owner\":\"davidof\",\"groups\":[\"editors\"],\"relations\":[\"rb9c8be8816f5\"],\"perms\":11275}}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = mapper.reader().readTree(json);
            String result =StringHelper.parseTags(content, jsonNode);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //@Test
    public void imageTagParsingDuplicate() {
        String content = "<p>Inspite of the recent snowfall{image:1}  snow-depths remain&nbsp; below average..<br>{image:1}<br>It has not snowed since before Christmas <br></p>";
        String json = "{\"title\":\"Couloir Virgule before Carmen\",\"child\":false,\"activity_c\":\"Ski Touring\",\"trip_date\":\"01/01/2018\",\"content\":\"<p><p>The weather service announced a window from 10 to 2 pm, just before the arrival of storm Carmen. It had snowed overnight but only about 15cm. With the heavy rain at the weekend the snow depths have reduced from 70 to 30cm at 1000m but still enough to tour as it is relatively dense but somewhat discontinuous in the Chartreuse forests. The ski lift at the Col de Marcieu was not running due to a technical fault so the ski runs had not been pisted, some of the best skiing of the tour. The trail was made to the summit. I was a bit slow today, 1h10 for the 800 meter climb. In the cirque of the alpe du Seuil a slab had descended the day before yesterday and there was a purge in the middle of the bowl covering the tracks - so probably around midday.</p><p>The couloir already had 1 track, the snow was a bit dense to ski easily but not enough to cover the icy base and the &quot;staircases&quot; left by previous skiers. The side slopes and forest offered some good skiing - although neither I nor the skier in front had attempted to go too far onto these avalanche prone areas.</p></p><p><strong>Weather: </strong>Sun, turning stormy, rain at 15h</p><p><strong>Access: </strong>Snow at the pass</p><p><strong>Country: </strong>France<strong> Area: </strong>Chartreuse<strong> Trailhead: </strong>Col de Marcieu</p>\",\"ski_difficulty_c\":{\"bra\":\"2\",\"snowline\":1040},\"technical_c\":{\"imperial\":\"false\",\"distance\":6.3,\"climb\":800},\"files\":[{\"name\":\"54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"size\":\"397567\",\"url\":\"/library/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"thumbnailUrl\":\"/library/images/542/4e8/thumb_54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"deleteUrl\":\"/delete/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"deleteType\":\"DELETE\"},{\"name\":\"54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"size\":\"440751\",\"url\":\"/library/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"thumbnailUrl\":\"/library/images/542/4e8/thumb_54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"deleteUrl\":\"/delete/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"deleteType\":\"DELETE\"}],\"metadata\":{\"canonical_url\":\"aulp-du-seuil-couloir-en-virgule.18471522013-route\",\"edit_template\":\"tripreport\",\"display_template\":\"tripreport\",\"create_date\":\"2018-01-01 23:42:58\",\"ip_addr\":\"178.79.148.217\",\"owner\":\"davidof\",\"groups\":[\"editors\"],\"relations\":[\"rb9c8be8816f5\"],\"perms\":11275}}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = mapper.reader().readTree(json);
            String result =StringHelper.parseTags(content, jsonNode);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //@Test
    public void imageTagFormats() {
        String content = "<p>Inspite of the recent snowfall{image:}  snow-depths remain&nbsp; below average..<br>{image} {image:<br>It has not snowed since before Christmas <br></p>";
        String json = "{\"title\":\"Couloir Virgule before Carmen\",\"child\":false,\"activity_c\":\"Ski Touring\",\"trip_date\":\"01/01/2018\",\"content\":\"<p><p>The weather service announced a window from 10 to 2 pm, just before the arrival of storm Carmen. It had snowed overnight but only about 15cm. With the heavy rain at the weekend the snow depths have reduced from 70 to 30cm at 1000m but still enough to tour as it is relatively dense but somewhat discontinuous in the Chartreuse forests. The ski lift at the Col de Marcieu was not running due to a technical fault so the ski runs had not been pisted, some of the best skiing of the tour. The trail was made to the summit. I was a bit slow today, 1h10 for the 800 meter climb. In the cirque of the alpe du Seuil a slab had descended the day before yesterday and there was a purge in the middle of the bowl covering the tracks - so probably around midday.</p><p>The couloir already had 1 track, the snow was a bit dense to ski easily but not enough to cover the icy base and the &quot;staircases&quot; left by previous skiers. The side slopes and forest offered some good skiing - although neither I nor the skier in front had attempted to go too far onto these avalanche prone areas.</p></p><p><strong>Weather: </strong>Sun, turning stormy, rain at 15h</p><p><strong>Access: </strong>Snow at the pass</p><p><strong>Country: </strong>France<strong> Area: </strong>Chartreuse<strong> Trailhead: </strong>Col de Marcieu</p>\",\"ski_difficulty_c\":{\"bra\":\"2\",\"snowline\":1040},\"technical_c\":{\"imperial\":\"false\",\"distance\":6.3,\"climb\":800},\"files\":[{\"name\":\"54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"size\":\"397567\",\"url\":\"/library/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"thumbnailUrl\":\"/library/images/542/4e8/thumb_54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"deleteUrl\":\"/delete/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_npvv4x3sgwjuhledg7wrvhkga4abrl0huttwmkymlc-2048x1152.jpg\",\"deleteType\":\"DELETE\"},{\"name\":\"54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"size\":\"440751\",\"url\":\"/library/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"thumbnailUrl\":\"/library/images/542/4e8/thumb_54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"deleteUrl\":\"/delete/images/542/4e8/54237bf6-14da-40e9-b0f0-b9e094ee94e8_wjdjjatnk-douaoxvgbj8bewg93sggvtripvtoz6e-2048x1152.jpg\",\"deleteType\":\"DELETE\"}],\"metadata\":{\"canonical_url\":\"aulp-du-seuil-couloir-en-virgule.18471522013-route\",\"edit_template\":\"tripreport\",\"display_template\":\"tripreport\",\"create_date\":\"2018-01-01 23:42:58\",\"ip_addr\":\"178.79.148.217\",\"owner\":\"davidof\",\"groups\":[\"editors\"],\"relations\":[\"rb9c8be8816f5\"],\"perms\":11275}}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = null;
        try {
            jsonNode = mapper.reader().readTree(json);
            String result =StringHelper.parseTags(content, jsonNode);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
