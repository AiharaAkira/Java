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
		System.out.println("이름 : ");
		name = mouth.next();
		System.out.println("키 : " );
		height = mouth.nextDouble();
		System.out.println("체중 : " );
		weight = mouth.nextDouble();
	}
}
