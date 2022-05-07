// Conditional Stmt(조건문)
// 조건문 (if)

//if(조건식){
//조건이 참일때 실행 될 문장}
public class CDMain1 {

	public static void main(String[] args) {
		
//		if문, else(둘중하나. 맞냐 아니냐)
		int age = 70;
		
		//나이가 70이상이면 "안녕하십니까"출력, 아니면 "어리시네요" 출력
		if(age >= 70) {
			System.out.println("안녕하십니까");
		}else {
			System.out.println("어리시네요.");
		}
		
		
		String msg = age >= 70 ? "안녕하십니까" : "어리시네요";
		System.out.println(msg);
		
		//나이가 홀수 10살미만, "ㅋㅋㅋ" 아니면 "ㅎㅎㅎ"
		
		int age2 = 3;
		if(age2 %2 ==1 && age2 < 10) {
			System.out.println("홀수이면서 10살 미만");
		}else {
			System.out.println("Else");
		}
		
		//나이가 1살 초과 5살 미만이면 "ㅎㅅㅎ" 출력
		if(age2 > 1 && age2 < 5) {
			System.out.println("1살 초과 5살미만");
		}
		
		//성인 아이 동단탑승
		//위에 변수 age(70), age2(3)
		
		int height = 100;
		
		//age 가 20살 넘으며, age2가 3살이상이고, 키가 80넘으면 
		//동반탑승 가능 < 출력
		//조건 안맞으면 동반탑승 불가 < 출력
		
		if(age > 20 || age2 >= 30 && height > 180) {
			System.out.println("동반탑승 가능");
		}else {
			System.out.println("동반탑승 불가");
		}
		
		/*
		 * t || t && t == t
		 * t || t && f == t
		 * t || f && t == t
		 * t || f && f == t
		 * && 가우선순위 높음 == 먼저 쓰여짐
		 * 
		 */
		
		
		
	}

}
