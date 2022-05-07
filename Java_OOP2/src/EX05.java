class Car05{
	protected String color;
	int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

class Sedan05 extends Car05{
	//super()
	void setSpeed(int speed) {
		this.speed = speed;
//		public > default > protected > private
	}
	//private을 걸면 상속이 안됨.
	//protected를 걸면 상속이 됨.
	public void setColor(String color) {
		this.color = color;
	}
	
	
}


public class EX05 {

	public static void main(String[] args) {
		Sedan05 sedan01 = new Sedan05();
		sedan01.setSpeed(100);
		sedan01.setColor("빨강");
		System.out.println("승용차속도 >" + sedan01.speed);
		System.out.println("승용차색상 >" + sedan01.color);
		
		
	}

}
