

public class RSMain {

	public static void main(String[] args) {

		// Repeat Stmt(�ݺ���)

		/*
		 * for(�ʱ�ȭ; ����; ����){
		 * 
		 * }
		 */
//		�ݺ�Ƚ���� ��Ȯ�ϸ� for
		for (int i = 0; i < 5; i++) {

			System.out.println("hello");

		}

		// �ݺ�Ƚ���� ��Ȯ������ ������ while
		// �������� ������ ���� ����
		int z = 0;
		while (z < 5) {
			System.out.println("hi");
			z++;
		}

//		zzz�� �ַܼ� 3�� ���

		for (int j = 0; j < 3; j++) {
			System.out.println("zzz");
		}
		
		for(int j = 0; j < -1; j++) {
			System.out.println("1");
		}
		
		for(int j = 0; j < 2; j+=2) {
			System.out.println("2");
		}

	}

}
