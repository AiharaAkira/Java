
public class Operator2 {

	public static void main(String[] args) {

		// 논리 연산자 : 결과로 boolean 나오는 것

		// >, <, <= <=, ==, !=

		int x = 10;
		int y = 20;

		boolean a = x > y;
		System.out.println(a);

		// 결합 연산자 : 논리 연산자 여러개 묶는 거

		// 숫자7 특수문자
		// &&(AND) :A && B :AB모두만족 참
		// ||(OR) :A || B :AB 둘중에 하나만 만족 참

		// & (XOR) :A ^ B : A나 B 둘 중 하나만 만족해야 TRUE

		// 단항 연산자
		// !(NOT) : !A : A의 결과를 반대로
		System.out.println("--------------------------------------");

		// x가 5보다 크고, y가 10보다 작나?
		boolean b = x > 5 && y < 10;
		System.out.println(b);

		// x가 5보다 크거나 y가 10보다 작나?
		boolean c = x > 5 || y < 10;
		System.out.println(c);
		System.out.println("------------------------------------------");

		// 놀이기구를 타도 되는지 안되는지 체크하는 프로그램

		// 키, 나이

		int height = 180;
		int age = 30;

		// 나이가 10살 이상이고, 키가 200넘으면 타도 됨
		boolean ok = age >= 10 && height > 200;

		// 키가 200 넘고 나이가 10살 이상이면 타도됨
		ok = height > 200 && age >= 10;
		System.out.println(ok);

		// 나이가 10살 이상이거나, 키가 200 넘으면 타도 됨
		// 확률이 낮은 것을 앞으로 배치하면 연산 횟수를 줄일 수 있다.
		boolean ok2 = age >= 10 || height > 200;

		ok2 = height > 200 || age >= 10;

		System.out.println(ok2);

		// 키가 200이 넘으면 타면 안됨

		boolean heightPassNot = !(height > 200);
		System.out.println(heightPassNot);

		System.out.println("__________________________");

		// 삼항 연산자

		// 조건식 ? 조건 만족시 값 (true): 조건 불만족시 값(false)

		// 나이가 8살이 넘으면 Welcome, 안넘으면 Go home
		String msg = age > 8 ? "welcome" : "go Home";
		System.out.println(msg);

		// 입장료
		// 키가 200넘거나 나이가 20 이상이면 10000원, 아니면 5000원
		int ticket = height > 200 || age >= 20 ? 10000 : 5000;
		System.out.println(ticket);

		// 할인
		// 홀수 age % 2 == 1
		// 나이가 짝수면 1000원, 아니면 500원 할인
		int discount = age % 2 == 0 ? 1000 : 500;
		// 총요금
		
		int total = ticket - discount;
		
		// 입장료 - 할인
		System.out.println("입장료	:	" + ticket + "원");
		System.out.println("할인	: 	" + discount + "원");
		System.out.println("총요금	:	" + total + "원");
		
	}

}
