package com.example.plane;

import java.awt.Image;
import java.awt.Rectangle;

import com.example.constant.Constant;

/**
 * 1、物体的父类
 * 
 * @author 北飞的候鸟
 *
 */
public class GameObject {
	
	protected Image img;
	protected double x = Constant.GAME_WIDTH / 2;
	protected double y = Constant.GAME_HEIGHT / 2;
	protected double width = 4;
	protected double height = 4;
	protected double degree;
	protected int speed = 3;

	public GameObject() {
	}


	public GameObject(Image img,  double x, double y,double width, double height,double degree,int speed) {
		this.img = img;
		this.degree = degree;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
	}
	
	public Rectangle getRect() {

		Rectangle r = new Rectangle((int) x, (int) y, (int) width, (int) height);
		return r;

	}

}
