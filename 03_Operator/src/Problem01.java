import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		//���� 4���� �ϳ��� �Է� 
		Scanner sc = new Scanner(System.in);
		
		
		
		//ex �Է� 1 = 
		System.out.print("���ڸ� �Է��� �ּ���: ");
		int userNum1 = sc.nextInt();
		//����ڰ� ���� �ϳ��Է�
		//�Է� 2
		System.out.print("�ι�° ���ڸ� �Է��� �ּ���: ");
		int userNum2 = sc.nextInt();
		//����ڰ� �����ϳ� �Է� 
		//2��++
		System.out.print("����° ���ڸ� �Է��� �ּ���: ");
		int userNum3 = sc.nextInt();
		System.out.print("�׹�° ���ڸ� �Է��� �ּ���: ");
		int userNum4 = sc.nextInt();
		
		// ���� == 
		int total = userNum1 + userNum2 + userNum3 + userNum4;
		System.out.println("�հ�: " + total);
		// �Է°����� = ����
		System.out.printf("�󼼰��: %d + %d + %d + %d = %d\n", userNum1, userNum2, userNum3, userNum4, total);
		
		//�˻�����ϱ� % ��Ű, �ٹٲ�
		//��: \t
		//�ٹٲٱ� : \n
		
		//carriage return (Ŀ���� �� ������) : \r\t
		
		//test
		
		//Ű���� �Է¹��� �غ�
		
		
		
		

	}

}
