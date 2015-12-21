package com.example.game;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.example.util.GameUtil;

/**
 * GUI變成，awt，swing
 * 
 * //无填充
 *		g.drawLine(100, 100, 200, 200);
 *		g.drawRect(100, 100, 200, 200);//矩形
 *		g.drawOval(100, 100, 200, 200);//圆
 *		
 *		//Font font = 
 *		g.drawString("123", 200,200);
 *		//填充，图
 *		g.fillRect(100, 100, 20, 20);
 *		Color c = g.getColor();
 *		g.setColor(new Color(255, 0, 0));
 *		g.fillOval(300, 300, 5,5);
 *		g.setColor(c);
 * 
 * @author 北飞的候鸟
 *
 */
public class GameFrame extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3187915630805806272L;

	private Image img = GameUtil.getImage("com/example/images/1449072742.jpg");
	
	public void launchFrame(){
		this.setBackground(Color.white);
		this.setSize(500, 500);
		this.setLocation(100,100);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	private int x = 0,y = 0;
	
	@Override
	public void paint(Graphics g) {
		
		g.drawImage(img,x,y,null);
		
		new PaintThread().start();
		
	}
	
	/**
	 * 
	 * 重新绘制界面
	 * 
	 * @author 北飞的候鸟
	 *
	 */
	class PaintThread extends Thread{
		
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
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		frame.launchFrame();
	}
}
