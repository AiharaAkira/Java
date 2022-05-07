import java.util.Scanner;

public class EHMain2 {
	
	public static void test() {
		try {
			int aa[] = {1};
			System.out.println(aa[5]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void test2() throws ArrayIndexOutOfBoundsException{
		int aa[] = {1};
		System.out.println(aa[5]);
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("x : ");
		int x = sc.nextInt();
		System.out.println("y : ");
		int y = sc.nextInt();
		try {
			System.out.println(x / y);

			int[] ar = { 10, 20 };
			System.out.println(" 배열 몇 번?");
			int i = sc.nextInt();
			System.out.println(ar[i]);
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace(); // 개발자 확인용
		}
//		try {
//			System.out.println(x / y);
//			
//			int [] ar = {10, 20};
//			System.out.println(" 배열 몇 번?");
//			int i = sc.nextInt();
//			System.out.println(ar[i]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("0이나 1중에 입력 해주세요");
//			e.printStackTrace(); // 개발자 확인용
//		}catch (Exception e) {
//			System.out.println("0이외 수로 나누어 주세요");
//			e.printStackTrace();
//		}

	}

}