import java.util.Random;

import com.cmw.product.Computer;
import com.cmw.product.Printer;
import com.cmw.product.Scanner;

public class OPMain {

	public static void main(String[] args) {
		// 컴퓨터 : 이름, 가격
		Computer c = new Computer("슈퍼컴", 1000000);
		c.cpu = "i7";
//		c.ram; 패키지가 다른데 ram의 접근제한자가 default라서 안됨
//		c.hdd; protected 쓰려면 내가 어디서 사용하는지 잘 봐야됨 서브클래스가 아님 
		c.info();
		

		// 프린터
		Printer p = new Printer("프린터", 1000000);
		//스캐너
		Scanner s = new Scanner("스캐너", 1);
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Random r = new Random();
		
		//java.lang은 import가 필요없음
		java.lang.String str = new String("ddd");
		
		
	}

}
