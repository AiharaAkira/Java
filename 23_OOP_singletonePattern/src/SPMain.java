
public class SPMain {

	public static void main(String[] args) {
//		객체를 하나만 만들어야함 = 싱글톤패턴
		
//		자기 자신: 이름, 나이
		Me me = Me.getMe();
		me.info();
		System.out.println(me);
		
		Me me2 = Me.getMe();
		me2.info();
		System.out.println(me2);
		
		System.out.println("-------------------------");
		//아이언맨 : 이름, 나이 > 정보출력
		IronMan im = IronMan.getIronMan();
		im.info();
		System.out.println(im);
	}

}
