import java.util.Random;
import java.util.Scanner;

public class RSMain4_Test {

	public static void main(String[] args) {
//		��ǻ�Ͱ� 0~3 ���� ������
		Random r = new Random();
		int com = r.nextInt(4);
		
		Scanner sc = new Scanner(System.in);
		
		
		//���� �Է��Ѱ� �� ���ڶ� ��ġ�Ҷ����� �ݺ�(���߸� ��)
		while(true) {
			
			System.out.println(com);//������ ��
			
			System.out.print(" ���ڸ� �Է��ϼ���: ");
			int myNum = sc.nextInt();
			
			if(com == myNum) {
				System.out.println("������ :" + com);
				break;
			}
			
			if(com != myNum) {
				System.out.println("��!");
			}
			
		}
		
		//Ȧ¦
		
		
		while(true) {
			int powerBall = r.nextInt(1) + 1;
			System.out.println(powerBall); // ������ Ȯ�ο�
			
			
			
			System.out.print(" ���ڸ� �Է��ϼ���(1 or 2 3.����): ");
			int myNum = sc.nextInt();
			
			if(myNum >3) {
				System.out.println("���ڸ� ����� �Է��ض�.");
				continue;
			}
			
			if(myNum % 2 == 0 && powerBall % 2 == 0) {
				System.out.println("����!");
				break;
			}else if(myNum % 2 == 1 && powerBall % 2 == 1) {
				System.out.println("����!");
				break;
			}else if(myNum == 3) {
				System.out.println("����");
				break;
			}else {
				System.out.println("��!");
			}
			
		}
		
		//���ٿ�
		// ��� �õ� �ؼ� ������ ������� 
		
		int count = 0;
		int upDown = r.nextInt(100) + 1;
		System.out.println(upDown);//�׽�Ʈ��
		while(true) {
			
			System.out.print(" ���ڸ� �Է��ϼ���: ");
			int myNum = sc.nextInt();
			
			if(myNum > 100 || myNum <= 0) {
				System.out.println("�Է¿���, ������ Ȯ���ϼ���.");
				continue;
			}
			
			//����
			if(myNum == upDown) {
				count ++;
				System.out.println("����! ������ "+ upDown +"�Դϴ�.");
				
				System.out.println(count+"�� ���� ����׿�~");
				break;
			}else if(myNum > upDown && myNum < 100) {
				count ++;
				System.out.println("��! downdown");
				
			}else if(myNum < upDown && myNum < 100){
				count ++;
				System.out.println("��! upup");
				
			}else if(myNum > 100 || myNum <= 0){
				count ++;
				System.out.println("100������ ���� �Է��Ͽ� �ּ���");
				
			}
			
		}

	}

}
