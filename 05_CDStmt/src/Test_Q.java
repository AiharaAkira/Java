import java.util.Scanner;

public class Test_Q {

	public static void main(String[] args) {
		
		//문제
		
		Scanner sc = new Scanner(System.in);
		System.out.println("어려워요??");
		
		System.out.println("1. 그렇다\t\t2. 아니다");
		int ans = sc.nextInt();
		
		if(ans == 1){
			System.out.println("힘내세요");
		}else if(ans == 2) {
			System.out.println("좋네요");
		}else {
			System.out.println("입력 오류");
		}
		
		System.out.println("___________________________");
		
//		System.out.println("어려워요 ??");
//		
//		System.out.println("가. 그렇다\t\t나. 아니다");
//		String ans = sc.next();
//		
//		if(ans.equals("가")) {
//			System.out.println("힘내세요");
//		} else if(ans.equals("나")) {
//			System.out.println("좋네요");
//		} else {
//			System.out.println("입력 오류");
//		}
//		
//		System.out.println("--------------------------------");
		
		
		
	}

}
