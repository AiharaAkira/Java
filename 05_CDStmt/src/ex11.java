import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {

		// Ű���� �Է¹��� �غ�
		Scanner sc = new Scanner(System.in);
		// �Է��� 3�� ���� ��
		System.out.println("x :");
		int x = sc.nextInt();
		System.out.println("������ :");
		String operator = sc.next();
		System.out.println("y :");
		int y = sc.nextInt();

		// �Է��� �����ڿ� ���� ����� ������ִ� ���α׷�
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
			System.out.println("����� �Է��ϼ���.");
			break;
		}
		// ex) + -> 1+1 = 2

	}

}
