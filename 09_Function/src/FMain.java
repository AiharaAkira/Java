
//�Լ�
// �����ִ� �۾��� �ѵ� ���� ���� �س���
//�ʿ��Ҷ� �ҷ� ����.

/*
 * 1. �Լ�����
 * public static void �Լ���(){
 * ����
 * }
 * 1)�Լ��� ����(argument), �Ű�����(parameter): �Լ����࿡ �ʿ��� �͵�
 * public static void �Լ���(�ڷ��� ������, �ڷ��� ������, ..(parameter)){
 * ����
 * }
 *	ȣ��
 *	2)�Լ���(2); // ���⼭ ���� 2�� ���� (argument) : ���� �� ��
 *
 */

public class FMain {
	
	public static int calculatorPlus(int x, int y) {
		return x+y;
	}
	public static void ballMan(String ball) {
		System.out.println("â�� ���� (��������)");
		if (ball.equals("�౸")) {
			System.out.println("�౸�� ������ ��� ��");
		} else if (ball.equals("��")) {
			System.out.println("�󱸰� ������ ���� ��");
		} else {
			System.out.println();
		}

		System.out.println("ü�� �ð� ������ ���� ���ڸ���");
	}

	public static void info() {
		System.out.println("�̸�: mw");
		System.out.println("����: 20");
	}

	public static void pushUp(int count) {
		System.out.println("�����");
		System.out.println("--------------------------");
		for (int i = 0; i < count; i++) {
			System.out.println("�ȱ���");
			System.out.println("�� ��");
		}
	}

	public static void main(String[] args) {

		info();

		System.out.println("____________________________");

		pushUp(3);// ���� �� ���� 3�� ����(argument)

		System.out.println("___________________________");

		// test
		// �� or �౸ �Է¿� ���� �ٸ� ó��.

		// â�� ���� (��������)
		// �󱸰� ������ ���� ��
		// �౸�� ������ ��� ����
		// ü���ð� ������ ���� ���ڸ���
		pushUp(2);
		ballMan("�౸");
		
		System.out.println("____________________________________");
		
		System.out.println(calculatorPlus(1, 2));

	}

}
