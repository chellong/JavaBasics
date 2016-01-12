package com.example.solar;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import com.example.constant.Constant;
import com.example.util.MyFrame;
import com.example.util.ResourceUtil;

public class SolarFrame extends MyFrame {

	/**
	 * 
	 * 圖片地址全為空
	 * 
	 * 畫小點
	 */
	private static final long serialVersionUID = 8252689854938965802L;
	
	private Image bg = ResourceUtil.getImage("com.example.images");
	
	private Star sun = new Star("com.example.images","sun",Constant.GAME_WIDTH / 2, Constant.GAME_HEIGHT / 2);
	private Planet mercury = new Planet(sun,"水星", "com.example.images",20, 16, 0.7);
	private Planet venus = new Planet(sun,"金星", "com.example.images",40, 28, 0.4);
	private Planet earth = new Planet(sun,"地球", "com.example.images",90,66, 0.3);
	private Planet moon = new Planet(earth,"月亮", "com.example.images",30,20 , 0.2,true);
	private Planet mars = new Planet(sun,"火星", "com.example.images",150, 100, 0.2);
	private Planet jupiter = new Planet(sun,"木星", "com.example.images",196, 150, 0.15);
	private Planet saturn = new Planet(sun,"土星", "com.example.images",230, 190, 0.1);
	private Planet uranus = new Planet(sun,"天王星", "com.example.images",260, 216, 0.09);
	private Planet neptune = new Planet(sun,"海王星", "com.example.images",300, 276, 0.06);
	private Planet pluto = new Planet(sun,"冥王星", "com.example.images",320, 298, 0.01);
	
	@Override
	public void paint(Graphics g) {
		if( bg != null){
			g.drawImage(bg,0,0,null);
		}else{
			setBackground(new Color(199,237,204));
		}
		this.sun.draw(g);
		this.mercury.draw(g);
		this.venus.draw(g);
		this.earth.draw(g);
		this.moon.draw(g);
		this.mars.draw(g);
		this.jupiter.draw(g);
		this.saturn.draw(g);
		this.uranus.draw(g);
		this.neptune.draw(g);
		this.pluto.draw(g);
		
	}
	
	public static void main(String[] args) {
		
		SolarFrame frame = new SolarFrame();
		frame.launchFrame();
	}

}
