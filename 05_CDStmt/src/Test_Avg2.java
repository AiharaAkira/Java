import java.util.Scanner;

public class Test_Avg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 성적 평균점수와 등급을 알려주는 프로그램

		// 입력받기(중간, 기말)

		// 평점 구하기

		// 판정
		// 90점이상 A(훌륭합니다)
		// 80점 이상 B(대단합니다)
		// 70점 이상 C(조금더 노력하세요)
		// 60점 이상 D(공부좀 해라)
		// 나머지 F(그래...)

		Scanner sc = new Scanner(System.in);

		System.out.println("중간 성적을 입력하세요(100점만점): ");
		int middle = sc.nextInt();
		System.out.println("기말 성적을 입력하세요(100점만점): ");
		int last = sc.nextInt();
		double avg = (double) (middle + last) / 2;
		System.out.printf("평점은%.2f\n", avg);

		if (avg >= 90) {
			System.out.println("등급은A");
		} else if (avg >= 80) {
			System.out.println("등급은B");
		} else if (avg >= 70) {
			System.out.println("등급은C");
		} else if (avg >= 60) {
			System.out.println("등급은D");
		} else {
			System.out.println("등급은F");
		}

	}

}
