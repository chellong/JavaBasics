package com.example.testio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 1��������
 * 		�ֽ���
 * �ֽڻ�����
 * 		buffer`
 * 
 * �ַ�������
 *  	buffer
 *  
 *  ʹ�����ӷ������ܷ�����̬
 *  
 * @author ���ɵĺ���
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		
		System.out.println("��ʼ");
		File file = new File("D:/Ѹ������/FreeBsd.iso");
		File outFile = new File("D:/Ѹ������/FreeBsd2.iso");
		
		try {
			InputStream is = new BufferedInputStream(new FileInputStream(file));
			OutputStream os= new BufferedOutputStream(new FileOutputStream(outFile));
			
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
		
		System.out.println("����");
	}

}