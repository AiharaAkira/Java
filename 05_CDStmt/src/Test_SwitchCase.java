import java.util.Scanner;

public class Test_SwitchCase {

	public static void main(String[] args) {
		// test
		
//		�� ���� ���ϱ��� �ִ��� �˷��ִ� ���α׷�
//		1�Է��ϸ� -> 31�ϱ��� ���
		
		//31)13578,10,12
//		30)46911
//		28)2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է����ּ���: ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("31�� �����Դϴ�.");
			break;
			
		case 4, 6, 9, 11:
			System.out.println("30�� �����Դϴ�.");
			break;
			
		case 2:
			System.out.println("28�� �����Դϴ�.");
			break;

		default:
			break;
		}
		
		

	}

}
