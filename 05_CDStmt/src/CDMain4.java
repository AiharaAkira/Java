
public class CDMain4 {

	public static void main(String[] args) {
		
		int a = 4;
		//if, else if(�������� ���� �� �ϳ���)
		
		//1. 5��� ���� "a �� �ǹ�� ���"
		//2. 2��� ���� "a �� �ǹ�� ���"
		//3. 4��� ���� "a �� �ǹ�� ���"
		//4. "�ش� ����"
		
		
		if(a % 5 == 0) {
			System.out.println(a +"�� 5�ǹ�� ���");
		}else if (a % 2 == 0) {
			System.out.println(a +"�� 2�ǹ�� ���");
		}else if(a % 4 == 0) {
			System.out.println(a +"�� 4�ǹ�� ���");
		}else {
			System.out.println("�ش� ����");
		}
		
//		������ ���� �߻��� ���� if 
		
		if (a % 2 == 0) {
			System.out.println(a +"�� 2�ǹ�� ���");
		}
		
		System.out.println("______________________");
		
		if(a % 4 == 0) {
			System.out.println(a +"�� 4�ǹ�� ���");
		}else if(a % 5 == 0) {
			System.out.println(a +"�� 5�ǹ�� ���");
		}
		
		// ��ø if �� : �� ������ ���϶� �� ���� ��� ����
		//ù��° if ���� ���϶� ����
		
		int b = 10;
		
		if(b % 2 == 0) {
			System.out.println(b +"�� 2�ǹ�� ���");
			if(b % 5 == 0) {
				System.out.println(b +"�� 5�ǹ�� ���");
			}
		}
		
		int c = 4;
		
		//�ߺ� if�� ù��° ������ ���̿��� ��
		if(c % 3 == 0) {
			System.out.println(c +"�� 3�ǹ�� ���");
			
			if(c % 4 == 0) {
				System.out.println(c +"�� 4�ǹ�� ���");
			}else {
				System.out.println("3����� ù������ ���� ������ 4����� �ƴ�");
			}
		}else {
			System.out.println("c�� 4�� ��� ������ ��ø�̶� �ȿ��� ���� �ȵ�");
		}
		
		
		
	}

}
