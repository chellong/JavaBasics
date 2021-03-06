package com.example.httpserver_1;

import java.io.IOException;
import java.net.Socket;

/**
 * 一个请求生成一个此对象
 * 
 * @author 北飞的候鸟
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
			 * 正常分发
			 */
			
			request.pushToClient(code);//
		
		}catch(Exception e){
			/**
			 * 发生异常
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
