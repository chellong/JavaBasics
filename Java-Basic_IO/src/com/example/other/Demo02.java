package com.example.other;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo02 {

	public static void main(String[] args) {
		try {
			RandomAccessFile rnd = new RandomAccessFile(new File("D://test.txt"), "r");
			rnd.seek(10);
			
			byte[] flush = new byte[1024];
			int len = 0;
			while(-1 != (len = rnd.read(flush))){
				System.out.println(new String(flush,0,len));
			}
			
			rnd.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
