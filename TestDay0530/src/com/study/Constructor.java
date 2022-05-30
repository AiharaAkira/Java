package com.study;

class Person{
	int age;
	int  weight;
	int height;
	String name;
	
	public Person() {
	}
	public Person(int age) {
		this.age = age;
	}
	public Person(int age, int weight, int height, String name) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
	
	public Person(int age, int weight) {
		super();
		this.age = age;
		this.weight = weight;
		
	}
	
	
	public Person(int age, int weight, int height) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
		
	}
	
	
	public void info() {
		System.out.println("---------------");
		System.out.println(name);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(height);
	}
	
	
	
}


public class Constructor {

	public static void main(String[] args) {
		
		Person p = new Person(1,1,1,"¿Ã∏ß");
		p.info();
		
		Person p1 = new Person(1,1,1);
		p1.info();
		
		Person p2 = new Person(1,1);
		p2.info();
		
		Person p3 = new Person(1);
		p3.info();
		
		
	}
	
}
