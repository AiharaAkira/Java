class Car07 {

	// ����ȭ

	private int speed;// ��������
	private String color;
	
	public Car07() {
		
	}
	
	
	public Car07(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
	}

	
	public int getSpeed() {
		return speed;
	}
	public String getColor() {
		return color;
	}
}

public class EX01_07 {

	public static void main(String[] args) {
		Car07 mycar2 = new Car07(0,"����");
		Car07 mycar1 = new Car07(0,"�Ķ�");
		
		System.out.println("�ڵ��� 1 : " + mycar1.getColor() + " �ӵ��� :" + mycar1.getSpeed());
		System.out.println("�ڵ��� 2 : " + mycar2.getColor() + " �ӵ��� :" + mycar2.getSpeed());

	}
}
