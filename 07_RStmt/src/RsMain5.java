import java.util.Scanner;

public class RsMain5 {

	public static void main(String[] args) {
//		break : ���� ��ġ���� ���� ����� switch�� �Ǵ� �ݺ��� Ż��
//		continue : ���� �ݺ��� �ǳ� �ٰ� ���������� �Ѿ. (���� �ݺ��� ����)

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {

				continue;
			}
			System.out.println(i);
		}

		// ���̺�(����� ����, ������� �Ⱦ�)
//		aaa: for(int i = 0; i < 3; i++) {
//			
//		
//		bbb: while (true) {
//
//			Scanner k = new Scanner(System.in);
//			System.out.println("������ ? : ");
//			int ans = k.nextInt();
//
//			switch (ans) {
//			case 1:
//				System.out.println("1��");
//				break;
//
//			case 2:
//				System.out.println("2��");
//
//				break;
//
//			case 3:
//				System.out.println("3��");
//
//				break;
//
//			case 4:
//
//				System.out.println("4�� ����");
//				break aaa;
//
//			default:
//				System.out.println("�Է¿���");
//				break;
//			}
//		}
//		}
		
		 while (true) {

			Scanner k = new Scanner(System.in);
			System.out.println("������ ? : ");
			int ans = k.nextInt();

			switch (ans) {
			case 1:
				System.out.println("1��");
				break;

			case 2:
				System.out.println("2��");

				break;

			case 3:
				System.out.println("3��");

				break;

			case 4:

				System.out.println("4�� ����");
				break ;

			default:
				System.out.println("�Է¿���");
				break;
			}
		}

	}

}
