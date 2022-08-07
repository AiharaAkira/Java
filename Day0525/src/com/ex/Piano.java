package com.ex;

//추상 클래스를 상속받아 구현하는 구현체(하위클래스)
public class Piano extends Instrument{
	
	@Override
	public void play() {
		System.out.println("Piano play()호출됨");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("Piano VolumeDown()호출됨");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("Piano VolumeUp()호출됨");
	}
	
}
