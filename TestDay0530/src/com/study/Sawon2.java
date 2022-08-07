package com.study;

public class Sawon2 {
	
	String name;
	String dept;
	int salary;
	
	
	public Sawon2() {
		
	}
	
	
	public Sawon2(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	public String displayInfo() {
		
		return "이름: " + name + ", 부서: " + dept +"salary: " + salary;
		
	}
	
	
	
}
