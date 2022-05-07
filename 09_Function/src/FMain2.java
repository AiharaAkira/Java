import java.util.Scanner;

public class FMain2 {
	// ������ ������ ������ ���ؼ� '���' ���ִ� �Լ�
	public static void calSalary(int salary) {
		System.out.println("����: " + salary * 12 + "��");
	}

	// ������ ������ ������ �����ִ� �Լ�
	public static int calSalary2(int salary) {
		return salary * 12;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		calSalary(100);
		System.out.println(calSalary2(100));
		System.out.println("______________________________");
		// �ΰ��� ���ϱ�
		System.out.print("������?");
		int cost = sc.nextInt();
		System.out.println("�ΰ���: " + calProduct(cost) + "��");
		System.out.println("______________________________");

		// �ΰ��� ����׽�Ʈ

		System.out.print("����: ");
		cost = sc.nextInt();
		calProductPrint(cost);
		;
		System.out.println("______________________________");
		// �߰��⸻ �׽�Ʈ

		System.out.print("�߰�����: ");
		double middle = sc.nextInt();
		System.out.print("�⸻����: ");
		double last = sc.nextInt();
		System.out.printf("%.2f��\n", calAvg(middle, last));
		System.out.println("______________________________");

		// �λ� �׽�Ʈ

		System.out.print("����: ");
		int age = sc.nextInt();
		hiPrint(age);
		System.out.println("______________________________");
		System.out.println("�� ū ���� : " + BigNum(1, 2) );

	}

	// ��ǰ ������ ������ �ΰ����� �����ִ� �Լ�
	public static int calProduct(int cost) {

		return (cost / 10);
	}

	// ��ǰ ������ ������ �ΰ����� �߷����ִ� �Լ�
	public static void calProductPrint(int cost) {

		System.out.println("�ΰ���: " + cost / 10 + "��");
	}

	// test
//1.�߰�, �⸻ ������ ������ ����� �����ִ� �Լ�(scanner)

	public static double calAvg(double middle, double last) {

		return (middle + last) / 2;
	}

//2.���� ������ �λ縻�� ��� ���ִ� �Լ�
	public static void hiPrint(int age) {
		if (age >= 10 && age < 20) {
			System.out.println("�ȳ�");
		} else if (age >= 20 && age < 30) {
			System.out.println("�ȳ��ϼ���");
		} else {
			System.out.println("�ȳ��Ͻʴϱ�");
		}
	}
//10��:�ȳ�
//20�� �ȳ� �ϼ���
//���̻� �ȳ��Ͻʴϱ�
	
	//���� 2���� ������ �� ū ���ڸ� ���� �ִ� �Լ�
	public static int BigNum(int x, int y) {
	
//		if(x < y) {
//			return y;
//		}
//		return x;
		return (x < y)? y : x;
	}

}
