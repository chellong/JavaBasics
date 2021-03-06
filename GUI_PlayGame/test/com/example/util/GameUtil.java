package com.example.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

/**
 * 
 * @author 北飞的候鸟
 *
 */
public class GameUtil {
	
	/**
	 * 
	 * Util经常把构造方法私有
	 *
	 */
	private GameUtil(){
		
	}
	
	public static Image getImage(String path){
		
		URL url = GameUtil.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		try {
			img = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return img;
		
	}

}
