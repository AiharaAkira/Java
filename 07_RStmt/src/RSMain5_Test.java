import java.util.Scanner;

public class RSMain5_Test {

	public static void main(String[] args) {
		/*
		 * ��ǰ��� 2. ��ǰ �˻� 3. ��ǰ ���� 4. ����
		 * 
		 * �� ��? (����ڰ� ���� �Է�)
		 * 
		 * 1�� �Է� '����մϴ�.' 2�� '�˻��մϴ�.'
		 * 						ǰ��(��¹�) 	3.'�����մϴ�.'���
		 * 4. �Է��ϸ� ���α׷� ����
		 * 
		 * �׿� ��ȣ �Է½� �Է� ���� ���
		 */
		
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("1. ��ǰ��� 2. ��ǰ�˻� 3. ��ǰ���� 4. ����");
			System.out.print("�� ��? : ");
			int userAns = sc.nextInt();
			if(userAns == 1) {
				System.out.println("����մϴ�.");
			}
			
			else if(userAns == 2) {
				System.out.println("�˻��մϴ�.");
				System.out.print(" ǰ��: ");
				String productName = sc.next();
			}
			
			else if(userAns == 3) {
				System.out.println("�����մϴ�.");
				
			}
			
			else if(userAns == 4) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�Է¿���");
			}
		}

	}

}
