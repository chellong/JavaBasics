package com.example.pattern;

/**
 * 类与类之间的关系
 * 
 * 依赖
 * 关联：
 * 		属性
 * 			聚合：属性整体与部分，不一致的生命周期 人与手
 * 			组合：属性整体与部分，一致的生命周期   人与大脑
 * 继承：父子类关系
 * 实现：借口和实现类之间的关系
 * 
 * @author 北飞的候鸟
 *
 */
public class Demo01 {
	
	public static void main(String[] args) {
		
		Voice voice = new Voice(10);
		voice.say();
		Amplifier a = new Amplifier(voice);
		a.say();
	}

}
