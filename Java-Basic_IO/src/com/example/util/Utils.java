package com.example.util;

import java.io.Closeable;
import java.io.IOException;

public class Utils {

	public static void close(Closeable ... io ){
		for(Closeable temp : io){
			try {
			if(temp != null){
					temp.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
