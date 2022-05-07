
public class CDMain4 {

	public static void main(String[] args) {
		
		int a = 4;
		//if, else if(여러개의 조건 중 하나만)
		
		//1. 5배수 조건 "a 는 의배수 출력"
		//2. 2배수 조건 "a 는 의배수 출력"
		//3. 4배수 조건 "a 는 의배수 출력"
		//4. "해당 없음"
		
		
		if(a % 5 == 0) {
			System.out.println(a +"는 5의배수 출력");
		}else if (a % 2 == 0) {
			System.out.println(a +"는 2의배수 출력");
		}else if(a % 4 == 0) {
			System.out.println(a +"는 4의배수 출력");
		}else {
			System.out.println("해당 없음");
		}
		
//		위같은 문제 발생시 다중 if 
		
		if (a % 2 == 0) {
			System.out.println(a +"는 2의배수 출력");
		}
		
		System.out.println("______________________");
		
		if(a % 4 == 0) {
			System.out.println(a +"는 4의배수 출력");
		}else if(a % 5 == 0) {
			System.out.println(a +"는 5의배수 출력");
		}
		
		// 중첩 if 문 : 두 조건이 참일때 두 조건 모두 실행
		//첫번째 if 문이 참일때 실행
		
		int b = 10;
		
		if(b % 2 == 0) {
			System.out.println(b +"는 2의배수 출력");
			if(b % 5 == 0) {
				System.out.println(b +"는 5의배수 출력");
			}
		}
		
		int c = 4;
		
		//중복 if는 첫번째 조건이 참이여야 됨
		if(c % 3 == 0) {
			System.out.println(c +"는 3의배수 출력");
			
			if(c % 4 == 0) {
				System.out.println(c +"는 4의배수 출력");
			}else {
				System.out.println("3배수라 첫문장은 실행 됐지만 4배수는 아님");
			}
		}else {
			System.out.println("c에 4가 들어 있지만 중첩이라 안에꺼 실행 안됨");
		}
		
		
		
	}

}
