package com.inher;

public class ElecMain {

	public static void main(String[] args) {


		ElecCar car = ElecCar.getInstance();
		
		car.drive();
		car.dispDistance();
		car.dispBattery();
		
		
	}

}
