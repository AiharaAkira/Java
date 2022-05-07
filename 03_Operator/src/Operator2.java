
public class Operator2 {

	public static void main(String[] args) {

		// �� ������ : ����� boolean ������ ��

		// >, <, <= <=, ==, !=

		int x = 10;
		int y = 20;

		boolean a = x > y;
		System.out.println(a);

		// ���� ������ : �� ������ ������ ���� ��

		// ����7 Ư������
		// &&(AND) :A && B :AB��θ��� ��
		// ||(OR) :A || B :AB ���߿� �ϳ��� ���� ��

		// & (XOR) :A ^ B : A�� B �� �� �ϳ��� �����ؾ� TRUE

		// ���� ������
		// !(NOT) : !A : A�� ����� �ݴ��
		System.out.println("--------------------------------------");

		// x�� 5���� ũ��, y�� 10���� �۳�?
		boolean b = x > 5 && y < 10;
		System.out.println(b);

		// x�� 5���� ũ�ų� y�� 10���� �۳�?
		boolean c = x > 5 || y < 10;
		System.out.println(c);
		System.out.println("------------------------------------------");

		// ���̱ⱸ�� Ÿ�� �Ǵ��� �ȵǴ��� üũ�ϴ� ���α׷�

		// Ű, ����

		int height = 180;
		int age = 30;

		// ���̰� 10�� �̻��̰�, Ű�� 200������ Ÿ�� ��
		boolean ok = age >= 10 && height > 200;

		// Ű�� 200 �Ѱ� ���̰� 10�� �̻��̸� Ÿ����
		ok = height > 200 && age >= 10;
		System.out.println(ok);

		// ���̰� 10�� �̻��̰ų�, Ű�� 200 ������ Ÿ�� ��
		// Ȯ���� ���� ���� ������ ��ġ�ϸ� ���� Ƚ���� ���� �� �ִ�.
		boolean ok2 = age >= 10 || height > 200;

		ok2 = height > 200 || age >= 10;

		System.out.println(ok2);

		// Ű�� 200�� ������ Ÿ�� �ȵ�

		boolean heightPassNot = !(height > 200);
		System.out.println(heightPassNot);

		System.out.println("__________________________");

		// ���� ������

		// ���ǽ� ? ���� ������ �� (true): ���� �Ҹ����� ��(false)

		// ���̰� 8���� ������ Welcome, �ȳ����� Go home
		String msg = age > 8 ? "welcome" : "go Home";
		System.out.println(msg);

		// �����
		// Ű�� 200�Ѱų� ���̰� 20 �̻��̸� 10000��, �ƴϸ� 5000��
		int ticket = height > 200 || age >= 20 ? 10000 : 5000;
		System.out.println(ticket);

		// ����
		// Ȧ�� age % 2 == 1
		// ���̰� ¦���� 1000��, �ƴϸ� 500�� ����
		int discount = age % 2 == 0 ? 1000 : 500;
		// �ѿ��
		
		int total = ticket - discount;
		
		// ����� - ����
		System.out.println("�����	:	" + ticket + "��");
		System.out.println("����	: 	" + discount + "��");
		System.out.println("�ѿ��	:	" + total + "��");
		
	}

}
