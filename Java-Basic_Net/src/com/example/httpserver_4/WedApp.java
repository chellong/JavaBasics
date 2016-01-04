package com.example.httpserver_4;

import java.util.Map;

public class WedApp {
	
	
	private static ServletContext context;
	
	static {
		
		context = new ServletContext();
		
		Map<String,String> mapping = context.getMapping();
		mapping.put("/login", "login");
		mapping.put("/reg", "register");
		
		
		Map<String,String> servlet = context.getServlet();
		servlet.put("login","com.example.httpserver_3.LoginServlet");
		servlet.put("register","com.example.httpserver_3.RegServlet" );
		
	}
	
	public static Servlet getServlet(String url) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		if((null == url) || (url = url.trim()).equals("")){
			return null;
		}
		
		String path = context.getServlet().get(context.getMapping().get(url));
		
		/**
		 * 确保空构造存在
		 */
		return (Servlet)Class.forName(path).newInstance() ;
	}

}