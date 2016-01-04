package com.example.httpserver_1;

import java.io.IOException;
import java.net.Socket;

/**
 * һ����������һ���˶���
 * 
 * @author ���ɵĺ���
 *
 */
public class Dispatcher implements Runnable {
	
	private Socket  client;
	private Request request;
	private Respond respond;
	
	private int code;
	
	Dispatcher(Socket  client){
		
		 this.client = client;
		 try {
			request = new Request(client.getInputStream());
			respond = new Respond(client.getOutputStream());

		 
		 } catch (IOException e) {
			e.printStackTrace();
			code = 500;
			return;
		}
	}

	@Override
	public void run() {

		Servlet serv = new Servlet();
		serv.service(request, respond);

		try{
			
			/**
			 * �����ַ�
			 */
			
			request.pushToClient(code);//
		
		}catch(Exception e){
			/**
			 * �����쳣
			 */
			try{
				request.pushToClient(code);//
			
			}catch(Exception e1){
				e1.printStackTrace();
			}
			
			Util.closeSocket(client);
		}
		
		Util.closeSocket(client);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}