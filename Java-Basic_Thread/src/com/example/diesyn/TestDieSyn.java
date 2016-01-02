package com.example.diesyn;

/**
 * 过多的加锁会造成死锁
 * 
 * @author 北飞的候鸟
 *
 */
public class TestDieSyn {

	public static void main(String[] args) {
		
		//Test test= new Test();
		//Thread t = new Thread(test);
		//t.start();
		
		Object goodls = new Object();
		Object moneys = new Object();
		
		Test_ test_= new Test_(goodls, moneys);
		Test_1 test_1 = new Test_1(goodls, moneys);
		
		Thread t = new Thread(test_);
		t.start();
		
		Thread t1 = new Thread(test_1);
		t1.start();
		
	
	}
	
}

class Test implements Runnable{
	
	Object goodls = new Object();
	Object moneys = new Object();
	
	
	@Override
	public void run() {
		while (true) {
			test();
		}
	}
	
	public void test(){
		
		synchronized (goodls) {
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		synchronized (moneys){
			
		}
		
		System.out.println("一手给钱");
	
	}
}

class Test_ implements Runnable{
	
	Object goodls = null;
	Object moneys = null;
	
	
	
	public Test_(Object goodls, Object moneys) {
		this.goodls = goodls;
		this.moneys = moneys;
	}

	@Override
	public void run() {
		while (true) {
			test();
		}
	}
	
	public void test(){
		
		synchronized (goodls) {
		
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		synchronized (moneys){
			
		}
		
		System.out.println("一手给钱");
	
	}
}

class Test_1 implements Runnable{
	
	Object goodls = null;
	Object moneys = null;
	
	
	
	public Test_1(Object goodls, Object moneys) {
		this.goodls = goodls;
		this.moneys = moneys;
	}

	@Override
	public void run() {
		while (true) {
			test();
		}
	}
	
	public void test(){
		
		synchronized (moneys) {
		
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		synchronized (goodls){
			
		}
		
		System.out.println("一手给钱");
	
	}
}