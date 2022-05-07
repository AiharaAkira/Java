import java.util.Scanner;

public class AMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int aa[] = new int[4]; // 4칸짜리 변수 (칸은 인덱스, 색인)
		int hap = 0;
		
		
		
		System.out.println("1번 숫자입력: ");
		aa[0] = sc.nextInt();
		System.out.println("2번 숫자입력: ");
		aa[1] = sc.nextInt();
		System.out.println("3번 숫자입력: ");
		aa[2] = sc.nextInt();
		System.out.println("4번 숫자입력: ");
		aa[3] = sc.nextInt();
		
		hap = aa[0] + aa[1] + aa[2] + aa[3];
		System.out.println(hap);
	}

}
