package com.example.testudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 创建服务端 + 端口
 * 
 * 准备接受容器
 * 
 * 非面向连接
 *  
 *  数据加类型 IO流
 *  
 * @author 北飞的候鸟
 *
 */
public class Server {

	public static void main(String[] args) {
		
		try {
			//创建服务器 + 端口
			DatagramSocket ds = new DatagramSocket(1993);
			//准备接受容器
			byte[] containet = new byte[1024];
			//封装成包daraGrampacket
			DatagramPacket packet = new DatagramPacket(containet,containet.length);
			//接受数据
			ds.receive(packet);
			//解析数据
			byte[] data = packet.getData();
			int len = packet.getLength();
			System.out.println(new String(data,0,len));
			ds.close();
			
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
