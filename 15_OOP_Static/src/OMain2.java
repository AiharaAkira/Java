
public class OMain2 {

	public static void main(String[] args) {
		// �Ｚ
		// Galaxy

		/*
		 * 1.'����'���� �ȵǰ� 2.������ ��� 3.ǰ�� : ������ 1 ���� 50 ������ �����ε������ڷ� ���� // ��ǰ���� ��� ��� 3.ǰ�� :
		 * ������ 2 ���� 150 ������ // ��ǰ���� ��� ��� 3.ǰ�� : ������ 3 ���� 250 ������ // ��ǰ���� ��� ���
		 * 
		 * ������ 3 ���� ���� 250 >> 180 ��ǰ���� ��� ���� ����� �� �� ���
		 */

		Product gal1 = new Product(50, "������1");
		gal1.info();
		
		Product gal2 = new Product(150, "������2");
		gal2.info();
		
		Product gal3 = new Product(250, "������3");
		gal3.info();
		
		gal3.setPrice(180);
		gal3.info();
		
		System.out.println("�޴��� �� : " + Product.getCount() + "��");

	}

}
