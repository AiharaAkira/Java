import java.util.Scanner;

public class BMIMain {

	public static void main(String[] args) throws InterruptedException {
		
		// BMI (체질량 지수 ) 프로그램
		// 1. 이름, 키, 체중
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("키 :");
		double height = sc.nextDouble();
		
		
		
		System.out.print("체중 :");
		double kg = sc.nextDouble();
		
		if( height > 10) {
			height /= 100; 
		}
		
		//2. 계산식
		double bmiCalculator = (kg / (height * height));
		
		System.out.printf("BMI 지수 : %.2f\n", bmiCalculator);
		//3. 판정
		
		System.out.print("계산중.");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".\n");
		
		if(bmiCalculator >= 25) {
			System.out.println(name + "님 당신은'비만'입니다");
		}else if(bmiCalculator >= 23) {
			System.out.println(name + "님 당신은'과체중'입니다");
		}else if(bmiCalculator >= 18.5) {
			System.out.println(name + "님 당신은'정상'입니다");
		}else {
			System.out.println(name + "님 당신은'저체중'입니다");
		}
		
		

		//4. 결과: BMI 지수 : 10.14
		//000님 당신은 '입니다' >> 5. 확인
		
		//6배포후 CMD 실행
		
		sc.next();
		

	}

}
