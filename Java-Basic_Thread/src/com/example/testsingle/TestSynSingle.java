package com.example.testsingle;

public class TestSynSingle {

	private static TestSynSingle instance = null;

	private TestSynSingle() {

	}

	/**
	 * 加入同步锁
	 * 
	 * @return
	 */
	public static /* synchronized */ TestSynSingle getInstance() {

		/**
		 * 加锁方法块，第一次进入的时候等待
		 * 
		 * 在存在对象的时候不等待
		 * 
		 * 双重检测，提高对已存在对象的效率
		 */

		if (instance == null) {
			synchronized (TestSynSingle.class) {
				if (instance == null) {
					/**
					 * 放大发生的概率
					 */
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance = new TestSynSingle();
				}
			}
		}
		return instance;
	}

	public void print() {
		System.out.println("single dog ");
	}

}

/**
 * 可能发生错误
 * 
 * @author 北飞的候鸟
 *
 */

class TestSingleclz {

	private static TestSingleclz instance = null;

	private TestSingleclz() {

	}

	public static TestSingleclz getInstance() {
		if (instance == null) {
			/**
			 * 放大概率的时间
			 */
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			instance = new TestSingleclz();
		}
		return instance;
	}

	public void print() {
		System.out.println("single dog ");
	}
}
