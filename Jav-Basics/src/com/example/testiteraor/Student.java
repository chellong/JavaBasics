package com.example.testiteraor;

public class Student {
	
	private String name;
	private int no;
	private double score;
	
	
	public Student() {
		super();
	}


	public Student(String name, int no, double score) {
		super();
		this.name = name;
		this.no = no;
		this.score = score;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}

	
	public double getScore() {
		return score;
	}



	public void setScore(double score) {
		this.score = score;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", score=" + score
				+ "]";
	}
	
	

}
