class Car06 {

	// ����ȭ

	private int speed;// ��������
	private String color;
	
	public Car06() {	// ������
		color = " ���� ";
		speed = 0;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

public class EX01_06 {

	public static void main(String[] args) {
		Car06 mycar2 = new Car06();
		Car06 mycar1 = new Car06();
		
		System.out.println("�ڵ��� 1 : " + mycar1.getColor() + " �ӵ��� :" + mycar1.getSpeed());
		System.out.println("�ڵ��� 2 : " + mycar2.getColor() + " �ӵ��� :" + mycar2.getSpeed());

	}
}
