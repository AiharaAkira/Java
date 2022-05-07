import java.util.Scanner;

// ������(polymorhpism)

interface Coffee2 {

	void name();

	void price();

	default void hotOrIce() {
		System.out.println("������� �Ǵ� �׸��ΰ�?");
	}

}

//implements (����)
class Espresso2 implements Coffee {
	@Override
	public void name() {
		System.out.println("����������");
	}

	@Override
	public void price() {
		System.out.println("2000��");

	}
}

class Cafelatte2 implements Coffee {
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
		Coffee.super.hotOrIce();
		System.out.println("���̽�? �����Ѱ�?");
	}
}

class Vanilalatte2 implements Coffee {
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
		Coffee.super.hotOrIce();
		System.out.println("���̽�? �����Ѱ�?");
	}
}

class Frappuccino2 implements Coffee {
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
		Coffee.super.hotOrIce();
		System.out.println("���̽�? �����Ѱ�?");
	}
}

public class OIMain2 {
	public static void main(String[] args) {

//		�ֹ��Ͻðھ��?
//		1.���������� 2.ī��� 3.�ٴҶ�� 4.����Ǫġ��
//		5.���� ����� -> �׷� ������
//		�� �� ��ȣ �Է½� > �޴����� ���׿�

//		23�����ý� hot or ice �����

//		Ŀ�� �̸�, ����, �־��̽�

//		 ����������
		Espresso3 espresso = new Espresso3();

//		 ī���
		Cafelatte3 cafelatte = new Cafelatte3();

//		 �ٴҶ��
		Vanilalatte3 vanilalatte = new Vanilalatte3();

		// ����Ǫġ��

		Frappuccino3 frapuccino = new Frappuccino3();

		System.out.println("_____________________________________________________");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�ֹ��Ͻðھ��(��ȣ)?(1. ���������� 2.ī��� 3.�ٴҶ�� 4.����Ǫġ�� 5.���� �����) ");
			int userNum = sc.nextInt();

			if (userNum == 3) {
				vanilalatte.name();
				vanilalatte.price();
				vanilalatte.hotOrIce();
				
			} else if (userNum == 4) {
				frapuccino.name();
				frapuccino.price();
				frapuccino.hotOrIce();
			} else if (userNum == 2) {
				cafelatte.name();
				cafelatte.price();
			} else if (userNum == 1) {
				espresso.name();
				espresso.price();
			} else if (userNum == 5) {
				System.out.println("�׷� ������.");
				break;
			} else {
				System.out.println("�޴��ǿ� ���׿�.");
				
			}

		}
	}
}
