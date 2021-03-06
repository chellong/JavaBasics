package com.example.test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GameFrame2 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3187915630805806272L;

	public void launchFrame(){
		this.setBackground(Color.white);
		this.setSize(500, 500);
		this.setLocation(100,100);
		this.setVisible(true);
		//����
		new PaintThread().start();

		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
	
	private int x = 0,y = 0;
	private boolean left = false;
	private boolean up = false; 
	
	@Override
	public void paint(Graphics g) {
		
		g.fillOval(x, y, 10, 10);
		if(left){
			x --;
		}else{
			x ++;
		}
		if(x > 500 - 10){
			left = true;
		}
		if(x < 0){
			left = false;
		}
		if(up){
			y --;
		}else{
			y ++;
		}
		if(y > 500 - 10){
			up = true;
		}
		if(y < 0){
			up = false;
		}
	}
	
	class PaintThread extends Thread{
		
		@Override
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(4);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		
		GameFrame2 frame = new GameFrame2();
		frame.launchFrame();
	}
}
