import java.util.Random;
import java.util.Scanner;

public class Test_OE {

	public static void main(String[] args) {
		
		//Test
		//Odd Even
		
		//���� ���� ����
		Random r = new Random();
		int rNum = r.nextInt(45)+1;
		
		//���� �Է� ��
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1�̻� ���ڸ� �Է��Ͻÿ�: ");
		int playerNum = sc.nextInt();
		
		if(playerNum%2 == 0 && rNum%2 == 0) {
			System.out.println("����!");
		}else if(playerNum%2 == 1 && rNum%2 == 1){
			System.out.println("����!");
		}else {
			System.out.println("��!");
		}
		
	}

}
