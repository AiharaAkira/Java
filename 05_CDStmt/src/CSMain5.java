import java.util.Scanner;

public class CSMain5 {

	public static void main(String[] args) {
		// if�� else �ƴҶ� <==>���׿�����
		// switch case <=> if ��

		String line = "ȣ����";

		// line �� ������̸� Ÿ�� �� 1��
		// line �� ��μ��̸� Ÿ�� �� 2��
		// line �� ȣ�����̸� Ÿ�� �� 3��

		switch (line) {
		case "�����":
			System.out.println("Ÿ�°� 1��");
			break;
		case "��μ�":
			System.out.println("Ÿ�°� 2��");
			break;
		case "ȣ����":
			System.out.println("Ÿ�°� 3��");
			break;

		default:
			break;

		}

		Scanner sc = new Scanner(System.in);

		System.out.println("��� �޴�?(1~4)");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("�Ƹ޸�ī��");
			break;
		case 2:
			System.out.println("ī���");
			break;
		case 3:
			System.out.println("�ٴҶ��");
			break;
		case 4:
			System.out.println("��ī��");
			break;
		default:
			System.out.println("�׷��޴� ����.");
			break;
		}

		System.out.println("_______________________");

		String grade = "�Ϻ�";
		if (grade.equals("�̺�")) {
			System.out.println("��ġ");
			System.out.println("�����");
			System.out.println("�Ʒ�");
			System.out.println("��");
		} else if (grade.equals("�Ϻ�")) {
			System.out.println("�����");
			System.out.println("�Ʒ�");
			System.out.println("��");
		} else if (grade.equals("��")) {
			System.out.println("�Ʒ�");
			System.out.println("��");
		} else if (grade.equals("����")) {
			System.out.println("��");
		}

		switch (grade) {
		case "�̺�":

			System.out.println("��ġ");

		case "�Ϻ�":

			System.out.println("�����");

		case "��":

			System.out.println("�Ʒ�");

		case "����":

			System.out.println("��");

		}

		// �Ȱ��� ������ �ݺ� �ɶ��� ����ġ�� ����.

		// 1~9 �����ֱ�
		// 20�� ��������
		// 30��
		int age = 21;

		switch (age) {
		case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19:
			System.out.println("�����ֱ�");
			break;

		case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29:
			System.out.println("�����ֱ�");
			break;

		case 30, 31, 32, 33, 34, 35, 36, 37, 38, 39:
			System.out.println("�����ֱ�");
			break;

		default:

			break;
		}
		
		
		

	}
}
