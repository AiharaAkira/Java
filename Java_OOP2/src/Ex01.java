class Car01 {
	String color;
	int speed;
	void upSpeed(int value) {
		speed += value;
	}
	
	void downSpeed(int value) {
		speed -= value;
	}
}

class Sedan01 extends Car01{
	int seatNum;
}

class Truck01 extends Car01{
	int capacity;
}



public class Ex01 {
	public static void main(String[] args) {
		//세단, 트럭
		
		Sedan01 sedan1 = new Sedan01();
		Truck01 truck1 = new Truck01();
		
		sedan1.upSpeed(300);
		truck1.upSpeed(100);
		
		sedan1.seatNum = 5;
		truck1.capacity = 50;
	}
}
