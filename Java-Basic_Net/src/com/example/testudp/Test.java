package com.example.testudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Test {
	
	public static void main(String[] args) {
		
		try {
			//创建服务器 + 端口
			DatagramSocket ds = new DatagramSocket(1994);

			String msg = "12345678";
			byte[] data = msg.getBytes();
			
			
			DatagramPacket packet = new DatagramPacket(data, data.length,
					new InetSocketAddress("127.0.0.1",1993));
			
			ds.send(packet);
			ds.close();
			
			
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
