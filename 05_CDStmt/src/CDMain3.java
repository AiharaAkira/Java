
public class CDMain3 {

	public static void main(String[] args) {
		
		/*
		 * if, else if, else(여러 조건중 하나만)
		 */
		
		int age = 12;
		
//		1. 나이가 20살이상이면 "어서오세요"
//		2. 나이가 15 <= 나이 < 20 이면 "더 크면 오세요"
//		3. 10 <= 나이 < 15 이면 "나가"
//		4. 나머지는 "귀엽네"
		
//		if(age >= 20) {
//			System.out.println("어서오세요");
//		}else {
//			if(age >= 15 ) {System.out.println("더 크면 오세요");
//		}else {
//			if(age >= 10 ){System.out.println("나가");}
//		}else {
//			System.out.println("귀엽네");
//			}
//		}
		
		System.out.println("___________________________");
		if(age >= 20) {
			System.out.println("어서오세요");
		}else if (age >= 15) {
			System.out.println("더크면 와라");
		}else if (age >= 10) {
			System.out.println("나가");
		}else {
			System.out.println("귀엽네");
		}
		
		//test
		
		//키가 150 이상이면 Welcome
//		130 <= 키 < 150 이상이면 Welcome Friend
//		100 <= 키 < 130 이상이면 Welcome Boy
//		나머지는 Get out	
		
		int height = 120;
		
		if(height >= 150) {
			System.out.println("Welcome");
		}else if (height >= 130) {
			System.out.println("Welcome Friend");
		}else if (height >= 100) {
			System.out.println("Welcome Boy");
		}else {
			System.out.println("Get out");
		}
		
		
	}
	
	

}
	
