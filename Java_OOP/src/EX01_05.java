class Car5 {

	// ����ȭ

	private int speed;// ��������

	public int getSpeed() {
		return speed;
	}

	public void upSpeed(int value) {
		
		

		if (speed + value > 300) {
			speed = 300;
		}

		else {
			speed += value;
		}

		System.out.println("���� �ӵ� >> " + speed);
	}

	public void downSpeed(int value) {
		if (speed - value < 0) {
			speed = 0;
		}

		else {
			speed -= value;
		}

		System.out.println("���� �ӵ� >> " + speed);
	}

	public void setSpeed(int speed) {
		 
			this.speed = speed;
		
		

	}
}

public class EX01_05 {

	public static void main(String[] args) {
		Car5 mycar = new Car5();

		System.out.println(mycar.getSpeed());

		mycar.upSpeed(100);
		mycar.upSpeed(150);
		mycar.upSpeed(150);

		
		mycar.downSpeed(100);

		mycar.downSpeed(1000);

	}
}
