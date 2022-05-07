import java.util.Scanner;

// 다형성(polymorhpism)

interface Coffee3 {

	void name();

	void price();

	default void hotOrIce() {

	}

}

//implements (구현)
class Espresso3 implements Coffee3 {

	@Override
	public void name() {
		System.out.println("에스프레소");
	}

	@Override
	public void price() {
		System.out.println("2000원");

	}
}

class Cafelatte3 implements Coffee3 {
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
		Coffee3.super.hotOrIce();

	}
}

class Vanilalatte3 implements Coffee3 {
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
		Coffee3.super.hotOrIce();
		System.out.println("아이스? 따뜻한거?");
	}
}

class Frappuccino3 implements Coffee3 {
	@Override
	public void name() {
		System.out.println("프라푸치노");
	}

	@Override
	public void price() {
		System.out.println("3000원");

	}

	@Override
	public void hotOrIce() {
		Coffee3.super.hotOrIce();
		System.out.println("아이스? 따뜻한거?");
	}
}

public class OIMain3 {
	public static void main(String[] args) {

//		주문하시겠어요?
//		1.에스프레소 2.카페라떼 3.바닐라라떼 4.프라푸치노
//		5.돈이 없어요 -> 그럼 가세요
//		그 외 번호 입력시 > 메뉴판이 없네요

//		23번선택시 hot or ice 물어보기

//		커피 이름, 가격, 핫아이스

//		 에스프레소

//		 카페라떼

//		 바닐라라떼

		// 프라푸치노

		System.out.println("_____________________________________________________");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("주문하시겠어요(번호)?(1. 에스프레소 2.카페라떼 3.바닐라라떼 4.프라푸치노 5.돈이 없어요) ");
			int userNum = sc.nextInt();

			Coffee3 coffee = null;

			if (userNum == 3) {
				coffee = new Vanilalatte3();
				coffee.hotOrIce();
			} else if (userNum == 4) {
				coffee = new Frappuccino3();
				coffee.hotOrIce();
			} else if (userNum == 2) {
				coffee = new Cafelatte3();
			} else if (userNum == 1) {
				coffee = new Espresso3();
			} else if (userNum == 5) {
				System.out.println("그럼 가세요.");
				break;
			} else {
				System.out.println("메뉴에 없네요");
				continue;
			}
			
			coffee.name();
			coffee.price();
			coffee.hotOrIce();
			
		}
	}
}
