abstract class Car09 {
	int speed;
	String color;

	void upSpeed(int speed) {
		this.speed += speed;
	}

	abstract void work();
}

class Sedan09 extends Car09 {
//	�߻�޼��带 ���� ��ӹ޴� Ŭ�������� �ݵ�� �������̵� �ؾ���
	@Override
	void work() {
		System.out.println("�¿����� ���ä��");
	}
}

class Truck09 extends Car09 {
	@Override
	void work() {
		System.out.println("�¿����� ���ä��");

	}
}

public class Ex09 {
	public static void main(String[] args) {
//		Car09 car = new Car09();// �߻�Ŭ������ �ν��Ͻ� �����Ұ�

		Sedan09 sedan1 = new Sedan09();
		System.out.println("�¿�������");
		Truck09 truck1 = new Truck09();
		System.out.println("Ʈ������");

	}
}
