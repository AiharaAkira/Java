package com.ex;

//�߻� Ŭ������ ��ӹ޾� �����ϴ� ����ü(����Ŭ����)
public class Piano extends Instrument{
	
	@Override
	public void play() {
		System.out.println("Piano play()ȣ���");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("Piano VolumeDown()ȣ���");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("Piano VolumeUp()ȣ���");
	}
	
}
