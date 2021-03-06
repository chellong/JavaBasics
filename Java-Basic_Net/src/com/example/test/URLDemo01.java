package com.example.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo01 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.baidu.com");//��ҳĬ����Դ
			InputStream is = url.openStream();
			/*
			byte[] flush = new byte[1024];
			int len = 0;
			while((len = is.read(flush))!= -1 ){
				System.out.println(new String(flush,0,len));
			}
			*/
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(is,"utf-8"));
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D://baidu.html"),"utf-8"));
			String msg = null;
			while((msg = br.readLine()) != null ){
				//System.out.println(msg);
				
				bw.append(msg);
				bw.newLine();
			}
			bw.flush();
			br.close();
			bw.close();
			is.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
