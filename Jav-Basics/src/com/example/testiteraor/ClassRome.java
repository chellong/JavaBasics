package com.example.testiteraor;

import java.util.ArrayList;
import java.util.List;

public class ClassRome {
	
	private String no;
	private List<Student> stus;
	private double total;
	
	
	public ClassRome() {
		stus = new ArrayList<Student>();
	}
	
	
	public ClassRome(String no) {
		this();
		this.no = no;
	}
	
	
	public ClassRome(String no, List<Student> stus, double total) {
		super();
		this.no = no;
		this.stus = stus;
		this.total = total;
	}
	
	
	public String getNo() {
		return no;
	}
	
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public List<Student> getStus() {
		return stus;
	}
	
	public void setStus(List<Student> stus) {
	
		this.stus = stus;
	}
	
	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "ClassRome [no=" + no + ", stus=" + stus + ", total=" + total
				+ "]";
	}
	
	
}
