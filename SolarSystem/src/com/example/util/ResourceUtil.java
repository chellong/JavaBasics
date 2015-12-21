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
public class ResourceUtil {
	
	/**
	 * 
	 * Util经常把构造方法私有
	 *
	 */
	private ResourceUtil(){
		
	}
	
	public static Image getImage(String path){
		
		URL url = ResourceUtil.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		try {
			img = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return img;
		
	}

}
