
public class OMain {

	public static void main(String[] args) {
		
		//���� ���θ�
		
		//Goods
		
		//ǰ�� : ������ ������ : 120 ������ : ����
		//ǰ�� : �����е� ������ : 80 ������ : ����
		//ǰ�� : ������ ������ : 20 ������ : ����
		
		//��ǰ���� ��� ���(����)
		
		//������� ������ ����
		
//		�ѹ� ������ ��ǰ�� �̸��� ������ ���� x
//		setter ����
//		static ����, �Ʒ��� ���� Ŭ���� ���� ���� ����, Ŭ������.�޼ҵ�()
		Goods.getMaker();
		
		
		Goods iphone = new Goods("������", 120);
		Goods ipad = new Goods("�����е�", 80);
		Goods airpot = new Goods("������", 20);
		
		iphone.info();
		airpot.info();
		ipad.info();
		
		System.out.println("--------------------");
		System.out.println(Goods.getMaker());
		
		
	}

}
