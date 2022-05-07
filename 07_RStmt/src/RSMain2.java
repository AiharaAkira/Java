

public class RSMain2 {

	public static void main(String[] args) {

		//무한 루프
		
//		for(int i = 0; true; i++) {
//			System.out.println(i);
//		}
		
//		for (;;) {
//			System.out.println("ii");
//		}
		
		for(int i = 0; i < 3;) {
			i++;
			System.out.println("ll");
		}
		
		
//		while(true) {
//			System.out.println("hi");
//		}
		
		//break; 현재 위치에서 가장 가까운 스위문 또는 반복문 탈출
		//무한루프를 빠져나오려면 브레이크
		
		int a = 0;
		for(;;) {
			System.out.println(a);
			a++;
			
			if(a>10) {
				break;
			}
		}
		
		int b = 0;
		while(true) {
			System.out.println("while문 무한 루프 : " + b);
			b++;
			if(b>5) {
				System.out.println("break");
				break;
			}
		}
		
		
		
		

	}

}
