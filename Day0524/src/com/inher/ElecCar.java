package com.inher;

public class ElecCar {

	double distance;
	int battery;
	
	public ElecCar() {

		this.distance = 0;
		this.battery = 100;
	}
	//주행거리
	public void dispDistance() {
		System.out.println("주행거리: "+distance+"km");
	}
	
	//배터리백분율
	public void dispBattery() {
		System.out.println("배터리: "+battery+"%");
	}
	
	public void drive() {
		distance += 1;
		battery -= 10;
	}
	public static ElecCar getInstance() {
		return new ElecCar();
	}
	
}
