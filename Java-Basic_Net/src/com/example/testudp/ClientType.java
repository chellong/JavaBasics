package com.example.testudp;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class ClientType {

	public static void main(String[] args) {

		DatagramSocket ds;
		try {
			ds = new DatagramSocket(1994);

			double num = 19.93;

			byte[] data = convert(num);

			DatagramPacket packet = new DatagramPacket(data, data.length, new InetSocketAddress("127.0.0.1", 1993));

			ds.send(packet);
			ds.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
public static byte[] convert(double num){
		
		byte[] data = null;
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos =new DataOutputStream(bos);
		try {
			dos.writeDouble(num);
			dos.flush();
			
			data = bos.toByteArray();
			dos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
		
		
		
	}
}
