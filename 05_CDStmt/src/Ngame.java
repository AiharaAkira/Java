import java.util.Random;
import java.util.Scanner;

public class Ngame {

	public static void main(String[] args) {

		// Number Game (Up Down)

		// ������ ���ڰ� �ϳ� �ʿ�
		Scanner sc = new Scanner(System.in);
		// ���� ���� ���� �غ�
		Random r = new Random();

		// ���� ���� �̱�
		int comNum = r.nextInt(3) + 1; // 0���� ����
		System.out.println(comNum); // ��Ǫ�Ͱ� ���� ���� ����(������ Ȯ�ο�)

		System.out.println("1~3���ڸ� �Է����ּ��� : ");
		int myNum = sc.nextInt();

		// ����
		if (myNum == comNum) {
			System.out.println("�����Դϴ�.");
		} else if (myNum > comNum) {
			System.out.println("�ٿ�!");

		} else {
			System.out.println("��!");

		}
	}

}
