package com.example.testtcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) {
		
		try {
			Socket client = new Socket("127.0.0.1",1993);
			
			/*
			BufferedReader br = new BufferedReader(
					new InputStreamReader(client.getInputStream())); 
			String str = null;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
			*/
			
			DataInputStream dis = new DataInputStream(client.getInputStream());
			String str = dis.readUTF();
			
			System.out.println(str);
			
			
			
			client.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
