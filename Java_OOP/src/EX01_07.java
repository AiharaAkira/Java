class Car07 {

	// 은닉화

	private int speed;// 전역변수
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
		Car07 mycar2 = new Car07(0,"빨강");
		Car07 mycar1 = new Car07(0,"파랑");
		
		System.out.println("자동차 1 : " + mycar1.getColor() + " 속도는 :" + mycar1.getSpeed());
		System.out.println("자동차 2 : " + mycar2.getColor() + " 속도는 :" + mycar2.getSpeed());

	}
}
