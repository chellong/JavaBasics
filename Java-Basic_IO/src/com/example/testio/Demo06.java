package com.example.testio;

import java.io.ByteArrayOutputStream;

public class Demo06 {

	public static void main(String[] args) {
		
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		String msg = "�������ļ�����������һֱ"; 
		byte[] info = msg.getBytes();
		os.write(info, 0, info.length);
		
		byte[] dest = os.toByteArray();
		
		System.out.println(new String(dest));
	}
}