
public class Variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);

		// 자료형
		/*
		 * 1.기본형 int, double, char, boolean 메모리 공간중 stack 영역에 실제 데이터가 저장 stack영역의 데이터들은
		 * 프로그램 종료시 자동처리
		 * 
		 * 2.참조형 객체의 참조 값을 나타내는 자료형 String 실제 값 heap영역에, stack값이 있는 heap영역의 번지수가 저장
		 * heap영역은 수동으로 정리 해줘야됨 자바는 자동 정리됨 >> GC(Garbage Collection) C는 수동정리 필수 byte
		 * 127, short 32222, int 21억, long
		 */
		byte aa = 100;
		long myAge = 2200000000L; // long 예시

		// 2. 실수형
		// float, double
		// double 이 보통(default)

		double eyeSight = 0.6;
		System.out.println(eyeSight);

		float eye = 0.5f;

		// 3. 글자(한 글자) - 아스키코드
		char gender = '남';
		System.out.println(gender);

		// 4. 문자 / 문자열 (여러글자)
		String name = "choiminwoo";
		System.out.println(name);

		/*
		 * 정수 int, 실수 double, 글자 String
		 */

//			5. 논리형 boolean 
		boolean soldOut = true;
		System.out.println(soldOut);
		
		int a = 10;
		int b = 20;
		
		System.out.println(a < b);
		boolean judge = (a > b);
		System.out.println(judge);
		
		int c,d,e;
		c=1;
		d=1;
		e=1;
		
//		6.아무것도 없다 
//		void
	}

}
