import java.util.Random;
import java.util.Scanner;

public class RSPMain {

	public static void main(String[] args) {

		// 가위 바위 보

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int challenge = 0;
		int win = 0;
		// 연승
		int winwin = 0;
		// 최대 연승
		int maxwin = 0;

		String hand[] = { "", "가위", "바위", "보" };
		while (true) {

			System.out.println("----------------------");
			System.out.println("1. 가위");
			System.out.println("2. 바위");
			System.out.println("3. 보");
			System.out.println("4.게임 종료");
			System.out.println("-------------------");

			int comNum = r.nextInt(3) + 1;
			System.out.println("컴퓨터 숫자 : " + comNum);// 개발자 확인용

			System.out.println("뭐? (숫자로) ");

			int playerNum = sc.nextInt();

			if (playerNum < 1 || playerNum > 4) {
				System.out.println("잘못 입력");
				System.out.println("잘못 입력");
				System.out.println("잘못 입력");
				System.out.println("잘못 입력");
				System.out.println("잘못 입력");
				System.out.println("잘못 입력");
				System.out.println("잘못 입력");
				continue;
			}

			// 판정
			System.out.println("나 : " + playerNum);
			System.out.println(" vs 컴퓨터 : " + comNum);
			// c - p = -1 짐
			// c 
			if (comNum == playerNum) {
				System.out.println("비김");
				winwin = 0;
				win++;
				challenge++;

			} else if ( playerNum - comNum  == -1 || playerNum - comNum == 2) {
				
				challenge++;
				System.out.println("짐");

				System.out.println("도전횟수 : " + challenge);
				System.out.println("비기거나 이긴 횟수 : " + win);
				System.out.println("연승 : " + winwin);
				System.out.println("최대연승 : " + maxwin);
				break;
			}  else if (playerNum == 4) {
				System.out.println("도전횟수 : " + challenge);
				System.out.println("비기거나 이긴 횟수 : " + win);
				System.out.println("연승 : " + winwin);
				System.out.println("최대연승 : " + maxwin);
				System.out.println("게임을 종료합니다. ^^ 7");
				break;
			} else {
				System.out.println("이김");
				win++;
				winwin++;
				if (winwin > maxwin) {
					maxwin = winwin;
				}

				challenge++;

			}

		}

	}

}
