package com.example.commons;

public class Employee {

	private String name;
	private String salary;

	//ALT + /
	public Employee() {
	}

	//ALT + SHIFT + S + O
	public Employee(String name, String salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", salary=" + salary + "]";
	}
}