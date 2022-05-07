class Car06{
	int speed;
	void upSpeed(int speed) {

		this.speed += speed;
		System.out.println("현재속도(슈클) >>" + this.speed);
	}
}

class Truck06 extends Car06{
	@Override
	void upSpeed(int speed) {
		
		super.upSpeed(speed);
		if(this.speed > 200) {
			this.speed = 200;
			System.out.println("현재속도(섭클) >> " + this.speed);
		}
	}
}

class Sedan06 extends Car06{
	@Override
	void upSpeed(int speed) {
		
		super.upSpeed(speed);
		if(this.speed > 300) {
			this.speed = 300;
			System.out.println("현재속도(섭클) >> " + this.speed);
		}
	}
}



public class Ex06 {

	public static void main(String[] args) {
		Truck06 truck1 = new Truck06();
		Sedan06 sedan1 = new Sedan06();
	
		truck1.upSpeed(250);
		sedan1.upSpeed(3000);
	}

}
