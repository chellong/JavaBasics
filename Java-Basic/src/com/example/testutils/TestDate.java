package com.example.testutils;

import java.util.Date;

/**
 * 在计算机中时间也是数字
 * 
 * 标准纪元1970.1.1丶0点开始到某个时刻的毫秒数
 * 
 * 类型是long
 * 
 * 这样用long可以表示约1亿年+的时间
 * 
 * @author 北飞的候鸟
 *
 */
public class TestDate {
	
	public static void main(String[] args) {
		
		long star = System.currentTimeMillis();
		Date time = new Date(star);
		
		System.out.println(time.getTime() == star);
	}
}
