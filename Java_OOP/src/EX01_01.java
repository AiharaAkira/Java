class Car {
	String color;
	int speed;//��������
	//���ڸ� ������ �� ���ڷ� �ӵ��� �������ִ� �޼���
	void upSpeed(int value) {
		speed += value;
	}

	void downSpeed(int value) {
		speed -= value;
	}
}

public class EX01_01 {
	
	public static void main(String[] args) {
		int speed;//��������
		// Ŭ����(���赵) ����
		Car mycar1 = new Car();
		// �ڵ���
		mycar1.color = "red";
		mycar1.speed = 0;
		
		Car mycar2 = new Car();
		// �ڵ���
		mycar2.color = "blue";
		mycar2.speed = 0;
		
		Car mycar3 = new Car();
		// �ڵ���
		mycar3.color = "yello";
		mycar3.speed = 0;
		
		mycar1.upSpeed(30000);
		System.out.println("�ڵ��� 1 ���� : " + mycar1.color );
		System.out.println("�ڵ��� 1 �ӵ� : " + mycar1.speed);
		
		mycar2.upSpeed(60);
		System.out.println("�ڵ��� 2 ���� : " + mycar2.color );
		System.out.println("�ڵ��� 2 �ӵ� : " + mycar2.speed);
		
		
		mycar3.upSpeed(0);
		System.out.println("�ڵ��� 3 ���� : " + mycar3.color );
		System.out.println("�ڵ��� 3 �ӵ� : " + mycar3.speed);
		
		
	}
}
