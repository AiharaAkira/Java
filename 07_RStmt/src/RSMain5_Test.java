import java.util.Scanner;

public class RSMain5_Test {

	public static void main(String[] args) {
		/*
		 * 상품등록 2. 상품 검색 3. 상품 삭제 4. 종료
		 * 
		 * 몇 번? (사용자가 여기 입력)
		 * 
		 * 1번 입력 '등록합니다.' 2번 '검색합니다.'
		 * 						품명(출력문) 	3.'삭제합니다.'출력
		 * 4. 입력하면 프로그램 종료
		 * 
		 * 그외 번호 입력시 입력 오류 출력
		 */
		
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 상품등록 2. 상품검색 3. 상품삭제 4. 종료");
			System.out.print("몇 번? : ");
			int userAns = sc.nextInt();
			if(userAns == 1) {
				System.out.println("등록합니다.");
			}
			
			else if(userAns == 2) {
				System.out.println("검색합니다.");
				System.out.print(" 품명: ");
				String productName = sc.next();
			}
			
			else if(userAns == 3) {
				System.out.println("삭제합니다.");
				
			}
			
			else if(userAns == 4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("입력오류");
			}
		}

	}

}
