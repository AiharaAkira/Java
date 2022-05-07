
public class RSMain3 {

	public static void main(String[] args) {

		// 중첨 for

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");

			for (int j = 0; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", dan, j, dan * j);
			}
			System.out.println("");
		}

		System.out.println("______________________________________");
		// z -> zzzzz

//		String z = "" ;
//		for(int i = 1; i <= 5; i++) {
//			z += "z";
//			System.out.println(z);
//		}

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("z");
			}

			System.out.println();

		}
		System.out.println("___________________");

		// zzzz > z

		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("z");
			}
			System.out.println();
		}

		System.out.println("___________________");

		/*
		 * 2중 for문만 쓰면 다른건 자유롭게 z z zz zz zzz
		 * 
		 * 
		 * z 
		 *  z 
		 *   z 
		 *    z 
		 *     z
		 * 
		 z

  z

   z

    z

     z
		 */

		// 높이
		String z = "z";
		for (int i = 1; i <= 5; i++) {

			// 라인
			for (int j = 1; j < 2; j++) {
				System.out.print(z);
				if (i % 2 == 0) {
					z += " z";
				}
			}
			System.out.println("");
		}

		System.out.println("_________________________");

		// 높이
		
		for (int i = 1; i <= 5; i++) {
			
			// 라인
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");

			}

			System.out.println("z");

		}

		System.out.println("_________________________");
	//높이	
	for (int i = 1; i <= 5; i++) {
			
			// 라인
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");

			}
			
			System.out.println("z");
			System.out.println("");

		}
	
	System.out.println("_________________________");
	
	

	}
	
	

}
