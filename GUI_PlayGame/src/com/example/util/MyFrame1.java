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
		// ���ÿ���ʾ
		this.setVisible(true);
		// ����
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
        //4.����paint(),������ͼ��Ļ��ʴ���
        paint(gOffScreen);
        //5.�ٽ��˻���ͼ��һ���Ի浽������Ļ��Graphics���󣬼��÷�������ġ�g����
        g.drawImage(offScreenImage, 0, 0, null);  
	}
	 
	/**
	 * ÿ��һ��ʱ�����»��ƽ���
	 * 
	 * @author ���ɵĺ���
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