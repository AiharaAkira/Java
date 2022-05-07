import java.util.Scanner;

public class RsMain5 {

	public static void main(String[] args) {
//		break : 현재 위치에서 가장 가까운 switch문 또는 반복문 탈출
//		continue : 현재 반복을 건너 뛰고 증감식으로 넘어감. (다음 반복을 진행)

		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {

				continue;
			}
			System.out.println(i);
		}

		// 레이블(기능은 좋음, 사람들이 안씀)
//		aaa: for(int i = 0; i < 3; i++) {
//			
//		
//		bbb: while (true) {
//
//			Scanner k = new Scanner(System.in);
//			System.out.println("정답은 ? : ");
//			int ans = k.nextInt();
//
//			switch (ans) {
//			case 1:
//				System.out.println("1번");
//				break;
//
//			case 2:
//				System.out.println("2번");
//
//				break;
//
//			case 3:
//				System.out.println("3번");
//
//				break;
//
//			case 4:
//
//				System.out.println("4번 종료");
//				break aaa;
//
//			default:
//				System.out.println("입력오류");
//				break;
//			}
//		}
//		}
		
		 while (true) {

			Scanner k = new Scanner(System.in);
			System.out.println("정답은 ? : ");
			int ans = k.nextInt();

			switch (ans) {
			case 1:
				System.out.println("1번");
				break;

			case 2:
				System.out.println("2번");

				break;

			case 3:
				System.out.println("3번");

				break;

			case 4:

				System.out.println("4번 종료");
				break ;

			default:
				System.out.println("입력오류");
				break;
			}
		}

	}

}
