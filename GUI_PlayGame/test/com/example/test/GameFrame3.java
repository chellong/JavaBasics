package com.example.test;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class GameFrame3 extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3187915630805806272L;

	public void launchFrame(){
		this.setBackground(Color.white);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		
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
	
	private int x = 10,y = 25;
	private double degree = 3.14 / 3;
	private double speed = 10;
	
	@Override
	public void paint(Graphics g) {
		
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillOval(x, y, 6, 6);
		g.fillOval(x, y, 6, 6);
		g.fillOval(x, y, 6, 6);
		g.fillOval(x, y, 6, 6);
		g.fillOval(x, y, 6, 6);
		g.setColor(c);
		x += speed * Math.cos(degree);
		y += speed * Math.sin(degree);
		
		if(y > 500 - 10 || y < 25){
			degree = - degree;
		}
		if(x > 500 - 10 ||x < 10){
			degree = Math.PI - degree;
		}
	}
	
	class PaintThread extends Thread{
		
		@Override
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(8);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		
		GameFrame3 frame = new GameFrame3();
		frame.launchFrame();
	}
}
