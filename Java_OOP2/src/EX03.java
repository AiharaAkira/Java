class Car03 {
	public Car03() {
		System.out.println("��Ŭ ������ (�Ķ���� ����)");
	}

	public Car03(String str) {
		System.out.println("��Ŭ ������ ->" + str);
	}
}

class Sedan03 extends Car03 {
	public Sedan03(String str) {
		// super�� Ÿ���� �ȵ��־ ������.
		super();
		System.out.println("��Ŭ ������ ->" + str);
	}
}

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan03 sedan1 = new Sedan03("�����");
	}

}
