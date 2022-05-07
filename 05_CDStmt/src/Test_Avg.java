import java.util.Scanner;

public class Test_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 성적 평균점수와 등급을 알려주는 프로그램

		// 입력받기(중간, 기말)

		// 평점 구하기

		// 판정
		// 90점이상 A
		// 80점 이상 B
		// 70점 이상 C
		// 60점 이상 D
		// 나머지 F

		Scanner sc = new Scanner(System.in);

		System.out.println("중간 성적을 입력하세요(100점만점): ");
		int middle = sc.nextInt();
		System.out.println("기말 성적을 입력하세요(100점만점): ");
		int last = sc.nextInt();
		double avg = (double) (middle + last) / 2;
		
		System.out.printf("평점은%.2f\n", avg);
		String grade = "F";
		
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			grade = "B";
		} else if (avg >= 70) {
			grade = "C";
		} else if (avg >= 60) {
			grade = "D";
		} 
		
		System.out.println("등급:" + grade);
		

	}

}
