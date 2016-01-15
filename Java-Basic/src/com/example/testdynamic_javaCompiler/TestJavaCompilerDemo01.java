package com.example.testdynamic_javaCompiler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 
 * @author ±±·ÉµÄºòÄñ
 *
 */
public class TestJavaCompilerDemo01 {

	public static void main(String[] args) {
		
		/**
		 * ±àÒë×Ó×Ö·û´®
		 */
		
//		String filePath = "E:/JavaBasics/Jav-Basics/HelloWorld.java";
//		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
//		int result = compiler.run(null, System.out,System.err,filePath);
//		System.out.println(result == 0 ? "±àÒë³É¹¦" : "±àÒëÊ§°Ü");
//		
		
		Runtime run = Runtime.getRuntime();
		try {
			Process process = run.exec("java -cp E:/JavaBasics/Jav-Basics/HelloWorld.java");
			InputStream is = process.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			String info = "";
			while((info = reader.readLine()) != null){
				System.out.println(info);
			}
		
		
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	 
	
	
	
	
	
	
	
}
