import java.util.Scanner;

public class FMain2 {
	// 월급을 넣으면 연봉을 구해서 '출력' 해주는 함수
	public static void calSalary(int salary) {
		System.out.println("연봉: " + salary * 12 + "원");
	}

	// 월급을 넣으면 연봉을 구해주는 함수
	public static int calSalary2(int salary) {
		return salary * 12;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		calSalary(100);
		System.out.println(calSalary2(100));
		System.out.println("______________________________");
		// 부가세 구하기
		System.out.print("가격은?");
		int cost = sc.nextInt();
		System.out.println("부가세: " + calProduct(cost) + "원");
		System.out.println("______________________________");

		// 부가세 출력테스트

		System.out.print("가격: ");
		cost = sc.nextInt();
		calProductPrint(cost);
		;
		System.out.println("______________________________");
		// 중간기말 테스트

		System.out.print("중간점수: ");
		double middle = sc.nextInt();
		System.out.print("기말점수: ");
		double last = sc.nextInt();
		System.out.printf("%.2f점\n", calAvg(middle, last));
		System.out.println("______________________________");

		// 인삿말 테스트

		System.out.print("나이: ");
		int age = sc.nextInt();
		hiPrint(age);
		System.out.println("______________________________");
		System.out.println("더 큰 숫자 : " + BigNum(1, 2) );

	}

	// 상품 가격을 넣으면 부가세를 구해주는 함수
	public static int calProduct(int cost) {

		return (cost / 10);
	}

	// 상품 가격을 넣으면 부가세를 추력해주는 함수
	public static void calProductPrint(int cost) {

		System.out.println("부가세: " + cost / 10 + "원");
	}

	// test
//1.중간, 기말 점수를 넣으면 평균을 구해주는 함수(scanner)

	public static double calAvg(double middle, double last) {

		return (middle + last) / 2;
	}

//2.나이 넣으면 인사말을 출력 해주는 함수
	public static void hiPrint(int age) {
		if (age >= 10 && age < 20) {
			System.out.println("안녕");
		} else if (age >= 20 && age < 30) {
			System.out.println("안녕하세요");
		} else {
			System.out.println("안녕하십니까");
		}
	}
//10대:안녕
//20대 안녕 하세요
//그이상 안녕하십니까
	
	//숫자 2개를 넣으면 더 큰 숫자를 구해 주는 함수
	public static int BigNum(int x, int y) {
	
//		if(x < y) {
//			return y;
//		}
//		return x;
		return (x < y)? y : x;
	}

}
