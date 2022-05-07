import java.util.Scanner;

public class CSMain5 {

	public static void main(String[] args) {
		// if참 else 아닐때 <==>삼항연산자
		// switch case <=> if 문

		String line = "호남선";

		// line 이 경원선이면 타는 곳 1번
		// line 이 경부선이면 타는 곳 2번
		// line 이 호남선이면 타는 곳 3번

		switch (line) {
		case "경원선":
			System.out.println("타는곳 1번");
			break;
		case "경부선":
			System.out.println("타는곳 2번");
			break;
		case "호남선":
			System.out.println("타는곳 3번");
			break;

		default:
			break;

		}

		Scanner sc = new Scanner(System.in);

		System.out.println("몇번 메뉴?(1~4)");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("아메리카노");
			break;
		case 2:
			System.out.println("카페라떼");
			break;
		case 3:
			System.out.println("바닐라라떼");
			break;
		case 4:
			System.out.println("모카라떼");
			break;
		default:
			System.out.println("그런메뉴 없다.");
			break;
		}

		System.out.println("_______________________");

		String grade = "일병";
		if (grade.equals("이병")) {
			System.out.println("눈치");
			System.out.println("관등성명");
			System.out.println("훈련");
			System.out.println("잠");
		} else if (grade.equals("일병")) {
			System.out.println("관등성명");
			System.out.println("훈련");
			System.out.println("잠");
		} else if (grade.equals("상병")) {
			System.out.println("훈련");
			System.out.println("잠");
		} else if (grade.equals("병장")) {
			System.out.println("잠");
		}

		switch (grade) {
		case "이병":

			System.out.println("눈치");

		case "일병":

			System.out.println("관등성명");

		case "상병":

			System.out.println("훈련");

		case "병장":

			System.out.println("잠");

		}

		// 똑같은 내용이 반복 될때는 스위치가 좋다.

		// 1~9 업어주기
		// 20대 술먹으러
		// 30대
		int age = 21;

		switch (age) {
		case 10, 11, 12, 13, 14, 15, 16, 17, 18, 19:
			System.out.println("업어주기");
			break;

		case 20, 21, 22, 23, 24, 25, 26, 27, 28, 29:
			System.out.println("업어주기");
			break;

		case 30, 31, 32, 33, 34, 35, 36, 37, 38, 39:
			System.out.println("업어주기");
			break;

		default:

			break;
		}
		
		
		

	}
}
