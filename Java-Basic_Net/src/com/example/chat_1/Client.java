package com.example.chat_1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) {
		
		try {
			
			Socket socket = new Socket("127.0.0.1",1993);
			new Thread(new Send(socket)).start();
			new Thread(new Receive(socket)).start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

