
public class TCMain {

	public static void main(String[] args) {

		// �� ��ȯ(Type Casting)
		// �ڷ���(�׸� ����) �ٲٴ� ��
		
		//�⺻ �ڷ���
		/*
		 * int�� int ���� : ����� int
		 * int�� double ���� : ����� double 
		 * 
		 */
		double a = 10 / 4;
		System.out.println(a);
		
		// int 21��... long�� int ���� ū �׸�
		
		int aa = 10;
		long bb = aa; // int -> long
		
		System.out.println(bb);
		
		int cc = (int) bb ;  //long -> int
		
		double dd = cc;
		
		int ee = (int)dd; // double -> int
		
		// -- �����ٿ� ���콺�� ����ȯ ����
		
		int b = 5;
		
		System.out.println(ee + b);
		
		System.out.println("___________________________");
		
		/*
		 *String + ? = String 
		 */
		
		String ff = ee + "";	//int -> String
		System.out.println(ff);	// ���� 10
		
		System.out.println(ff + b);
		
		
		
		
	}

}
