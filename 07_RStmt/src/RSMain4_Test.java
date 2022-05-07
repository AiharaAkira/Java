import java.util.Random;
import java.util.Scanner;

public class RSMain4_Test {

	public static void main(String[] args) {
//		컴퓨터가 0~3 사이 랜덤값
		Random r = new Random();
		int com = r.nextInt(4);
		
		Scanner sc = new Scanner(System.in);
		
		
		//내가 입력한게 컴 숫자랑 일치할때까지 반복(맞추면 끝)
		while(true) {
			
			System.out.println(com);//개발자 용
			
			System.out.print(" 숫자를 입력하세요: ");
			int myNum = sc.nextInt();
			
			if(com == myNum) {
				System.out.println("정답은 :" + com);
				break;
			}
			
			if(com != myNum) {
				System.out.println("땡!");
			}
			
		}
		
		//홀짝
		
		
		while(true) {
			int powerBall = r.nextInt(1) + 1;
			System.out.println(powerBall); // 개발자 확인용
			
			
			
			System.out.print(" 숫자를 입력하세요(1 or 2 3.종료): ");
			int myNum = sc.nextInt();
			
			if(myNum >3) {
				System.out.println("숫자를 제대로 입력해라.");
				continue;
			}
			
			if(myNum % 2 == 0 && powerBall % 2 == 0) {
				System.out.println("정답!");
				break;
			}else if(myNum % 2 == 1 && powerBall % 2 == 1) {
				System.out.println("정답!");
				break;
			}else if(myNum == 3) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("땡!");
			}
			
		}
		
		//업다운
		// 몇번 시도 해서 정답을 맞췄는지 
		
		int count = 0;
		int upDown = r.nextInt(100) + 1;
		System.out.println(upDown);//테스트용
		while(true) {
			
			System.out.print(" 숫자를 입력하세요: ");
			int myNum = sc.nextInt();
			
			if(myNum > 100 || myNum <= 0) {
				System.out.println("입력오류, 범위를 확인하세요.");
				continue;
			}
			
			//판정
			if(myNum == upDown) {
				count ++;
				System.out.println("정답! 정답은 "+ upDown +"입니다.");
				
				System.out.println(count+"번 만에 맞췄네요~");
				break;
			}else if(myNum > upDown && myNum < 100) {
				count ++;
				System.out.println("땡! downdown");
				
			}else if(myNum < upDown && myNum < 100){
				count ++;
				System.out.println("땡! upup");
				
			}else if(myNum > 100 || myNum <= 0){
				count ++;
				System.out.println("100이하의 수를 입력하여 주세요");
				
			}
			
		}

	}

}
