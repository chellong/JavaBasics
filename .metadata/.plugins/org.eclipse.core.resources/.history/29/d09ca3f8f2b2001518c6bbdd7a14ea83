package com.example.httpserver_3;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	private ServerSocket serverSocket;
	
	private boolean isShutDown = false;

	
	
	public Server() {
	
	}
	
	public void start() {
		
		this.start(8080);
	}

	public void start(int port) {
		try {
			
			serverSocket = new ServerSocket(port);
			this.recive();
		} catch (IOException e) {
			
			e.printStackTrace();
			stop();
		}
	}

	/**
	 * 
	 * 接收客户端
	 * 
	 */
	public void recive() {
		
		try {
			/**
			 * 
			 * 创建分发线程
			 * 
			 */
			while(!this.isShutDown){
				
				new Thread(new Dispatcher(serverSocket.accept())).start();
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}

	/**
	 * 停止服务
	 */
	public void stop() {
		
		isShutDown = true;
		Util.closeServerSocket(serverSocket);
	}

}
