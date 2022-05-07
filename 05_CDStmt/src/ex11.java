import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {

		// 키보드 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력을 3개 받을 것
		System.out.println("x :");
		int x = sc.nextInt();
		System.out.println("연산자 :");
		String operator = sc.next();
		System.out.println("y :");
		int y = sc.nextInt();

		// 입력한 연산자에 따른 결과를 계산해주는 프로그램
		switch (operator) {
		case "+":
			System.out.printf("%d + %d = %d",x,y, x+y);
			break;

		case "/":
			System.out.printf("%d / %d = %.2f",x,y, (double)x/y);
			break;

		case "*":
			System.out.printf("%d * %d = %d",x,y, x*y);
			break;

		case "-":
			System.out.printf("%d - %d = %d",x,y, x-y);
			break;
			
		case "%":
			System.out.println(x + " % "+ y +" = " +(x%y));
			break;

		default:
			System.out.println("제대로 입력하세요.");
			break;
		}
		// ex) + -> 1+1 = 2

	}

}
