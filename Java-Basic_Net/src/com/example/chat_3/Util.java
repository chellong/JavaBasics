package com.example.chat_3;

import java.io.Closeable;
import java.io.IOException;

public class Util {

	public static void close(Closeable... io) {
		for (Closeable temp : io) {
			try {
				if (temp != null) {
					temp.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
