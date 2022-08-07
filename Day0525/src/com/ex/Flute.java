package com.ex;
	
public class Flute extends Instrument {
	
	@Override
	public void play() {
		//인스턴스 메소드
		System.out.println("Flute play()호출됨");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("Flute VolumeDown()호출됨");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("Flute VolumeUp()호출됨");
		
	}
	
	
}
