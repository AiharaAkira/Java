class Car10 {
	String color;
	int speed;
	static int count = 0;
	static String Car_Type = "�¿���";

	public Car10() {

		count++;

	}
}

public class EX01_10 {

	public static void main(String[] args) {

		Car10 myCar1 = new Car10();
		System.out.println(myCar1);
		System.out.println("������� ������ �� : " + myCar1.count);

		Car10 myCar2 = new Car10();
		System.out.println(myCar2);
		System.out.println("������� ������ �� : " + myCar2.count);

		Car10 myCar3 = new Car10();
		System.out.println(myCar3);
		System.out.println("������� ������ �� : " + myCar3.count);
		
		System.out.println("������� ������ �� : " + myCar1.count);
		
		System.out.println(Car10.Car_Type);
	}
}
