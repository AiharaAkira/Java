
public class CDMain3 {

	public static void main(String[] args) {
		
		/*
		 * if, else if, else(���� ������ �ϳ���)
		 */
		
		int age = 12;
		
//		1. ���̰� 20���̻��̸� "�������"
//		2. ���̰� 15 <= ���� < 20 �̸� "�� ũ�� ������"
//		3. 10 <= ���� < 15 �̸� "����"
//		4. �������� "�Ϳ���"
		
//		if(age >= 20) {
//			System.out.println("�������");
//		}else {
//			if(age >= 15 ) {System.out.println("�� ũ�� ������");
//		}else {
//			if(age >= 10 ){System.out.println("����");}
//		}else {
//			System.out.println("�Ϳ���");
//			}
//		}
		
		System.out.println("___________________________");
		if(age >= 20) {
			System.out.println("�������");
		}else if (age >= 15) {
			System.out.println("��ũ�� �Ͷ�");
		}else if (age >= 10) {
			System.out.println("����");
		}else {
			System.out.println("�Ϳ���");
		}
		
		//test
		
		//Ű�� 150 �̻��̸� Welcome
//		130 <= Ű < 150 �̻��̸� Welcome Friend
//		100 <= Ű < 130 �̻��̸� Welcome Boy
//		�������� Get out	
		
		int height = 120;
		
		if(height >= 150) {
			System.out.println("Welcome");
		}else if (height >= 130) {
			System.out.println("Welcome Friend");
		}else if (height >= 100) {
			System.out.println("Welcome Boy");
		}else {
			System.out.println("Get out");
		}
		
		
	}
	
	

}
	
