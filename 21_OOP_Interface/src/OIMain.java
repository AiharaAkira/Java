// 다형성(polymorhpism)

interface Coffee{
	
	void name();
	void price();
	
	default void hotOrIce() {
		System.out.println("물어봐야 되는 항목인가?");
	}
	
	
}
//implements (구현)
class Espresso implements Coffee{
	@Override
	public void name() {
		System.out.println("에스프레소");
	}
	
	@Override
	public void price() {
		System.out.println("2000원");
		
	}
}


class Cafelatte implements Coffee{
	@Override
	public void name() {
		System.out.println("카페라떼");
	}
	
	@Override
	public void price() {
		System.out.println("2000원");
		
	}
	
	@Override
	public void hotOrIce() {
		Coffee.super.hotOrIce();
		System.out.println("아이스? 따뜻한거?");
	}
}

class Vanilalatte implements Coffee{
	@Override
	public void name() {
		System.out.println("바닐라라떼");
	}
	
	@Override
	public void price() {
		System.out.println("1500원");
		
	}
	
	@Override
	public void hotOrIce() {
		Coffee.super.hotOrIce();
		System.out.println("아이스? 따뜻한거?");
	}
}

class Frappuccino implements Coffee3{
	@Override
	public void name() {
		System.out.println("프라푸치노");
	}
	
	@Override
	public void price() {
		System.out.println("3000원");
		
	}
}


public class OIMain {
	public static void main(String[] args) {
		
		Coffee coffee;
		coffee = new Espresso();
		coffee.name();
		coffee.price();
		System.out.println();
		
		coffee = new Cafelatte();
		coffee.name();
		coffee.price();

//		커피 이름, 가격, 핫아이스
		
//		 에스프레소
//		Espresso3 espresso = new Espresso3();
//		espresso.name();
//		espresso.price();
////		 카페라떼
//		Cafelatte3 cafelatte = new Cafelatte3();
//		cafelatte.name();
//		cafelatte.price();
////		 바닐라라떼
//		Vanilalatte3 vanilalatte = new Vanilalatte3();
//		vanilalatte.name();
//		vanilalatte.price();
//		//		 프라푸치노
//		
//		Frappuccino3 frapuccino = new Frappuccino3();
//		 frapuccino.name();
//		 frapuccino.price();
		
	}
}
