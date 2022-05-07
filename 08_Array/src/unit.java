import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class unit {

	public static void main(String[] args) {

		//변경을 원하는 단위를 안내
		
		//1.cm - > inch
		//2. m2 - > 평
		//3. C -> f
		//4.km/h -> mi/h
		
		//선택된 결과 출력 후 값 입력 하면 
		//계산된 결과 출력
		ArrayList<String> units = new ArrayList<String>();
		HashMap<Integer, Double> units2 = new HashMap<Integer, Double>();
		units.add("1cm = 0.393701 in");
		units.add("1m^2 = 0.3025평");
		units.add("1℃ = 33.8 ℉");
		units.add("1km/h = 0.621371 mi/h");
		
		System.out.println("숫자로입력해주세요.------------");
		System.out.println("	1.cm - > inch\r\n"
				+ "	2. m2 - > 평\r\n"
				+ "	3. ℃ -> ℉\r\n"
				+ "	4.km/h -> mi/h");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번? : ");
		int userPick = sc.nextInt();
		
		if(userPick < 1 || userPick >4) {
			System.out.println("잘못 입력하셨습니다.");
			userPick = sc.nextInt();
		}
		
			System.out.println(units.get(userPick-1));
			
			System.out.println("계산할 값을 입력해주세요(단위제외)");
			double userNum = sc.nextDouble();
			
			units2.put(1,0.393701 * userNum);
			units2.put(2,0.3025* userNum);
			units2.put(3,33.8* userNum);
			units2.put(4,0.621371* userNum);
			if(userPick == 1) {
				System.out.printf("계산된 값은 : %.4f inch",userNum * units2.get(userPick));
			}else if(userPick == 2) {
				System.out.printf("계산된 값은 : %.4f 평", userNum * units2.get(userPick));
			}else if(userPick == 3) {
				System.out.printf("계산된 값은 : %.4f ℉", userNum * units2.get(userPick));
			}else if(userPick == 4) {
				System.out.printf("계산된 값은 : %.4f mi/h", userNum * units2.get(userPick));
			}
		
		
		
	}

}
