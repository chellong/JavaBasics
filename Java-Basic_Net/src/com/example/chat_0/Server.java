package com.example.chat_0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		ServerSocket serverSocket = new ServerSocket(1993);
		Socket socket = serverSocket.accept();
		
		//input
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String str = dis.readUTF();
		System.out.println("服务器" + str);
		dis.close();
		
		//outPut
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("数据");
		dos.flush();
		dos.close();
		
		
	}

}
