package com.inher;

public class ElecCar {

	double distance;
	int battery;
	
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
		System.out.println("���͸�: "+battery+"%");
	}
	
	public void drive() {
		distance += 1;
		battery -= 10;
	}
	public static ElecCar getInstance() {
		return new ElecCar();
	}
	
}
