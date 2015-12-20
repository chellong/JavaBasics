package com.example.game;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * GUI׃�ɣ�awt��swing
 * 
 * @author ���ɵĺ���
 *
 */
public class GameFrame extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3187915630805806272L;

	//Image img = GameUtil.getImage("images/1449072742.jpg");
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
	
	@Override
	public void paint(Graphics g) {
		
		//�����
		g.drawLine(100, 100, 200, 200);
		g.drawRect(100, 100, 200, 200);//����
		g.drawOval(100, 100, 200, 200);//Բ
		
		//Font font = 
		g.drawString("123", 200,200);
		//��䣬ͼ
		g.fillRect(100, 100, 20, 20);
		Color c = g.getColor();
		g.setColor(new Color(255, 0, 0));
		g.fillOval(300, 300, 5,5);
		g.setColor(c);
		
		
		//g.drawImage(img,200,200,null);
	}
	
	public static void main(String[] args) {
		
		GameFrame frame = new GameFrame();
		frame.launchFrame();
	}
}
