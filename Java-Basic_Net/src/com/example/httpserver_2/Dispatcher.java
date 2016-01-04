package com.example.httpserver_2;

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


		try{
			
			/**
			 * �����ַ�
			 */
			
			Servlet serv = WedApp.getServlet(request.getUrl());
			if(serv == null){
				this.code = 404;//�Ҳ�����Ӧ����Դ
			}else{
				
				serv.service(request, respond);
			}
			request.pushToClient(code);//���͵��ͻ���
		
		}catch(Exception e){
			/**
			 * �����쳣
			 */
			try{
				this.code = 500;
				request.pushToClient(code);//
			
			}catch(Exception e1){
				e1.printStackTrace();
			}
			
			Util.closeSocket(client);
		}
		
		Util.closeSocket(client);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}