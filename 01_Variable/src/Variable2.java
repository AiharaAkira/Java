
public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);

		// �ڷ���
		/*
		 * 1.�⺻�� int, double, char, boolean �޸� ������ stack ������ ���� �����Ͱ� ���� stack������ �����͵���
		 * ���α׷� ����� �ڵ�ó��
		 * 
		 * 2.������ ��ü�� ���� ���� ��Ÿ���� �ڷ��� String ���� �� heap������, stack���� �ִ� heap������ �������� ����
		 * heap������ �������� ���� ����ߵ� �ڹٴ� �ڵ� ������ >> GC(Garbage Collection) C�� �������� �ʼ� byte
		 * 127, short 32222, int 21��, long
		 */
		byte aa = 100;
		long myAge = 2200000000L; // long ����

		// 2. �Ǽ���
		// float, double
		// double �� ����(default)

		double eyeSight = 0.6;
		System.out.println(eyeSight);

		float eye = 0.5f;

		// 3. ����(�� ����) - �ƽ�Ű�ڵ�
		char gender = '��';
		System.out.println(gender);

		// 4. ���� / ���ڿ� (��������)
		String name = "choiminwoo";
		System.out.println(name);

		/*
		 * ���� int, �Ǽ� double, ���� String
		 */

//			5. ���� boolean 
		boolean soldOut = true;
		System.out.println(soldOut);
		
		int a = 10;
		int b = 20;
		
		System.out.println(a < b);
		boolean judge = (a > b);
		System.out.println(judge);
		
		int c,d,e;
		c=1;
		d=1;
		e=1;
		
//		6.�ƹ��͵� ���� 
//		void
	}

}
