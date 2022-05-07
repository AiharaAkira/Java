
public class AMain5 {

	public static void main(String[] args) {

		// 2차원 배열

		// 학생들의 키, 체중

		int[][] stud = { { 180, 80 }, { 170, 70 }, { 160, 60 }, };
		// 첫번째 학생의 키
		System.out.println(stud[0][0]);

		// 세번째 학생의 체중
		System.out.println(stud[2][1]);

		// 두번째 학생의 체중
		System.out.println(stud[1][0]);

		System.out.println("____________________________________");

		// 이름, 사는 곳
		String[][] ss = { { "건우", "서대문" }, { "재식", "종로" }, { "김초롱", "동대문" } };

		// 두번째 사람 사는 곳
		System.out.println(ss[0][1]);
		// 첫번째 사람 이름
		System.out.println(ss[0][0]);
		// 세번째 사람 사는 곳, 이름
		System.out.println(ss[2][0] + " 	" + ss[2][1]);

		System.out.println("____________________________________");

		int[][] ar = new int[3][4];

		// Test
		// 값을 세팅 이중 포문
		int num = 1;
		// 행
		for (int i = 0; i < 3; i++) {
			// 열
			for (int j = 0; j < 4; j++) {

				ar[i][j] = num++;
//				ar[i][j] = num;	
//				num++;
				System.out.print(ar[i][j] + "\t");
			}
			System.out.println();
		}

		// 출력
		System.out.println("_____________________________________________");
		// [면][행][열]
		int[][][] aa = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } } };
		
		System.out.println(aa[0][2][2]);
		System.out.println(aa[1][1][0]);

	}

}
