
public class OMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human();
		
		h1.name = "akira";
		h1.age = 23;
		h1.printInfo();
		
		System.out.println(h1);
		
		Human h2 = h1;
		System.out.println(h2);
		h2.name = "�ο�";
		h2.printInfo();
		h1.printInfo();
		
		//garbage collector
		//heap ���� �ڵ� ����
		//�� �̻� �� ������ ����Ű�� ������ ���� ��
		
	}

}
