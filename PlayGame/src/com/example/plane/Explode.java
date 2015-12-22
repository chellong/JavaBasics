package com.example.plane;

import java.awt.Graphics;
import java.awt.Image;

import com.example.util.ResourceUtil;

public class Explode {

	double x, y;
	static Image[] imags = new Image[16];
	private static boolean isImage = false;

	static {

		for (int i = 0; i < 15; i++) {
			if (ResourceUtil.getImage("" + (i + 1) + ".gif") != null) {
				imags[i] = ResourceUtil.getImage("" + (i + 1) + ".gif");
				imags[i].getWidth(null);
				isImage = true;
			} else {
				imags[i] = null;
				isImage = false;
				break;
			}
		}
	}

	public Explode(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g) {

		if (isImage) {
			for (int i = 0; i < imags.length; i++) {
				g.drawImage(imags[i], (int) x, (int) y, null);
			}
		}else{
			System.out.println("›]ÓÐ¼ÓÝdµ½ˆDÆ¬");
		}

	}
}
