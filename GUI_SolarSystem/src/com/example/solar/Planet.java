package com.example.solar;

import java.awt.Color;
import java.awt.Graphics;

import com.example.util.ResourceUtil;

/**
 * 1������ ͼƬ�����꣬��������ĳ����Բ���У����ᣬ���ᣬ�ٶ� ����ĳ�����Ƿ���
 * 
 * @author ���ɵĺ���
 *
 */
public class Planet extends Star {

	private double longAxis;// ����
	private double shortAxis;// ����
	private double speed;
	private double degree;
	private Star center;
	private boolean isSatellite;

	public Planet(Star center, String name, String imgPath, double longAxis,
			double shortAxis, double speed) {

		super(ResourceUtil.getImage(imgPath), name);
		this.x = center.x + longAxis;
		this.y = center.y;
		this.longAxis = longAxis;
		this.shortAxis = shortAxis;
		this.speed = speed;
		this.center = center;

	}

	public Planet(Star center, String name, String imgPath, double longAxis,
			double shortAxis, double speed, boolean isSatellite) {
		this(center, name, imgPath, longAxis, shortAxis, speed);
		this.isSatellite = isSatellite;
	}

	@Override
	public void draw(Graphics g) {

		super.draw(g);
		if (!isSatellite)
			drawTrace(g);

		move();

	}

	public void drawTrace(Graphics g) {

		double _x, _y, _width, _height;

		_width = longAxis * 2;
		_height = shortAxis * 2;
		_x = center.x + center.width / 2 - longAxis;
		_y = center.y + center.height / 2 - shortAxis;

		Color c = g.getColor();
		g.setColor(Color.blue);
		g.drawOval((int) _x, (int) _y, (int) _width, (int) _height);
		g.setColor(c);

	}

	public void move() {

		x = (center.x + center.width / 2) + longAxis * Math.cos(degree);
		y = (center.y + center.height / 2) + shortAxis * Math.sin(degree);

		degree += speed;
	}
}
