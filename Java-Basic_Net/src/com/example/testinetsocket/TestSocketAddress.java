package com.example.testinetsocket;

import java.net.InetSocketAddress;

public class TestSocketAddress {

	public static void main(String[] args) {
		
		InetSocketAddress a = new InetSocketAddress("127.0.0.1", 1993);
		
		System.out.println(a.getHostName());
		System.out.println(a.getPort());
		System.out.println(a.getAddress());
		System.out.println(a.getHostString());
	}
}
