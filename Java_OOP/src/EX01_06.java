class Car06 {

	// 은닉화

	private int speed;// 전역변수
	private String color;
	
	public Car06() {	// 생성자
		color = " 빨강 ";
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
		
		System.out.println("자동차 1 : " + mycar1.getColor() + " 속도는 :" + mycar1.getSpeed());
		System.out.println("자동차 2 : " + mycar2.getColor() + " 속도는 :" + mycar2.getSpeed());

	}
}
