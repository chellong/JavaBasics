package com.example.httpserver_0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private ServerSocket serverSocket;
	
	public static void main(String[] args) {
		Server server = new Server();
		server.start();
		server.recive();
	}
	
	public void start(){
		try {
			 serverSocket = new ServerSocket(8080);
			 this.recive();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unused")
	public void recive(){
		try {
			Socket socket = serverSocket.accept();
			 String msg = null;
			 StringBuilder sb = new StringBuilder();
			 BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 
			 while((msg = br.readLine()).length() > 0){
				 sb.append(msg);
				 if(msg == null){
					 break;
				 }
			 }
			 
			 System.out.println(sb.toString().trim());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void stop(){
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
