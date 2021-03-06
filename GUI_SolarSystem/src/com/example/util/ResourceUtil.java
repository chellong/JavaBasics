package com.example.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
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
			return img;
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("没有获取到图片");
			return null;
		}finally{
			url = null;
		}
		
	}

}
