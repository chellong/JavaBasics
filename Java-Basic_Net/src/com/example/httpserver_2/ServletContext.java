package com.example.httpserver_2;

import java.util.HashMap;
import java.util.Map;

public class ServletContext {
	
	//為每個servlet去一个别名
	private Map<String,Servlet> servlet;
	
	//url---->login
	private Map<String,String> mapping;
	

	public ServletContext() {
	
		servlet = new HashMap<String,Servlet>();
		mapping = new HashMap<String,String>();
	}

	public ServletContext( Map<String, String> mapping , Map<String, Servlet> servlet) {
		this.servlet = servlet;
		this.mapping = mapping;
	}

	public Map<String, Servlet> getServlet() {
		return servlet;
	}

	public void setServlet(Map<String, Servlet> servlet) {
		this.servlet = servlet;
	}

	public Map<String, String> getMapping() {
		return mapping;
	}

	public void setMapping(Map<String, String> mapping) {
		this.mapping = mapping;
	}
	
}
