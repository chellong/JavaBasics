package com.example.plane;

import java.awt.Color;
import java.awt.Graphics;

import com.example.constant.Constant;

public class Bullet extends GameObject{


	public Bullet() {
		degree = Math.random() * Math.PI * 2;
	}


	public void draw(Graphics g) {

		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillOval((int) x, (int) y, (int) width, (int) height);
		g.setColor(c);

		x += speed * Math.cos(degree);
		y += speed * Math.sin(degree);

		if (y > Constant.GAME_HEIGHT - 10 || y < 25) {
			degree = -degree;
		}
		if (x > Constant.GAME_WIDTH - 10 || x < 10) {
			degree = Math.PI - degree;
		}
	}
	
	public void drawForExplode(Graphics g) {

		Color c = g.getColor();
		g.setColor(Color.blue);
		g.fillOval((int) x, (int) y, (int) width, (int) height);
		g.setColor(c);

		x += speed * Math.cos(degree);
		y += speed * Math.sin(degree);

		width  -= 0.2;
		height -= 0.2;
	}
}
