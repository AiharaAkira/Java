import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		
		//Ű���� �Է¹��� �غ� 
		Scanner keyboard = new Scanner(System.in);
		
		//�̸��� �Է� �ޱ�
		System.out.print("�̸��� �Է�: ");
		String name = keyboard.next();
		
		//���̸� �Է� �ޱ�
		System.out.print("���̸� �Է�: ");
		int age = keyboard.nextInt();
		
		System.out.println(name + "�� ����� " + age + "�� �Դϴ�.");
		
		
		
		
	}

}
