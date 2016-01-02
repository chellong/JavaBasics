package com.example.chat_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) throws IOException {
		System.out.println("«Î ‰»Î√˚≥∆£∫");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		if(name.equals("")){
			return;
		}
		
		try {
			Socket socket = new Socket("127.0.0.1",1993);
			new Thread(new Send(socket,name)).start();
			new Thread(new Receive(socket)).start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

