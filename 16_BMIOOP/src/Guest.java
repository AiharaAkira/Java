import java.util.Scanner;

public class Guest {
	String name;
	double height;
	double weight;
	double bmi;
	Scanner mouth;

	public Guest() {
		// TODO Auto-generated constructor stub
	}

	public void act2() {
		mouth = new Scanner(System.in);
		System.out.println("�̸� : ");
		name = mouth.next();
		System.out.println("Ű : " );
		height = mouth.nextDouble();
		System.out.println("ü�� : " );
		weight = mouth.nextDouble();
	}
}
