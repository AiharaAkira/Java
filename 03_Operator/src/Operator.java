import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// 입력받을 준비
		Scanner keyboard = new Scanner(System.in);

		// 같다 ==
		// 대입 연산자 : =, 오른쪽을 왼쪽에 담는다.
		int x = 10;

		// 산술연산자 : +-*/%
		System.out.print("값: ");
		int y = keyboard.nextInt();
		System.out.println("값은 " + y + " 입니다.");

		System.out.println(x + y);

		int hab = x + y;
		System.out.println(hab);
		int hab1 = x - y;
		System.out.println(hab1);
		int hab2 = x * y;
		System.out.println(hab2);
		int hab3 = x / y;
		System.out.println(hab3);

		int p = x % y;
		System.out.println(p);

		System.out.println("------------------------------");

		// 중감 연산자 : +=, -=, *=, /=, %=

		System.out.println("x= " + x);

		x = x + 1;
		System.out.println("x=" + x);

		x += 1;
		System.out.println("x=" + x);

		x -= 2; //
		System.out.println("x=" + x);

		x *= 2;
		System.out.println("x=" + x);

		x /= 2;
		System.out.println("x=" + x);

		// 전위 후위 연산자
		x++; // 1증가		++x;
		x--; // 1감소		--x;
		x /= 2;
		System.out.println("x=" + x);
		
		
		
		

	}

}
