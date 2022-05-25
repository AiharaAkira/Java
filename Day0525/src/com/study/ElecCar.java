package com.study;

public class ElecCar {

	private double distance;
	private int battery;
	
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
		if(battery == 0) {
			
			System.out.println("배터리가 없습니다. 충전하세요");
			
		}else {

			System.out.println("배터리: "+battery+"%");
			
		}
		
	}
	
	public void drive() {
	
		if(battery != 0) {
			
			distance += 1;
			battery -= 10;
			
		}else {
			
			System.out.println("배터리가 없습니다.");
		
		}
		
	
	}
	
	public static ElecCar getInstance() {
	
		return new ElecCar();
	
	}
	
}
