package com.example.testio;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.example.util.Utils;

public class Demo05 {

	public static void main(String[] args) throws IOException {
		
		String  msg = "操作与文件输入流操作一直";
		byte[] src = msg.getBytes();
		
		InputStream is = new BufferedInputStream(
				new ByteArrayInputStream(src));
		
		byte[] buf = new byte[1024];
		int len = 0;

		try {
			while((len = is.read(buf)) != -1){
				System.out.println(new String(buf,0,len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Utils.close(is);
	}
}
