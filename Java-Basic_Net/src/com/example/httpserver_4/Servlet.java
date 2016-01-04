package com.example.httpserver_4;


public abstract class Servlet {
	
	public void service(Request request, Respond respond) throws Exception {
		
		this.doGet(request,respond);
		this.doPost(request,respond);
		
	}
	
	public abstract void doGet(Request request, Respond respond) throws Exception;
	public abstract void doPost(Request request, Respond respond) throws Exception;

}
