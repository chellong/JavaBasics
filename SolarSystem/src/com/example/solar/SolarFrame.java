package com.example.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.example.util.MyFrame;
import com.example.util.ResourceUtil;

public class SolarFrame extends MyFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8252689854938965802L;
	
	private Image bg = ResourceUtil.getImage("");
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(bg,0,0,null);
	}
	
	public static void main(String[] args) {
		
		SolarFrame frame = new SolarFrame();
		frame.launchFrame();
	}

}
