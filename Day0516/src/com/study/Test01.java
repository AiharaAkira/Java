package com.study;

 class AAA{
	
	int a = 0;
	static int b = 0;
	
}
 
class Car{
	 String color;
	 int speed;
	 
	 void upSpeed(int value) {
		 speed += value;
	 }
	 
	 void downSpeed(int value) {
		 speed -= value;
	 }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	 
	 
	 
 }

public class Test01 {
	
	public static void main(String[] args) {

		AAA a = new AAA();
		System.out.println(a.a);
		System.out.println(AAA.b);
		
		System.out.println("---------------------------");
		Car myCar = new Car();
		myCar.speed = 0;
		//속도증가
		myCar.upSpeed(30);
		myCar.downSpeed(10);
		myCar.setColor("보라색");
		System.out.println("차량색: "+myCar.getColor());
		System.out.println("차량 속도:"+myCar.getSpeed());
		
	}
	
}
