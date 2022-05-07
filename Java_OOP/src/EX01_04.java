class Car4 {

	// 은닉화
	private String color;
	private int speed;// 전역변수

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

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}

public class EX01_04 {

	public static void main(String[] args) {
		int speed;// 지역변수
		// 클래스(설계도) 정의
		Car4 mycar1 = new Car4();
		// 자동차
		mycar1.setColor("노랑");
		;
		mycar1.setSpeed(0);

//		mycar1.upSpeed(300);

		System.out.println(mycar1.getColor());
		System.out.println(mycar1.getSpeed());

	}
}
