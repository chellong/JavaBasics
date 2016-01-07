package com.example.testjavassist;

public class Entity {

	private String ename;
	private String empno;
	
	
	public void sayHello(int d){
		System.out.println(d);
	}
	
	public Entity() {
	}
	
	
	
	public Entity(String ename, String empno) {
		super();
		this.ename = ename;
		this.empno = empno;
	}



	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	@Override
	public String toString() {
		return "Entity [ename=" + ename + ", empno=" + empno + "]";
	}
	
}
