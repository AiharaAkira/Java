// ������(polymorhpism)

interface Coffee{
	
	void name();
	void price();
	
	default void hotOrIce() {
		System.out.println("������� �Ǵ� �׸��ΰ�?");
	}
	
	
}
//implements (����)
class Espresso implements Coffee{
	@Override
	public void name() {
		System.out.println("����������");
	}
	
	@Override
	public void price() {
		System.out.println("2000��");
		
	}
}


class Cafelatte implements Coffee{
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

class Vanilalatte implements Coffee{
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

class Frappuccino implements Coffee3{
	@Override
	public void name() {
		System.out.println("����Ǫġ��");
	}
	
	@Override
	public void price() {
		System.out.println("3000��");
		
	}
}


public class OIMain {
	public static void main(String[] args) {
		
		Coffee coffee;
		coffee = new Espresso();
		coffee.name();
		coffee.price();
		System.out.println();
		
		coffee = new Cafelatte();
		coffee.name();
		coffee.price();

//		Ŀ�� �̸�, ����, �־��̽�
		
//		 ����������
//		Espresso3 espresso = new Espresso3();
//		espresso.name();
//		espresso.price();
////		 ī���
//		Cafelatte3 cafelatte = new Cafelatte3();
//		cafelatte.name();
//		cafelatte.price();
////		 �ٴҶ��
//		Vanilalatte3 vanilalatte = new Vanilalatte3();
//		vanilalatte.name();
//		vanilalatte.price();
//		//		 ����Ǫġ��
//		
//		Frappuccino3 frapuccino = new Frappuccino3();
//		 frapuccino.name();
//		 frapuccino.price();
		
	}
}
