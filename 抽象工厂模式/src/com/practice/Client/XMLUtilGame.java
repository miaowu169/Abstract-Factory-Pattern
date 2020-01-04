package com.practice.Client;

import java.io.File;

import javax.xml.parsers.*;
import org.w3c.dom.*;


public class XMLUtilGame {
	//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getGameFactory() {
		try {
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;
			doc = builder.parse(new File("src\\com\\practice\\Client\\config.xml"));
			
			//��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
			Node classNode = nl.item(0).getFirstChild();
			String gameFactory = classNode.getNodeValue();
			//System.out.println(gameFactory);
			
			//ͨ����������ʵ�����󲢽��䷵��
			String ClassName = "com.practice.Factory.Imple."+ gameFactory;
			Class<?> c = Class.forName(ClassName);
			@SuppressWarnings("deprecation")
			Object obj = c.newInstance();			
			return obj;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
