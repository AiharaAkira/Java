
public class CDMain2 {

	public static void main(String[] args) {
		if(true) {
			System.out.println("ok");
		}
		
		System.out.println("ok");
		
		if(false) {
			System.out.println("ok2");
		}
		
		int a = 12;
		
		if(a % 2 == 0) {
			System.out.println(a + "는 짝수다.");
			System.out.println(a + "는 2의 배수다.");
			
		}
		
		if(a%3 == 0) {
			System.out.println(a + "는 3의 배수다.");
		}
		
		if(a % 4 == 0) {
			System.out.println(a + "는 4의 배수다.");
		}
	}

}
