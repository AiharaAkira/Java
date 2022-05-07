import java.util.Scanner;

public class AMain3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] aa = new int[4];
		// 00 번째 숫자 입력
		
//		for(int i = 0; i < aa.length; i++) {
//			System.out.println(i+1+"숫자를 입력하시오");
//			aa[i] = sc.nextInt();
//		}
		
		int sum = 0;
		for (int i = 0; i < aa.length; i++) {
			System.out.println(i+1+"숫자를 입력하시오");
			aa[i] = sc.nextInt();
			sum += aa[i];
		}

		System.out.println("총합은: " + sum);
		
		int sum2 = 0;
		for(int i : aa) {
			sum2 += i;
		}
		System.out.println("총합은: " + sum2);
		

		// 다 더한 총합계 출력

	}

}
