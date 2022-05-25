package com.study;

public class ElecCar {

	private double distance;
	private int battery;
	
	public ElecCar() {

		this.distance = 0;
		this.battery = 100;
	
	}
	
	//����Ÿ�
	public void dispDistance() {

		System.out.println("����Ÿ�: "+distance+"km");
	
	}
	
	//���͸������
	public void dispBattery() {
		if(battery == 0) {
			
			System.out.println("���͸��� �����ϴ�. �����ϼ���");
			
		}else {

			System.out.println("���͸�: "+battery+"%");
			
		}
		
	}
	
	public void drive() {
	
		if(battery != 0) {
			
			distance += 1;
			battery -= 10;
			
		}else {
			
			System.out.println("���͸��� �����ϴ�.");
		
		}
		
	
	}
	
	public static ElecCar getInstance() {
	
		return new ElecCar();
	
	}
	
}
