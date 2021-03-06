package com.example.testinet;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Test {

	public static void main(String[] args) {
		
		try {
			Inet4Address i = (Inet4Address) Inet4Address.getLocalHost();
			
			String hostAddress = i.getHostAddress();
			byte[] address = i.getAddress();
			String hostName = i.getHostName();
			String canonicalHostName = i.getCanonicalHostName();
			
			
			System.out.println(hostAddress);
			System.out.print(new String(address));
			System.out.println(hostName);
			System.out.println(canonicalHostName);
		
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
