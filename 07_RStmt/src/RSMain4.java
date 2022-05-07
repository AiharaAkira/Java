import java.util.Scanner;

public class RSMain4 {

	public static void main(String[] args) {

		// 1+~10 = 55

		// 횟수를 알고 있음
		int a = 0;
		for (int i = 1; i < 11; i++) {
			a += i;
		}
		System.out.println(a);
		System.out.println("____________________________");

		// for(반복횟수)
		// while(반복 조건)

		// 몇가지 더해야 10이상 넘나?
		int k = 1;
		int sum = 0;
		while (sum < 1000) {
			sum += k;
			k++;
		}
		System.out.println(sum);
		System.out.println(k - 1);

//		int k = 1;
//		int sum = 0;
//		while(sum<50) {
//			sum+=k;
//			k++;
//		}
//		System.out.println(sum);
//		System.out.println(k-1);

		System.out.println("________________________");
		Scanner sc = new Scanner(System.in);

		// 입력
		// 0 을 넣으면 stop
//		int c = 1;
//		while(c!=0) {
//			System.out.println("f: ");
//			c = sc.nextInt();
//		}
//		
//		while(true) {
//			System.out.println("f: ");
//			c = sc.nextInt();
//			
//			if(c==0) {
//				break;
//			}
//		}

		int aaa = 0;
		while (true) {
			System.out.println(aaa);
			if (aaa == 10) {
				break;
			}
			aaa++;
		}

		// 몇까지 더해야 500이 넘나

		int result = 0;
		int aa = 1;
		while (true) {
			result += aa;

			aa++;
			if (result >= 500) {
				break;
			}
		}

		System.out.println(aa - 1);

		// do while
		// 조건여부와 상관없이 한번은 실행 보장
		int ll = 0;
		int kk = 0;
		do {
			kk += 2;
			ll++;
		} while (false);
		System.out.println(kk);
		System.out.println(ll);
		
		

	}

}
