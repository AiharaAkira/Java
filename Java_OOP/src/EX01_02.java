class Car2 {
	String color;
	int speed;//��������
	public int getSpeed() {
		return speed;
	}

	void upSpeed(int value) {
		speed += value;
	}

	void downSpeed(int value) {
		speed -= value;
	}
	
	public String getColor() {
		return color;
	}
	
	
}

public class EX01_02 {
	
	public static void main(String[] args) {
		int speed;//��������
		// Ŭ����(���赵) ����
		Car2 mycar1 = new Car2();
		// �ڵ���
		mycar1.color = "red";
		mycar1.speed = 0;
		
		System.out.println(mycar1.getColor());
		System.out.println(mycar1.getSpeed());
		
		
		
	
		
		
	}
}
