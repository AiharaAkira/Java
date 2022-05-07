abstract class Car09 {
	int speed;
	String color;

	void upSpeed(int speed) {
		this.speed += speed;
	}

	abstract void work();
}

class Sedan09 extends Car09 {
//	추상메서드를 쓰면 상속받는 클래스들은 반드시 오버라이드 해야함
	@Override
	void work() {
		System.out.println("승용차가 사람채움");
	}
}

class Truck09 extends Car09 {
	@Override
	void work() {
		System.out.println("승용차가 사람채움");

	}
}

public class Ex09 {
	public static void main(String[] args) {
//		Car09 car = new Car09();// 추상클래스라 인스턴스 생성불가

		Sedan09 sedan1 = new Sedan09();
		System.out.println("승용차생성");
		Truck09 truck1 = new Truck09();
		System.out.println("트럭생성");

	}
}
