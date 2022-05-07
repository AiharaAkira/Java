class Car08 {

	// 은닉화

	private int speed;// 전역변수
	private String color;
	
	public Car08() {
		
	}
	
	
	public Car08(int speed, String color) {
		super();
		this.speed = speed;
		this.color = color;
	}
	
	public Car08(String color) {
		super();
		this.speed = 0;
		this.color = color;
	}

	
	public int getSpeed() {
		return speed;
	}
	public String getColor() {
		return color;
	}
}

public class EX01_08 {

	public static void main(String[] args) {
		Car08 mycar2 = new Car08();
		Car08 myCar3 = new Car08("빨강");
		Car08 mycar1 = new Car08(0,"파랑");
		
		System.out.println("자동차 1 : " + mycar1.getColor() + " 속도는 :" + mycar1.getSpeed());
		System.out.println("자동차 2 : " + mycar2.getColor() + " 속도는 :" + mycar2.getSpeed());

	}
}
