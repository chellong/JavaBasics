package com.example.chat_0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception, IOException {

		Socket socket = new Socket("127.0.0.1", 1993);
		
		//outPut
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF("����");
		dos.flush();
		dos.close();
		
		//input
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		String str = dis.readUTF();
		System.out.println("�ͻ���" + str);
		
		dis.close();
	}
}
