import java.util.Scanner;

public class Test_SwitchCase {

	public static void main(String[] args) {
		// test
		
//		각 월이 몇일까지 있는지 알려주는 프로그램
//		1입력하면 -> 31일까지 출력
		
		//31)13578,10,12
//		30)46911
//		28)2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요: ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31일 까지입니다.");
			break;
			
		case 4, 6, 9, 11:
			System.out.println("30일 까지입니다.");
			break;
			
		case 2:
			System.out.println("28일 까지입니다.");
			break;

		default:
			break;
		}
		
		

	}

}
