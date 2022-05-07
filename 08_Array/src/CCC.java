import java.util.Random;
import java.util.Scanner;

public class CCC {

	public static void main(String[] args) {

		// 참참참

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String[] table = { "", "왼쪽", "오른쪽", "위", "아래", "가만히" };

		while (true) {

			System.out.println("-----------------------------");
			System.out.println("1. 왼쪽");
			System.out.println("2. 오른쪽");
			System.out.println("3. 위");
			System.out.println("4. 아래");
			System.out.println("5. 가만히");

			int comFace = r.nextInt(5) + 1;
			System.out.println(comFace);// 개발자 테스트용
			System.out.println("어디? (숫자로 입력)");
			int myFace = sc.nextInt();

			// 판정
			if(myFace < 1 || myFace > 5) {
				System.out.println("입력오류");
				continue;
			}
			System.out.printf("나 : %s", table[myFace]);
			System.out.printf(" vs 컴 : %s", table[comFace]);

			if (myFace == comFace) {
				System.out.println("걸림");
				System.out.println(count + "번 버텼다.");
				System.out.println(count + 1 + "번 경기 치름");
				break;
			} else {
				System.out.println("피함");
				count++;
			}
		}

	}

}
