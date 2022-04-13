package com.study;

public class Test002 {
	
	 static int aa = 0;
	 
	public static void main(String[] args) {
		
//		Test002 t = new Test002();
		
		//문자열을 사용할 경우 ""
		//상수나 매개변수는 그냥 사용
		//여러 문자열과 매개변수를 사용할 경우 연결 기호(+)를 사용함
		String str = "우리는";
		char ch = 'a';
		System.out.println(str);
		System.out.println(ch);
		System.out.printf("%s\n", str);
		System.out.printf("%c\n", ch);
		System.out.printf("%s,%c\n", str, ch);
		
		System.out.println(10);
		System.out.println(2.14+"는 실수입니다.");
		int a = 0;
		System.out.println(a);
		System.out.println(Test002.aa);

		
		
	}
}
