
public class AMain2 {

	public static void main(String[] args) {

		// 학생의 일어점수 90점
		int jpScore = 90;
		System.out.println(jpScore);

		// 배열 (참조형)
		// 학생 5명의 영어 점수
		// 들어갈 값(요소, element)을 모를때
		int[] engScore = new int[5]; // 5칸 (칸은 인덱스, 색인)
		System.out.println(engScore);

		engScore[0] = 100;
		engScore[1] = 90;
		engScore[2] = 80;
		engScore[3] = 70;
		engScore[4] = 60;

		System.out.println("4번째 학생의 점수: " + engScore[3]);
		System.out.println("_______________________________");

		// 값을 알고 있을 때(변수 선언, 초기화를 동시에)

//		int[] engTest = new int[] {10, 20, 30, 40, 50};
		int[] engTest = { 10, 20, 30, 40, 50 };
		System.out.println(engTest[1]);
		System.out.println(engTest.length); // 몇 칸 짜리?

		System.out.println("1______________________________________________");

		// jpScore
		int[] jpTest = { 50, 60, 70, 80, 90 };

		// 배열의 길이 출력
		System.out.println(jpTest.length);

		// 전체 평균계산해서 출력
		int sum = 0;
		for (int i = 0; i < jpTest.length; i++) {
			sum += jpTest[i];
		}

//		sum = jpTest[0] + jpTest[1] + jpTest[2] + jpTest[3] + jpTest[4];
		// 평균출력
		int avg = sum / jpTest.length;
		System.out.println("sum = " + avg);

		System.out.println("2______________________________________________");

		for (int i = 0; i < jpTest.length; i++) {
			System.out.println(jpTest[i]);
		}

		System.out.println("3______________________________________________");
		// foreach(배열) 증감 개념 없음 순차적
		for (int asd : jpTest) {
			System.out.println(asd);
		}

		System.out.println("4.______________________________________________");

		// engScore 2번째

		// 그거의 길이(크기)
		System.out.println(engScore.length);
		// for문으로 하나씩 출력
		for (int i = 0; i < engScore.length; i++) {
			System.out.println(engScore[i]);
		}
		// foreach
		for (int i : engScore) {
			System.out.println(i);
		}

		System.out.println("5.______________________________________________");

		// 김초롱, 재식, 건우

		String[] name = { "김초롱", "재식", "건우" };

		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}

		for (String s : name) {
			System.out.println(s);
		}
		System.out.println("6.______________________________________________");

		int[] push = new int[5];

		// 만들고 초기화를 안하면 0이 자동으로 들어감
		for (int i = 0; i < push.length; i++) {
			System.out.println(push[i]);

		}
		System.out.println();

		for (int i = 0; i < push.length; i++) {
			push[i] = i + 1;
			System.out.println(push[i]);

		}

		// 저장된 것 다 더하기
		sum = 0;
		for (int i = 0; i < push.length; i++) {
			push[i] = i + 1;

			sum += push[i];

		}
		System.out.println(sum);
		System.out.println("________________________________________________");

		int sum1 = 0;
		int avg1 = 0;
		for (int i : jpTest) {
			sum1 += i;

		}

		avg1 = sum1 / jpTest.length;

		System.out.println(avg1);
	}

}
