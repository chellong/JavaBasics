package com.example.testudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * ��������� + �˿�
 * 
 * ׼����������
 * 
 * ����������
 *  
 *  ���ݼ����� IO��
 *  
 * @author ���ɵĺ���
 *
 */
public class Server {

	public static void main(String[] args) {
		
		try {
			//���������� + �˿�
			DatagramSocket ds = new DatagramSocket(1993);
			//׼����������
			byte[] containet = new byte[1024];
			//��װ�ɰ�daraGrampacket
			DatagramPacket packet = new DatagramPacket(containet,containet.length);
			//��������
			ds.receive(packet);
			//��������
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