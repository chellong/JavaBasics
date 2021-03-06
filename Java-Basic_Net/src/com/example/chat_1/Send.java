package com.example.chat_1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Send implements Runnable{

	/**
	 * 控制台输入流
	 */
	private BufferedReader console;
	/**
	 * 输出流
	 */
	private DataOutputStream dos;
	private boolean isRunning = true;
	
	public Send() {
		this.console = new BufferedReader(new InputStreamReader(System.in));
	}


	public Send(Socket client) {
		this();
		try {
			dos = new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
			isRunning = false;
			Util.close(dos,console);
		}
	}
	
	private String getMsgFromConsole(){
		try {
			return console.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	/**
	 * 从控制台接受
	 */
	public void send(){
		String msg = getMsgFromConsole();
		if(null != 	msg && !msg.equals("")){
			try {
				dos.writeUTF(msg);
				dos.flush();
			} catch (IOException e) {
				e.printStackTrace();
				isRunning = false;
				Util.close(dos,console);
			}
		}
	}

	@Override
	public void run() {
		while(isRunning){
			send();
		}
	}

}
