package com.example.util;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.example.constant.Constant;

public class MyFrame1 extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 455151721946405263L;
	private Image offScreenImage = null;
	
	public void launchFrame() {

		this.setBackground(Color.white);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(100, 100);
		this.setResizable(false);
		this.addListener();
		this.setLocationRelativeTo(null);
		// 设置可显示
		this.setVisible(true);
		// 动画
		new PaintThread().start();

	}

	private void addListener() {

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	@Override
	public void update(Graphics g) {
		if(offScreenImage == null){
			offScreenImage = this.createImage(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);  
		}
		Graphics gOffScreen = this.offScreenImage.getGraphics();
		Color c = gOffScreen.getColor();
        gOffScreen.setColor(Color.WHITE);
        gOffScreen.fillRect(0, 0,Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
        gOffScreen.setColor(c);
        //4.调用paint(),将缓冲图象的画笔传入
        paint(gOffScreen);
        //5.再将此缓冲图像一次性绘到代表屏幕的Graphics对象，即该方法传入的“g”上
        g.drawImage(offScreenImage, 0, 0, null);  
	}
	 
	/**
	 * 每个一定时间重新绘制界面
	 * 
	 * @author 北飞的候鸟
	 *
	 */
	class PaintThread extends Thread {

		@Override
		public void run() {
			while (true) {
				repaint();
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
