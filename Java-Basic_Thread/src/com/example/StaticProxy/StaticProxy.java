package com.example.StaticProxy;

/**
 * ¾²Ì¬´úÀí
 * 
 * @author ±±·ÉµÄºòÄñ
 *
 */
public class StaticProxy {

	public static void main(String[] args) {
		
		You you = new You();
		Marry mar = new WeddingCompan(you);
		
		mar.marry();
	}
}

interface Marry{
	public abstract void marry();
}

class You implements Marry{

	@Override
	public void marry() {
		System.out.println("you");
	}
}

class WeddingCompan implements Marry{

	private Marry you;
	
	
	
	public WeddingCompan() {
		super();
	}

	
	


	public WeddingCompan(Marry you) {
		this.you = you;
	}


	private void before(){
		System.out.println("Çë¼í");
	}
	
	private void after(){
		System.out.println("arter");
	}


	@Override
	public void marry() {
		before();
		you.marry();
		after();
	}
	
}








