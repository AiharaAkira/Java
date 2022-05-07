import java.util.Scanner;

// ������(polymorhpism)

interface Coffee3 {

	void name();

	void price();

	default void hotOrIce() {

	}

}

//implements (����)
class Espresso3 implements Coffee3 {

	@Override
	public void name() {
		System.out.println("����������");
	}

	@Override
	public void price() {
		System.out.println("2000��");

	}
}

class Cafelatte3 implements Coffee3 {
	@Override
	public void name() {
		System.out.println("ī���");
	}

	@Override
	public void price() {
		System.out.println("2000��");

	}

	@Override
	public void hotOrIce() {
		Coffee3.super.hotOrIce();

	}
}

class Vanilalatte3 implements Coffee3 {
	@Override
	public void name() {
		System.out.println("�ٴҶ��");
	}

	@Override
	public void price() {
		System.out.println("1500��");

	}

	@Override
	public void hotOrIce() {
		Coffee3.super.hotOrIce();
		System.out.println("���̽�? �����Ѱ�?");
	}
}

class Frappuccino3 implements Coffee3 {
	@Override
	public void name() {
		System.out.println("����Ǫġ��");
	}

	@Override
	public void price() {
		System.out.println("3000��");

	}

	@Override
	public void hotOrIce() {
		Coffee3.super.hotOrIce();
		System.out.println("���̽�? �����Ѱ�?");
	}
}

public class OIMain3 {
	public static void main(String[] args) {

//		�ֹ��Ͻðھ��?
//		1.���������� 2.ī��� 3.�ٴҶ�� 4.����Ǫġ��
//		5.���� ����� -> �׷� ������
//		�� �� ��ȣ �Է½� > �޴����� ���׿�

//		23�����ý� hot or ice �����

//		Ŀ�� �̸�, ����, �־��̽�

//		 ����������

//		 ī���

//		 �ٴҶ��

		// ����Ǫġ��

		System.out.println("_____________________________________________________");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�ֹ��Ͻðھ��(��ȣ)?(1. ���������� 2.ī��� 3.�ٴҶ�� 4.����Ǫġ�� 5.���� �����) ");
			int userNum = sc.nextInt();

			Coffee3 coffee = null;

			if (userNum == 3) {
				coffee = new Vanilalatte3();
				coffee.hotOrIce();
			} else if (userNum == 4) {
				coffee = new Frappuccino3();
				coffee.hotOrIce();
			} else if (userNum == 2) {
				coffee = new Cafelatte3();
			} else if (userNum == 1) {
				coffee = new Espresso3();
			} else if (userNum == 5) {
				System.out.println("�׷� ������.");
				break;
			} else {
				System.out.println("�޴��� ���׿�");
				continue;
			}
			
			coffee.name();
			coffee.price();
			coffee.hotOrIce();
			
		}
	}
}
