import java.util.Scanner;

public class AMain3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] aa = new int[4];
		// 00 ��° ���� �Է�
		
//		for(int i = 0; i < aa.length; i++) {
//			System.out.println(i+1+"���ڸ� �Է��Ͻÿ�");
//			aa[i] = sc.nextInt();
//		}
		
		int sum = 0;
		for (int i = 0; i < aa.length; i++) {
			System.out.println(i+1+"���ڸ� �Է��Ͻÿ�");
			aa[i] = sc.nextInt();
			sum += aa[i];
		}

		System.out.println("������: " + sum);
		
		int sum2 = 0;
		for(int i : aa) {
			sum2 += i;
		}
		System.out.println("������: " + sum2);
		

		// �� ���� ���հ� ���

	}

}
