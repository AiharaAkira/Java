import java.util.Scanner;

public class MetroProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Boolean result = true;

		System.out.println("수도입니까?(수도:1, 수도 아님:0):");
		int answerCity = sc.nextInt();

		System.out.println("인구는 몇 명입니까?(단위 : 만) : ");
		int answerPeople = sc.nextInt();

		System.out.println("부자는 몇 명입니까?(단위 : 만) :");
		int answerRich = sc.nextInt();
		
		System.out.println("이 도시는 메트로폴리스입니까? :");

		if (answerCity == 1 && answerPeople >=100 && answerRich >= 60 ) {
			System.out.println(result);
		} else {
			System.out.println(!result);
		}

	}

}
