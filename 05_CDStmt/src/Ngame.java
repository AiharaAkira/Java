import java.util.Random;
import java.util.Scanner;

public class Ngame {

	public static void main(String[] args) {

		// Number Game (Up Down)

		// 랜덤한 숫자가 하나 필요
		Scanner sc = new Scanner(System.in);
		// 랜덤 숫자 뽑을 준비
		Random r = new Random();

		// 랜덤 숫자 뽑기
		int comNum = r.nextInt(3) + 1; // 0부터 시작
		System.out.println(comNum); // 컴푸터가 뽑은 랜덤 숫자(개발자 확인용)

		System.out.println("1~3숫자를 입력해주세요 : ");
		int myNum = sc.nextInt();

		// 판정
		if (myNum == comNum) {
			System.out.println("정답입니다.");
		} else if (myNum > comNum) {
			System.out.println("다운!");

		} else {
			System.out.println("업!");

		}
	}

}
