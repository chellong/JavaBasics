package com.example.testexception;

/**
 * 1、Throwable
 *  --Error 
 *  --Exception {checkedException && uncheckedExcrption} 
 * 
 * 
 * 2、空指針先用判斷是否為空
 * 
 * 3、子类不能超过父类的范围
 * 
 * @author 北飞的候鸟
 *
 */
public class Test {

	
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// uncheckedExcrption
		try {
			int i = 6 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("除数为'0'");
		}
		// checkedException
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//空指針用判斷不能補貨
		TestClass testClass = null;
		if(testClass != null){
			testClass.start();
		}else{
			return;
		}

	}

	class TestClass {
		public void start() {
			System.out.println("start");
		}
	}
}
