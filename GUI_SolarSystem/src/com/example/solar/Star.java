package com.example.solar;

import java.awt.Graphics;
import java.awt.Image;

import com.example.util.ResourceUtil;

public class Star {
	
	protected String name;
	protected Image img;
	protected double x;
	protected double y;
	int width;
	int height;
	
	public Star() {
	}
	
	public Star(Image img,String name) {
		
		this.img = img;
		this.name = name;
		
		if(img != null){
			this.width = img.getWidth(null);
			this.height = img.getHeight(null);
		}else{
			this.width = 10; 
			this.height = 10; 
		}
	}
	
	public Star(Image img,String name,double x,double y){
		
		this(img,name);
		this.x = x;
		this.y = y;
		
	}
	
	public Star(String imgPath,String name,double x,double y){
		
		this(ResourceUtil.getImage(imgPath),name,x,y);
	}
	
	public void draw(Graphics g){
		if(img != null){
			g.drawImage(img, (int)x,(int)y,null);
		}else{
			g.fillOval((int)x, (int)y, 10, 10);
			g.drawString(name,(int) x,(int)y);
		}
	}
}
