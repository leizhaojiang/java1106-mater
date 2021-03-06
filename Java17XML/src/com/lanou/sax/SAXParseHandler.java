package com.lanou.sax;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParseHandler extends DefaultHandler{
	int bookIndex = 0;//代表第几本书
	Book book = null;//表示创建的书籍对象
	String value = null;//保存的是节点内容
	ArrayList<Book> books = new ArrayList<Book>();
	//文档解析开始
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("开始解析文档");
	}
	//开始解析标签节点
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
		/* qname节点名称
		 * attributes属性集合
		 */
		if (qName.equals("book")) {
			book = new Book();
			bookIndex++;
			System.out.println("开始遍历第 " + bookIndex + "本书");
			//获取属性
			for (int i = 0; i < attributes.getLength(); i++) {
				System.out.println("属性名: " + attributes.getQName(i)
				+ ", 属性值: " + attributes.getValue(i));
			}
		}
	}
	//获取节点内容
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		value = new String(ch, start, length);
		if (!value.trim().equals("")) {
			System.out.println(value);
		}
		
	}
	//结束解析标签节点
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		switch (qName) {
			case "name":
				book.setName(value);
				break;
			case "date":
				book.setDate(value);
				break;
			case "price":
				book.setPrice(value);
				break;
			case "language":
				book.setLanguage(value);
				break;
			case "book":
				System.out.println(book);
				books.add(book);
				break;
			case "author":
				book.setAuthor(value);
				break;
			default:
				break;
		}
	}
	
	//文档解析结束
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("结束解析文档");
	}
}
