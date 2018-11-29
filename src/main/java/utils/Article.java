/*
 * Copyright 2011-2013, David George, Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package utils;

import org.apache.commons.lang3.StringEscapeUtils;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

@XmlRootElement
public class Article  {
	private MetaData metaData;
	private StringBuilder contents = new StringBuilder();
	private String category;
	
	Article(MetaData metaData) {
		this.metaData = metaData;
	}
	
	void addParagraph(String s) {
		contents.append("<p>");
		contents.append(s);
		contents.append("</p>");
	}
	
	void setCategory(String category) {
		this.category = category;
	}
	
	public String toString() {
		return  contents.toString() + ", " +category + ", " + metaData.toString();
	}
}