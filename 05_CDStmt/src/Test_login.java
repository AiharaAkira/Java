import java.util.Scanner;

public class Test_login {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//id, pw
		
		System.out.println("id�� �Է����ּ���:");
		String id = sc.next();
		System.out.println("pw�� �Է����ּ���:");
		String pw = sc.next();
		
		
		
		//id ���� �����ϴ� id pw ���� ���� -�� ������
		
		//id- cmw
		//pw- dlajalfdkjfljfa23212
		
//		if(id.equals("cmw") && pw.equals("dlajalfdkjfljfa23212")) {
//			System.out.println("�α��� ����");
//		}else if(id.equals("cmw")) {
//			System.out.println("�н����� ����");
//		}else if(pw.equals("dlajalfdkjfljfa23212")) {
//			System.out.println("���̵� ����");
//		} ���̵� Ʋ���� ���� �н����带 �Ǵ��� �ʿ䰡 ����.
		
		if(id.equals("cmw")) {
			
			if(pw.equals("dlajalfdkjfljfa23212")) {
				System.out.println("�α��� ����");
			
			}else {
				System.out.println("�н����� ����");
			}
		}else {
			System.out.println("���̵� ����");
		}
	}

}
