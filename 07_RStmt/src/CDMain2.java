import java.math.BigInteger;

public class CDMain2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 6; i+=2) {
			System.out.println("i= "+i);
		}
	
		for(int j = 0; j <= 8; j+=2) {
			
			System.out.println("i= "+j);
//			Thread.sleep(1000);
			
		}
		
		//1 ~ 10
//		int sum = 0;
//		for(int a = 1; a <= 10; a++) {
//			sum += a;
//			
//		}
//		System.out.println("1~10���� ���Ѱ�: "+sum);
		System.out.println("_____________________________________________");
		
		//1 ���� 295 ���� ���ϱ�
		
		int sum = 0;
		for(int a = 1; a <= 295; a++) {
			sum += a;
			
		}
		
		System.out.println("1~295���� ���Ѱ�: "+sum);
		System.out.println("_____________________________________________");
		
		
		//1~5
		//1~20 ���� ���ϸ� overflow
//		long result = 1;
//		for(int r = 1; r <= 60; r++) {
//			System.out.println(r);
//			result *= r;
//			
//		}
//		
//		System.out.println("result = " + result);
//		System.out.println("_____________________________________________");
		
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(2 + "*" + i + "=" + (2*i) );
			System.out.printf("2 * %d = %d\n", i, 2*i);
		}
		
		//Test
		
//		3���ε� Ȧ���� ���� �͸� 
		//4*9 4*6 4*3
		
		for(int i = 1; i <= 9; i++) {
			if(i%2 == 1) {
				System.out.println(3 + "x" + i + "=" + 3*i);
			}
		}
		
		for(int i = 9; i>2; i--) {
			if(i== 9 || i==6 || i==3) {
				System.out.println(4 + "x" + i + "=" + 4*i);
			}
		}
		
		
		
		
		
	}
	
}
