import java.util.Scanner;

public class EHMain2 {
	
	public static void test() {
		try {
			int aa[] = {1};
			System.out.println(aa[5]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void test2() throws ArrayIndexOutOfBoundsException{
		int aa[] = {1};
		System.out.println(aa[5]);
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("x : ");
		int x = sc.nextInt();
		System.out.println("y : ");
		int y = sc.nextInt();
		try {
			System.out.println(x / y);

			int[] ar = { 10, 20 };
			System.out.println(" �迭 �� ��?");
			int i = sc.nextInt();
			System.out.println(ar[i]);
		} catch (Exception e) {
			System.out.println("���� �߻�");
			e.printStackTrace(); // ������ Ȯ�ο�
		}
//		try {
//			System.out.println(x / y);
//			
//			int [] ar = {10, 20};
//			System.out.println(" �迭 �� ��?");
//			int i = sc.nextInt();
//			System.out.println(ar[i]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("0�̳� 1�߿� �Է� ���ּ���");
//			e.printStackTrace(); // ������ Ȯ�ο�
//		}catch (Exception e) {
//			System.out.println("0�̿� ���� ������ �ּ���");
//			e.printStackTrace();
//		}

	}

}