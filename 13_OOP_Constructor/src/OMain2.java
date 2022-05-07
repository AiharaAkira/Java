
public class OMain2 {

	public static void main(String[] args) {
		
		//프로그래머
		
		//이름 나이 야근:참 
		
		//기능:일
//		work() 콘솔에 출력 x work("일")
		
		//필드에 직접 접근 x
		
		Person pg = new Person("akira", 23 , true);
		pg.work();
		pg.work("일");
		pg.work("퇴근");

	}

}
