import java.util.Scanner;

public class AMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int aa[] = new int[4]; // 4ĭ¥�� ���� (ĭ�� �ε���, ����)
		int hap = 0;
		
		
		
		System.out.println("1�� �����Է�: ");
		aa[0] = sc.nextInt();
		System.out.println("2�� �����Է�: ");
		aa[1] = sc.nextInt();
		System.out.println("3�� �����Է�: ");
		aa[2] = sc.nextInt();
		System.out.println("4�� �����Է�: ");
		aa[3] = sc.nextInt();
		
		hap = aa[0] + aa[1] + aa[2] + aa[3];
		System.out.println(hap);
	}

}
