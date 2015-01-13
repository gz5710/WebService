/**
 * 
 */
package com.tmax;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * @Author: Bruce GONG
 * @Project: Tester
 * @Package: com.tmax
 * @Filename: XMLTest
 * @Datetime: 2014年12月12日 / 下午3:46:51
 */
public class XMLTest {

	/**
	 * 
	 */
	public XMLTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SAXBuilder builder = new SAXBuilder();
		  File xmlFile = new File("E:\\framework.xml");
	 
		  try {
	 
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			List list = rootNode.getChild("actions").getChildren("action");
	 
			for (int i = 0; i < list.size(); i++) {
	 
			   Element node = (Element) list.get(i);
	 
			   System.out.println("First Name : " + node.getChildText("url-pattern"));
			   /*System.out.println("Last Name : " + node.getChildText("lastname"));
			   System.out.println("Nick Name : " + node.getChildText("nickname"));
			   System.out.println("Salary : " + node.getChildText("salary"));*/
	 
			}
	 
		  } catch (IOException io) {
			System.out.println(io.getMessage());
		  } catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		  }
	}

}
