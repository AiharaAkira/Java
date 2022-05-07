
public class TCMain {

	public static void main(String[] args) {

		// 형 변환(Type Casting)
		// 자료형(그릇 종류) 바꾸는 것
		
		//기본 자료형
		/*
		 * int랑 int 연산 : 결과는 int
		 * int랑 double 연산 : 결과는 double 
		 * 
		 */
		double a = 10 / 4;
		System.out.println(a);
		
		// int 21억... long은 int 보다 큰 그릇
		
		int aa = 10;
		long bb = aa; // int -> long
		
		System.out.println(bb);
		
		int cc = (int) bb ;  //long -> int
		
		double dd = cc;
		
		int ee = (int)dd; // double -> int
		
		// -- 에러줄에 마우스로 형변환 가능
		
		int b = 5;
		
		System.out.println(ee + b);
		
		System.out.println("___________________________");
		
		/*
		 *String + ? = String 
		 */
		
		String ff = ee + "";	//int -> String
		System.out.println(ff);	// 문자 10
		
		System.out.println(ff + b);
		
		
		
		
	}

}
