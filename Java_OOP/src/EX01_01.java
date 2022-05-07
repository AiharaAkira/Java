class Car {
	String color;
	int speed;//전역변수
	//숫자를 넣으면 그 숫자로 속도를 세팅해주는 메서드
	void upSpeed(int value) {
		speed += value;
	}

	void downSpeed(int value) {
		speed -= value;
	}
}

public class EX01_01 {
	
	public static void main(String[] args) {
		int speed;//지역변수
		// 클래스(설계도) 정의
		Car mycar1 = new Car();
		// 자동차
		mycar1.color = "red";
		mycar1.speed = 0;
		
		Car mycar2 = new Car();
		// 자동차
		mycar2.color = "blue";
		mycar2.speed = 0;
		
		Car mycar3 = new Car();
		// 자동차
		mycar3.color = "yello";
		mycar3.speed = 0;
		
		mycar1.upSpeed(30000);
		System.out.println("자동차 1 색상 : " + mycar1.color );
		System.out.println("자동차 1 속도 : " + mycar1.speed);
		
		mycar2.upSpeed(60);
		System.out.println("자동차 2 색상 : " + mycar2.color );
		System.out.println("자동차 2 속도 : " + mycar2.speed);
		
		
		mycar3.upSpeed(0);
		System.out.println("자동차 3 색상 : " + mycar3.color );
		System.out.println("자동차 3 속도 : " + mycar3.speed);
		
		
	}
}
