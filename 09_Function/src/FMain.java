
//함수
// 관련있는 작업을 한데 묶어 정의 해놓고
//필요할때 불러 쓴다.

/*
 * 1. 함수정의
 * public static void 함수명(){
 * 내용
 * }
 * 1)함수의 인자(argument), 매개변수(parameter): 함수수행에 필요한 것들
 * public static void 함수명(자료형 변수명, 자료형 변수명, ..(parameter)){
 * 내용
 * }
 *	호출
 *	2)함수명(2); // 여기서 숫자 2가 인자 (argument) : 실제 그 값
 *
 */

public class FMain {
	
	public static int calculatorPlus(int x, int y) {
		return x+y;
	}
	public static void ballMan(String ball) {
		System.out.println("창고 가서 (공가지러)");
		if (ball.equals("축구")) {
			System.out.println("축구공 가지고 운동장 가");
		} else if (ball.equals("농구")) {
			System.out.println("농구공 가지고 강당 가");
		} else {
			System.out.println();
		}

		System.out.println("체육 시간 끝나면 공은 제자리에");
	}

	public static void info() {
		System.out.println("이름: mw");
		System.out.println("나이: 20");
	}

	public static void pushUp(int count) {
		System.out.println("엎드려");
		System.out.println("--------------------------");
		for (int i = 0; i < count; i++) {
			System.out.println("팔굽혀");
			System.out.println("팔 펴");
		}
	}

	public static void main(String[] args) {

		info();

		System.out.println("____________________________");

		pushUp(3);// 여기 쓴 숫자 3이 인자(argument)

		System.out.println("___________________________");

		// test
		// 농구 or 축구 입력에 따라 다른 처리.

		// 창고 가서 (공가지러)
		// 농구공 가지고 강당 가
		// 축구공 가지고 운동장 나가
		// 체육시간 끝나면 공은 제자리에
		pushUp(2);
		ballMan("축구");
		
		System.out.println("____________________________________");
		
		System.out.println(calculatorPlus(1, 2));

	}

}
