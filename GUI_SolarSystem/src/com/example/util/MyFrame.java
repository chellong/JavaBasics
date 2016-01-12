package com.example.util;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.example.constant.Constant;

public class MyFrame extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 455151721946405263L;

	public void launchFrame() {

		this.setBackground(Color.white);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		this.setLocation(100, 100);
		this.setResizable(false);
		this.addListener();
		this.setLocationRelativeTo(null);
		//设置可显示
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
					Thread.sleep(80);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
