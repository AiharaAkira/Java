package com.study;

public class HospitalMain {

	public static void main(String[] args) {

		Hospital hosp = new Hospital();
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		
		hosp.inject(cat);
		hosp.inject(dog);
		
	}

}
