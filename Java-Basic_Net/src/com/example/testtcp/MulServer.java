package com.example.testtcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 服务端
 * 
 * @author 北飞的候鸟
 *
 */
public class MulServer {
	
	/**
	 * 
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		try {
			//创建客户端
			ServerSocket serverSocket = new ServerSocket(1993);
			while(true){
				//接受客户端的连接，阻塞式
				Socket socket =  serverSocket.accept();
				OutputStream os = socket.getOutputStream();
				String msg = "欢迎使用";
				
				/*
				BufferedWriter bw = new BufferedWriter(
						new OutputStreamWriter(os));
				bw.write(msg);
				bw.newLine();
				bw.flush();
				*/
				
				DataOutputStream dos = new DataOutputStream(os);
				dos.writeUTF(msg);
				dos.flush();
				dos.close();
				
				socket.close();
			
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
