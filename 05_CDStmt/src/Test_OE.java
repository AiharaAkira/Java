import java.util.Random;
import java.util.Scanner;

public class Test_OE {

	public static void main(String[] args) {
		
		//Test
		//Odd Even
		
		//컴터 랜덤 숫자
		Random r = new Random();
		int rNum = r.nextInt(45)+1;
		
		//내가 입력 답
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1이상 숫자를 입력하시오: ");
		int playerNum = sc.nextInt();
		
		if(playerNum%2 == 0 && rNum%2 == 0) {
			System.out.println("정답!");
		}else if(playerNum%2 == 1 && rNum%2 == 1){
			System.out.println("정답!");
		}else {
			System.out.println("땡!");
		}
		
	}

}
