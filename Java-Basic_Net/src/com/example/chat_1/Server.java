package com.example.chat_1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	
	private List<MyChannel> list= new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		 new Server().start();
	}
	
	@SuppressWarnings("resource")
	public void start() throws IOException{
		ServerSocket serverSocket = new ServerSocket(1993);
		
		Socket socket = serverSocket.accept();
		
		MyChannel channel = new MyChannel(socket);
		list.add(channel);
		new Thread(channel).start();;
	}
	
	private class MyChannel implements Runnable{

		private DataInputStream dis;
		private DataOutputStream dos;
		private boolean isRunning = true ;
		
		
		public MyChannel(Socket client) {
			try {
				dis = new DataInputStream(client.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
				Util.close(dis);
			}
		}

		
		private void send(String msg){
			if(null == msg || msg.equals("")){
				return;
			}
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				e.printStackTrace();
				
				isRunning = false;
				Util.close(dis);
				list.remove(this);
			}
		}
		public String receive(){
			String msg = "";
			try {
				dis.readUTF();
			} catch (IOException e) {
				e.printStackTrace();
				isRunning = false;
				Util.close(dis);
			}
			return msg;
		}

		private void sendOthers(){
			String msg = receive();
			for(MyChannel other : list){
				if(other == this){
					continue;
				}
				//发送个其他客户端
				other.send(msg);
			}
		}
		
		@Override
		public void run() {
			while(isRunning){
				//send(receive());
				sendOthers();
			}
		}
		
	}

}
