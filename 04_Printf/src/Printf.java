import java.util.Scanner;

public class Printf {

	public static void main(String[] args) {

		// printf : ��� ���� ���� �� ���

		int a = 1;
		double b = 1.23456;
		String c = "abc";

		// %d : ������ ���� �� ���� �ڸ� - %03d : 3�ڸ� ���� ���
		// %f : �Ǽ��� ���� �� ���� �ڸ� - %.2�� : �Ҽ��� 2�ڸ��� ���
		// %s : String ���� �� ���� �ڸ�

		System.out.printf("%03d\n", a);
		System.out.printf("%.2f\n", b);
		System.out.printf("%s\n", c);

		// a�� oo�̰� b�� oo�̰� c�� oo�̴�
		System.out.println("a�� " + a + "�̰� b�� " + b + "�̰� c�� " + c + "�̴�.");
		System.out.printf("a�� %02d�̰� b�� %.1f �̰� c�� %s �̴�.\n", a, b, c);

		// test
		Scanner sc = new Scanner(System.in);

		// �̸� ���� Ű ü�� �Է¹ޱ�
		double height, weight;
		System.out.print("�̸��� �Է����ּ���: ");
		String name = sc.next();
		System.out.print("������ �Է����ּ���: ");
		int age = sc.nextInt();
		System.out.print("Ű�� �Է����ּ���: ");
		height = sc.nextDouble();
		System.out.print("ü���� �Է����ּ���: ");
		weight = sc.nextDouble();
		// ��� ���
		System.out.printf("�̸�\t:\t%s\n����\t:\t%d��\nŰ\t:\t%.1fcm\nü��\t:\t%.2fkg\n ", name, age, height, weight);

		// �̸� : 00
		// ���� : 00
		// Ű : 00
		// ü�� : 00
		// ����
		// ����� ü���� �Ҽ��� ���� ���ڸ��� �Է��ϵ�, ������ �Ҽ��� 1�ڸ�, ü���� �Ҽ��� 2�ڸ�

		System.out.println("_____________________");

		// ��°��
		/*
		 * 003)-------------- Model : i6 cost : 1200$ Weight : 120.5g Designed Ny
		 * "Apple"
		 * 
		 */

		// ��ǰ��ȣ�� �׳� int num = 3; �־ ����
		// ȸ�簡 "" �� ���� �ִµ� �˾Ƽ� ó��
		// �Է¹��� ���� (��, ����, ����, ȸ��)

		String model, compony;
		int num = 3;
		System.out.println("��ǰ��ȣ :");
		int modelNum = sc.nextInt();
		System.out.println("�𵨸�: ");
		model = sc.next();
		System.out.println("ȸ���: ");
		compony = sc.next();
		System.out.println("����: ");
		int cost = sc.nextInt();
		System.out.println("����: ");
		double weightOfM = sc.nextDouble();

		System.out.printf("* %03d)%d\n* Model\t:\t%s\n", num, modelNum, model);
		System.out.printf("*cost\t:\t%d$\n", cost);
		System.out.printf("*Weight\t:\t%.1fg\n", weightOfM);
		System.out.printf("*Designed By\t\"%s\"", compony);

	}

}
