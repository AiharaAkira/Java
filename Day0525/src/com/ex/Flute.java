package com.ex;

public class Flute extends Instrument {

	@Override
	public void play() {
		System.out.println("Flute play()ȣ���");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("Flute VolumeDown()ȣ���");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("Flute VolumeUp()ȣ���");
		
	}
	
	
}
