import java.util.Random;
import java.util.Scanner;

public class RSPMain {

	public static void main(String[] args) {

		// ���� ���� ��

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int challenge = 0;
		int win = 0;
		// ����
		int winwin = 0;
		// �ִ� ����
		int maxwin = 0;

		String hand[] = { "", "����", "����", "��" };
		while (true) {

			System.out.println("----------------------");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ��");
			System.out.println("4.���� ����");
			System.out.println("-------------------");

			int comNum = r.nextInt(3) + 1;
			System.out.println("��ǻ�� ���� : " + comNum);// ������ Ȯ�ο�

			System.out.println("��? (���ڷ�) ");

			int playerNum = sc.nextInt();

			if (playerNum < 1 || playerNum > 4) {
				System.out.println("�߸� �Է�");
				System.out.println("�߸� �Է�");
				System.out.println("�߸� �Է�");
				System.out.println("�߸� �Է�");
				System.out.println("�߸� �Է�");
				System.out.println("�߸� �Է�");
				System.out.println("�߸� �Է�");
				continue;
			}

			// ����
			System.out.println("�� : " + playerNum);
			System.out.println(" vs ��ǻ�� : " + comNum);
			// c - p = -1 ��
			// c 
			if (comNum == playerNum) {
				System.out.println("���");
				winwin = 0;
				win++;
				challenge++;

			} else if ( playerNum - comNum  == -1 || playerNum - comNum == 2) {
				
				challenge++;
				System.out.println("��");

				System.out.println("����Ƚ�� : " + challenge);
				System.out.println("���ų� �̱� Ƚ�� : " + win);
				System.out.println("���� : " + winwin);
				System.out.println("�ִ뿬�� : " + maxwin);
				break;
			}  else if (playerNum == 4) {
				System.out.println("����Ƚ�� : " + challenge);
				System.out.println("���ų� �̱� Ƚ�� : " + win);
				System.out.println("���� : " + winwin);
				System.out.println("�ִ뿬�� : " + maxwin);
				System.out.println("������ �����մϴ�. ^^ 7");
				break;
			} else {
				System.out.println("�̱�");
				win++;
				winwin++;
				if (winwin > maxwin) {
					maxwin = winwin;
				}

				challenge++;

			}

		}

	}

}
