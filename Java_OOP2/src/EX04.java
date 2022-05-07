class Car04{
	private String color;
	int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

class Sedan04 extends Car04{
	//super()
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}


public class EX04 {

	public static void main(String[] args) {
		Sedan04 sedan01 = new Sedan04();
		sedan01.setSpeed(100);
		System.out.println("½Â¿ëÂ÷¼Óµµ >" + sedan01.speed);
		
		
	}

}
