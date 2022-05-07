//f2번으로 리네이밍 가능
public class Variable1 {
	public static void main(String[] args) {
		System.out.println("a");
		
		//변수: 프로그램 진행중 발생하는 데이터의 임시저장
		
		// 데이터 담는 그릇
		// 데이터 수정 가능
		
		// 변수 만들기
		// 자료형(그릇) 변수명(그릇 이름);
		    int            a;
		    
		// 변수명
		    
		    /*
		     자유롭되 몇가지 제한
		     자바문법 x(예약어), 숫자로 시작 x
		     소문자로 시작 
		     띄어쓰기 대신 _, 낙타
		     특수문자는 _만($도가능)
		     자바문법을 꼭써야되면 앞에 _
		     */
		
		    // 내 나이 저장
		    int myAge; // myAge라는 그릇을 만들기
		    myAge = 20; //myAge에 20을 담음
		    
		    System.out.println(myAge);
		    System.out.println("myAge");
		    
		    // 헨드폰 가격
		    int phoneCost; // 변수 선언
		    phoneCost = 1000; // 변수 초기화
		    
		    System.out.println(phoneCost);
		    
		    phoneCost = 2000;
		    System.out.println(phoneCost);
		    
		    //34, 35줄 한번에 >> 선언 초기화 한번에
		    int phoneCost2 = 5000; 
		    System.out.println(phoneCost2);
		    
		    System.out.print("폰가격: ");
		    System.out.print(phoneCost2);
		    System.out.println("$");
		    
		    //test
		    //신발 사이즈 : 260mm
		    int shoesSize = 260;
		    System.out.print("신발 사이즈 : ");
		    System.out.print(shoesSize);
		    System.out.println("mm" );
		    
		    // 저거 한줄로 써서 나오게
		    System.out.println("신발 사이즈 : " + shoesSize + "mm");
		    
		    shoesSize = 280;
		    System.out.println("신발 사이즈 : " + shoesSize + "mm");
		    
		    int _int;
		    
		    
		    
		    
	}
}
