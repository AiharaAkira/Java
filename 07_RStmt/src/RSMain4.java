import java.util.Scanner;

public class RSMain4 {

	public static void main(String[] args) {

		// 1+~10 = 55

		// Ƚ���� �˰� ����
		int a = 0;
		for (int i = 1; i < 11; i++) {
			a += i;
		}
		System.out.println(a);
		System.out.println("____________________________");

		// for(�ݺ�Ƚ��)
		// while(�ݺ� ����)

		// ��� ���ؾ� 10�̻� �ѳ�?
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

		// �Է�
		// 0 �� ������ stop
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

		// ����� ���ؾ� 500�� �ѳ�

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
		// ���ǿ��ο� ������� �ѹ��� ���� ����
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
