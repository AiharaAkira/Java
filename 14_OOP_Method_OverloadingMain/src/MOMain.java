
public class MOMain {
	
	

	public static void main(String[] args) {
		
		Cal c = new Cal();
		c.add(10, 20);
		System.out.println("---------------------------");
		
		// ���� 3�� �־ ���� ���
		c.add(10, 20, 30);
		
		//���� 4�� ��
		c.add(10, 20, 30, 40);
		
		//�Ǽ� 2�� ��
		c.add(1.0, 2.0);
		
		//�Ǽ� 3�� ��
		c.add(1.0, 2.0, 3.0);
		
		// ������ � �ֵ� �� �����ִ� �޼ҵ�
		c.add_free(1, 2, 3, 4, 5);
		
		//������ � �ֵ� �� �����ִ� �޼ҵ�
		c.multiplies_free(1, 2, 3, 4, 5);

	}

}
