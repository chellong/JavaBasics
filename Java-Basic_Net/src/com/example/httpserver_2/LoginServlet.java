package com.example.httpserver_2;

public class LoginServlet extends Servlet{

	@Override
	public void doGet(Request request, Respond respond) throws Exception {
		
		String name = request.getParameter("name");
		String pwd  = request.getParameter("pwd"); 
		
		if(login(name,pwd)){
			respond.print("");
		}else{
			respond.print("没有这个用户");
		}
	}

	@Override
	public void doPost(Request request, Respond respond) throws Exception {
		
	}
	
	
	public boolean login(String name,String pwd){
		return name.equals("123") && pwd.equals("123");
	}

}
