import java.util.Scanner;

public class EHMain {
	
	public static void test() {
		int a = 1;
		int b = 0;
		try {
			int c = a/b;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		
		/*
		 * 에러(Error) : 자바 문법 안 맞는 거
		 * 				컴파일 못함
		 * 				프로그램 완성 안됨
		 * 				개발자의 잘못
		 * 경고(Warning) : 뒷정리 덜 했거나, 사용하지 않는 자원
		 * 					프로그램 정상 작동
		 * 					개발자 잘못
		 * 
		 * 예외 처리
		 * 
		 * 예외 (Exception) : 프로그램은 정상 작동
		 * 실행 할 때 발생하는 예외 상황 때문에 정상적인 실행이 안되는 거
		 * 개발자 x 사용자 잘못
		 */
		
		//일단 try 구문 실행, 문제가 발생하면 catch로 이동
		while(true) {
			
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x : ");
		int x = sc.nextInt();
		System.out.println("y : ");
		int y = sc.nextInt();
		
		try {
			System.out.println(x/y);
		} catch (Exception e) {
			System.out.print("0으로 나눌 수 없어요");
			e.printStackTrace(); // 개발자 확인용
		}
		}
		
		
		
		

	}

}
