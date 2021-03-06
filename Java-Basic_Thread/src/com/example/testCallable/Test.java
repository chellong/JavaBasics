package com.example.testCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用callAble创建线程
 * 
 * @author 北飞的候鸟
 *
 */
public class Test {

	public static void main(String[] args) throws InterruptedException {
		//创建线程
		ExecutorService exs = Executors.newFixedThreadPool(1);
		
		Race race = new Race("123");
		race.setTime(1000);
		
		Future<Integer> resul = exs.submit(race);
		
		Thread.sleep(2000);
		race.setFlag(false);
		
		try {
			System.out.println(resul.get());
			
			exs.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
}

class Race implements Callable<Integer>{
	
	private String name ;
	private int time;
	private boolean flag = true;
	private int step = 1;
	
	public Race() {
	}

	public Race(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	@Override
	public Integer call() throws Exception {
		while(flag){
			Thread.sleep(time);
			step++;
		}
		return step;
	}
	
}
