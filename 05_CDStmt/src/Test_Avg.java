import java.util.Scanner;

public class Test_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ��������� ����� �˷��ִ� ���α׷�

		// �Է¹ޱ�(�߰�, �⸻)

		// ���� ���ϱ�

		// ����
		// 90���̻� A
		// 80�� �̻� B
		// 70�� �̻� C
		// 60�� �̻� D
		// ������ F

		Scanner sc = new Scanner(System.in);

		System.out.println("�߰� ������ �Է��ϼ���(100������): ");
		int middle = sc.nextInt();
		System.out.println("�⸻ ������ �Է��ϼ���(100������): ");
		int last = sc.nextInt();
		double avg = (double) (middle + last) / 2;
		
		System.out.printf("������%.2f\n", avg);
		String grade = "F";
		
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} 
		
		System.out.println("���:" + grade);
		

	}

}
