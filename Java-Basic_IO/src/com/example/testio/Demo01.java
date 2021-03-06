package com.example.testio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * IO分类
 * 
 * 流向：输入输出
 * 数据：字节流：可以处理一切文件
 * 		 字符流：文本文件，只能处理纯文本
 * 功能：节点流：包裹流
 * 		 处理流： 增强功能，提升性能
 * 
 * 字符和字节流
 * 字节流
 * 		输入流：inPutStream
 * 		输出流:	outPutStream
 * @author 北飞的候鸟
 *
 */
public class Demo01 {
	
	public static void main(String[] args) {
		System.out.println("开始");
		File file = new File("D:/迅雷下载/FreeBsd.iso");
		File outFile = new File("D:/迅雷下载/FreeBsd2.iso");
		
		try {
			InputStream is = new FileInputStream(file);
			OutputStream os= new FileOutputStream(outFile);
			
			byte[] buf = new byte[10240];
			int len = 0;
			while(-1 != (len = is.read(buf))){
				os.write(buf, 0, len);
			}
			os.flush();
			os.close();
			is.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("结束");
		
	}

}
