

public class RSMain {

	public static void main(String[] args) {

		// Repeat Stmt(반복문)

		/*
		 * for(초기화; 조건; 증감){
		 * 
		 * }
		 */
//		반복횟수가 명확하면 for
		for (int i = 0; i < 5; i++) {

			System.out.println("hello");

		}

		// 반복횟수가 명확하지가 않으면 while
		// 증감식이 없으면 무한 루프
		int z = 0;
		while (z < 5) {
			System.out.println("hi");
			z++;
		}

//		zzz를 콘솔로 3번 출력

		for (int j = 0; j < 3; j++) {
			System.out.println("zzz");
		}
		
		for(int j = 0; j < -1; j++) {
			System.out.println("1");
		}
		
		for(int j = 0; j < 2; j+=2) {
			System.out.println("2");
		}

	}

}
