import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		//숫자 4개를 하나씩 입력 
		Scanner sc = new Scanner(System.in);
		
		
		
		//ex 입력 1 = 
		System.out.print("숫자를 입력해 주세요: ");
		int userNum1 = sc.nextInt();
		//사용자가 숫자 하나입력
		//입력 2
		System.out.print("두번째 숫자를 입력해 주세요: ");
		int userNum2 = sc.nextInt();
		//사용자가 숫자하나 입력 
		//2개++
		System.out.print("세번째 숫자를 입력해 주세요: ");
		int userNum3 = sc.nextInt();
		System.out.print("네번째 숫자를 입력해 주세요: ");
		int userNum4 = sc.nextInt();
		
		// 총합 == 
		int total = userNum1 + userNum2 + userNum3 + userNum4;
		System.out.println("합계: " + total);
		// 입력값더함 = 총합
		System.out.printf("상세결과: %d + %d + %d + %d = %d\n", userNum1, userNum2, userNum3, userNum4, total);
		
		//검색출력하기 % 탭키, 줄바꿈
		//탭: \t
		//줄바꾸기 : \n
		
		//carriage return (커서를 맨 앞으로) : \r\t
		
		//test
		
		//키보드 입력받을 준비
		
		
		
		

	}

}
