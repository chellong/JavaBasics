package com.example.test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test {

	public static void main(String[] args) {

		//URL url = new URL("http://www.baidu.com:80/index.html#a");
		try {
			URL url = new URL("http://www.baidu.com:80");
			String host = url.getHost();
			System.out.println(host);
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			System.out.println(url.getFile());
			
			URL u = new URL(url,"/b?username=123");
			System.out.println(u.toString());
			System.out.println(u.getPath());
			System.out.println(u.getRef());//����ê��
			System.out.println(u.getQuery());//����ê�㷵��null�������ڷ�����ȷ
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
