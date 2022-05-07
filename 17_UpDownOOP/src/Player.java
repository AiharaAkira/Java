import java.util.Scanner;

public class Player {

	Scanner mouth;

	public Player() {
		mouth = new Scanner(System.in);
	}

	public int say() {

		return mouth.nextInt();

	}

}
