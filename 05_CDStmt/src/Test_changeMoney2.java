import java.util.Scanner;

public class Test_changeMoney2 {

	public static void main(String[] args) {

		// �ܵ� ��� ���ִ� ���α׷�

		// �̷��� �Է��ϸ�
		// 12348546

		// 5���� : 2��
		// 1���� 5õ�� 1õ��
		// 500�� 100�� 50�� 10�� 1��(�ܵ���� �Ұ� �Ұ� �ݾ� 4��)

		Scanner sc = new Scanner(System.in);
		System.out.print("�Ž��� �� ���: ");

		int money = sc.nextInt();
		int count = 0;
		
		if (money >= 50000) {
			count = money / 50000;
			System.out.println("5������" + count + "��");
			money %= 50000;
		}

		if (money >= 10000) {
			count = money / 10000;
			System.out.println("1������" + count + "��");
			money %= 10000;
		}

		if (money >= 5000) {
			count = money / 5000;
			System.out.println("��õ����" + count + "��");
			money %= 5000;
		}

		if (money >= 1000) {
			count = money / 1000;
			System.out.println("õ����" + count + "��");
			money %= 1000;
		}

		if (money >= 500) {
			count = money / 500;
			System.out.println("500��" + count + "��");
			money %= 500;
		}

		if (money >= 100) {
			count = money / 100;
			System.out.println("100��" + count + "��");
			money %= 100;
		}

		if (money >= 50) {
			count = money / 50;
			System.out.println("50��" + count + "��");
			money %= 50;
		}

		if (money >= 10) {
			count = money / 10;
			System.out.println("10��" + count + "��");
			money %= 10;
		}

		if (money >= 1) {
			count = money / 1;
			System.out.println("�Ž��� �ټ� �����ϴ�. 1��" + count + "��");
		}

	}

}
