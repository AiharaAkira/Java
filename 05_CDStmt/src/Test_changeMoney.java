import java.util.Scanner;

public class Test_changeMoney {

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
		
		

		if (money >= 50000) {
			int fiftyT = money / 50000;
			System.out.println("5������" + fiftyT + "��");
			money %= 50000;
		}

		if (money >= 10000) {
			int tenT = money / 10000;
			System.out.println("1������" + tenT + "��");
			money %= 10000;
		}

		if (money >= 5000) {
			int fiveT = money / 5000;
			System.out.println("��õ����" + fiveT + "��");
			money %= 5000;
		}

		if (money >= 1000) {
			int thousand = money / 1000;
			System.out.println("õ����" + thousand + "��");
			money %= 1000;
		}

		if (money >= 500) {
			int fiveH = money / 500;
			System.out.println("500��" + fiveH + "��");
			money %= 500;
		}

		if (money >= 100) {
			int hundred = money / 100;
			System.out.println("100��" + hundred + "��");
			money %= 100;
		}

		if (money >= 50) {
			int fifty = money / 50;
			System.out.println("50��" + fifty + "��");
			money %= 50;
		}

		if (money >= 10) {
			int ten = money / 10;
			System.out.println("10��" + ten + "��");
			money %= 10;
		}

		if (money >= 1) {
			int nokori = money / 1;
			System.out.println("�Ž��� �ټ� �����ϴ�. 1��" + nokori + "��");
		}

	}

}
