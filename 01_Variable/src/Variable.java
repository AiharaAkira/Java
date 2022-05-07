import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		
		//키보드 입력받을 준비 
		Scanner keyboard = new Scanner(System.in);
		
		//이름을 입력 받기
		System.out.print("이름을 입력: ");
		String name = keyboard.next();
		
		//나이를 입력 받기
		System.out.print("나이를 입력: ");
		int age = keyboard.nextInt();
		
		System.out.println(name + "님 당신은 " + age + "살 입니다.");
		
		
		
		
	}

}
