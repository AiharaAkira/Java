import java.util.Scanner;

public class EHMain {
	
	public static void test() {
		int a = 1;
		int b = 0;
		try {
			int c = a/b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		/*
		 * ����(Error) : �ڹ� ���� �� �´� ��
		 * 				������ ����
		 * 				���α׷� �ϼ� �ȵ�
		 * 				�������� �߸�
		 * ���(Warning) : ������ �� �߰ų�, ������� �ʴ� �ڿ�
		 * 					���α׷� ���� �۵�
		 * 					������ �߸�
		 * 
		 * ���� ó��
		 * 
		 * ���� (Exception) : ���α׷��� ���� �۵�
		 * ���� �� �� �߻��ϴ� ���� ��Ȳ ������ �������� ������ �ȵǴ� ��
		 * ������ x ����� �߸�
		 */
		
		//�ϴ� try ���� ����, ������ �߻��ϸ� catch�� �̵�
		while(true) {
			
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x : ");
		int x = sc.nextInt();
		System.out.println("y : ");
		int y = sc.nextInt();
		
		try {
			System.out.println(x/y);
		} catch (Exception e) {
			System.out.print("0���� ���� �� �����");
			e.printStackTrace(); // ������ Ȯ�ο�
		}
		}
		
		
		
		

	}

}
