package com.example.httpserver_2;

import java.util.Map;

public class WedApp {
	
	
	private static ServletContext context;
	
	static {
		
		context = new ServletContext();
		
		Map<String,String> mapping = context.getMapping();
		mapping.put("/login", "login");
		mapping.put("/reg", "register");
		
		
		Map<String,Servlet> servlet = context.getServlet();
		servlet.put("login",new LoginServlet() );
		servlet.put("register",new RegServlet() );
		
	}
	
	public static Servlet getServlet(String url){
		
		if((null == url) || (url = url.trim()).equals("")){
			return null;
		}
		
		return context.getServlet().get(context.getMapping().get(url));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
