import java.util.Random;
import java.util.Scanner;

public class CCC {

	public static void main(String[] args) {

		// ������

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String[] table = { "", "����", "������", "��", "�Ʒ�", "������" };

		while (true) {

			System.out.println("-----------------------------");
			System.out.println("1. ����");
			System.out.println("2. ������");
			System.out.println("3. ��");
			System.out.println("4. �Ʒ�");
			System.out.println("5. ������");

			int comFace = r.nextInt(5) + 1;
			System.out.println(comFace);// ������ �׽�Ʈ��
			System.out.println("���? (���ڷ� �Է�)");
			int myFace = sc.nextInt();

			// ����
			if(myFace < 1 || myFace > 5) {
				System.out.println("�Է¿���");
				continue;
			}
			System.out.printf("�� : %s", table[myFace]);
			System.out.printf(" vs �� : %s", table[comFace]);

			if (myFace == comFace) {
				System.out.println("�ɸ�");
				System.out.println(count + "�� �����.");
				System.out.println(count + 1 + "�� ��� ġ��");
				break;
			} else {
				System.out.println("����");
				count++;
			}
		}

	}

}
