
public class EHMain3 {

	public static void main(String[] args) {
		
		//���⼭ �ٸ� �޼��� ȣ��
//		�̹� ó���� �޼���
		EHMain.test();
		
		EHMain2.test();
		
		
		//throw�� �Ѱ� ����
		try {
			EHMain2.test2();
		} catch (Exception e) {
			System.out.println("���� ���� ����");
		}
		
		
		
	}

}
