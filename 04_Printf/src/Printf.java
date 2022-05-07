import java.util.Scanner;

public class Printf {

	public static void main(String[] args) {

		// printf : 출력 형식 잡을 때 사용

		int a = 1;
		double b = 1.23456;
		String c = "abc";

		// %d : 정수형 변수 값 들어올 자리 - %03d : 3자리 수로 출력
		// %f : 실수형 변수 값 들어올 자리 - %.2ㄹ : 소수점 2자리로 출력
		// %s : String 변수 값 들어올 자리

		System.out.printf("%03d\n", a);
		System.out.printf("%.2f\n", b);
		System.out.printf("%s\n", c);

		// a는 oo이고 b는 oo이고 c는 oo이다
		System.out.println("a는 " + a + "이고 b는 " + b + "이고 c는 " + c + "이다.");
		System.out.printf("a는 %02d이고 b는 %.1f 이고 c는 %s 이다.\n", a, b, c);

		// test
		Scanner sc = new Scanner(System.in);

		// 이름 나이 키 체중 입력받기
		double height, weight;
		System.out.print("이름을 입력해주세요: ");
		String name = sc.next();
		System.out.print("나이을 입력해주세요: ");
		int age = sc.nextInt();
		System.out.print("키를 입력해주세요: ");
		height = sc.nextDouble();
		System.out.print("체중을 입력해주세요: ");
		weight = sc.nextDouble();
		// 결과 출력
		System.out.printf("이름\t:\t%s\n나이\t:\t%d살\n키\t:\t%.1fcm\n체중\t:\t%.2fkg\n ", name, age, height, weight);

		// 이름 : 00
		// 나이 : 00
		// 키 : 00
		// 체중 : 00
		// 조건
		// 신장과 체중은 소수점 이하 몇자리를 입력하든, 신장은 소수점 1자리, 체중은 소수점 2자리

		System.out.println("_____________________");

		// 출력결과
		/*
		 * 003)-------------- Model : i6 cost : 1200$ Weight : 120.5g Designed Ny
		 * "Apple"
		 * 
		 */

		// 제품번호는 그냥 int num = 3; 넣어서 시작
		// 회사가 "" 로 묶여 있는데 알아서 처리
		// 입력받을 내용 (모델, 가격, 무게, 회사)

		String model, compony;
		int num = 3;
		System.out.println("제품번호 :");
		int modelNum = sc.nextInt();
		System.out.println("모델명: ");
		model = sc.next();
		System.out.println("회사명: ");
		compony = sc.next();
		System.out.println("가격: ");
		int cost = sc.nextInt();
		System.out.println("무게: ");
		double weightOfM = sc.nextDouble();

		System.out.printf("* %03d)%d\n* Model\t:\t%s\n", num, modelNum, model);
		System.out.printf("*cost\t:\t%d$\n", cost);
		System.out.printf("*Weight\t:\t%.1fg\n", weightOfM);
		System.out.printf("*Designed By\t\"%s\"", compony);

	}

}
