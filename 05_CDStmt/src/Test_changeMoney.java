import java.util.Scanner;

public class Test_changeMoney {

	public static void main(String[] args) {

		// 잔돈 계산 해주는 프로그램

		// 이렇게 입력하면
		// 12348546

		// 5만원 : 2장
		// 1만원 5천원 1천원
		// 500원 100원 50원 10원 1원(잔돈계산 불가 불가 금액 4원)

		Scanner sc = new Scanner(System.in);
		System.out.print("거스름 돈 계산: ");

		int money = sc.nextInt();
		
		

		if (money >= 50000) {
			int fiftyT = money / 50000;
			System.out.println("5만원권" + fiftyT + "장");
			money %= 50000;
		}

		if (money >= 10000) {
			int tenT = money / 10000;
			System.out.println("1만원권" + tenT + "장");
			money %= 10000;
		}

		if (money >= 5000) {
			int fiveT = money / 5000;
			System.out.println("오천원권" + fiveT + "장");
			money %= 5000;
		}

		if (money >= 1000) {
			int thousand = money / 1000;
			System.out.println("천원권" + thousand + "장");
			money %= 1000;
		}

		if (money >= 500) {
			int fiveH = money / 500;
			System.out.println("500원" + fiveH + "개");
			money %= 500;
		}

		if (money >= 100) {
			int hundred = money / 100;
			System.out.println("100원" + hundred + "개");
			money %= 100;
		}

		if (money >= 50) {
			int fifty = money / 50;
			System.out.println("50원" + fifty + "개");
			money %= 50;
		}

		if (money >= 10) {
			int ten = money / 10;
			System.out.println("10원" + ten + "개");
			money %= 10;
		}

		if (money >= 1) {
			int nokori = money / 1;
			System.out.println("거슬러 줄수 없습니다. 1원" + nokori + "개");
		}

	}

}
