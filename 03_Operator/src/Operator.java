import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		// �Է¹��� �غ�
		Scanner keyboard = new Scanner(System.in);

		// ���� ==
		// ���� ������ : =, �������� ���ʿ� ��´�.
		int x = 10;

		// ��������� : +-*/%
		System.out.print("��: ");
		int y = keyboard.nextInt();
		System.out.println("���� " + y + " �Դϴ�.");

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

		// �߰� ������ : +=, -=, *=, /=, %=

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

		// ���� ���� ������
		x++; // 1����		++x;
		x--; // 1����		--x;
		x /= 2;
		System.out.println("x=" + x);
		
		
		
		

	}

}
