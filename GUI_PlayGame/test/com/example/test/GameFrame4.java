package com.example.test;

import java.awt.Graphics;

import com.example.util.MyFrame;

public class GameFrame4 extends MyFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8817503736712929333L;
	private double x = 10;
	private double y = 25;
	private double degree = 3.14 / 3;
	
	@Override
	public void paint(Graphics g) {
		
		g.drawOval((int)x,(int)y, 6, 6);
		x = 100 + 100 * Math.cos(degree);
		y = 200 + 50 * Math.sin(degree);
		
		degree += 0.1;
	}

	
	public static void main(String[] args) {
		GameFrame4 frame4 = new GameFrame4();
		frame4.launchFrame();
	}
}
