
public class OMain {

	public static void main(String[] args) {
		
		//애플 쇼핑몰
		
		//Goods
		
		//품명 : 아이폰 가격이 : 120 제조사 : 애플
		//품명 : 아이패드 가격이 : 80 제조사 : 애플
		//품명 : 에어팟 가격이 : 20 제조사 : 애플
		
		//상품정보 출력 기능(공통)
		
		//제조사는 정해져 있음
		
//		한번 생성한 제품은 이름과 가격을 수정 x
//		setter 삭제
//		static 정적, 아래와 같이 클래시 끼리 공유 가능, 클래스명.메소드()
		Goods.getMaker();
		
		
		Goods iphone = new Goods("아이폰", 120);
		Goods ipad = new Goods("아이패드", 80);
		Goods airpot = new Goods("에어팟", 20);
		
		iphone.info();
		airpot.info();
		ipad.info();
		
		System.out.println("--------------------");
		System.out.println(Goods.getMaker());
		
		
	}

}
