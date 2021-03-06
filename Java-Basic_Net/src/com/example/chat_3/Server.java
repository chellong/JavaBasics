package com.example.chat_3;

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
		private String name;
		private boolean isRunning = true ;
		
		
		public MyChannel(Socket client) {
			try {
				dis = new DataInputStream(client.getInputStream());
				dos = new DataOutputStream(client.getOutputStream());
				
				this.name = dis.readUTF();
				this.send("欢迎进进入聊天室");
				this.send(this.name + "进入聊天室");
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

		private void sendOthers(String msg) {
			System.out.println(msg);
			if (msg.startsWith("@") && msg.indexOf(":") > -1) {// 私聊
				//获取name
				String name = msg.substring(1,msg.indexOf(":"));
				String content = msg.substring(msg.indexOf(":") +1);
				for (MyChannel other : list) {
					if(other.name.equals(name)){
						other.send(this.name + "对您悄悄的说" + content);
					}
				}
			} else {

				for (MyChannel other : list) {
					if (other == this) {
						continue;
					}
					// 发送个其他客户端
					other.send(this.name + "對所有人說" + msg);
				}
			}
		}
		
		@Override
		public void run() {
			while(isRunning){
				//send(receive());
				sendOthers(receive());
			}
		}
		
	}

}
