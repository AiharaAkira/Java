import java.util.Scanner;

public class Test_Avg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ��������� ����� �˷��ִ� ���α׷�

		// �Է¹ޱ�(�߰�, �⸻)

		// ���� ���ϱ�

		// ����
		// 90���̻� A(�Ǹ��մϴ�)
		// 80�� �̻� B(����մϴ�)
		// 70�� �̻� C(���ݴ� ����ϼ���)
		// 60�� �̻� D(������ �ض�)
		// ������ F(�׷�...)

		Scanner sc = new Scanner(System.in);

		System.out.println("�߰� ������ �Է��ϼ���(100������): ");
		int middle = sc.nextInt();
		System.out.println("�⸻ ������ �Է��ϼ���(100������): ");
		int last = sc.nextInt();
		double avg = (double) (middle + last) / 2;
		System.out.printf("������%.2f\n", avg);

		if (avg >= 90) {
			System.out.println("�����A");
		} else if (avg >= 80) {
			System.out.println("�����B");
		} else if (avg >= 70) {
			System.out.println("�����C");
		} else if (avg >= 60) {
			System.out.println("�����D");
		} else {
			System.out.println("�����F");
		}

	}

}
