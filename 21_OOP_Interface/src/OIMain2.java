import java.util.Scanner;

// 다형성(polymorhpism)

interface Coffee2 {

	void name();

	void price();

	default void hotOrIce() {
		System.out.println("물어봐야 되는 항목인가?");
	}

}

//implements (구현)
class Espresso2 implements Coffee {
	@Override
	public void name() {
		System.out.println("에스프레소");
	}

	@Override
	public void price() {
		System.out.println("2000원");

	}
}

class Cafelatte2 implements Coffee {
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

class Vanilalatte2 implements Coffee {
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

class Frappuccino2 implements Coffee {
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
		Coffee.super.hotOrIce();
		System.out.println("아이스? 따뜻한거?");
	}
}

public class OIMain2 {
	public static void main(String[] args) {

//		주문하시겠어요?
//		1.에스프레소 2.카페라떼 3.바닐라라떼 4.프라푸치노
//		5.돈이 없어요 -> 그럼 가세요
//		그 외 번호 입력시 > 메뉴판이 없네요

//		23번선택시 hot or ice 물어보기

//		커피 이름, 가격, 핫아이스

//		 에스프레소
		Espresso3 espresso = new Espresso3();

//		 카페라떼
		Cafelatte3 cafelatte = new Cafelatte3();

//		 바닐라라떼
		Vanilalatte3 vanilalatte = new Vanilalatte3();

		// 프라푸치노

		Frappuccino3 frapuccino = new Frappuccino3();

		System.out.println("_____________________________________________________");
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("주문하시겠어요(번호)?(1. 에스프레소 2.카페라떼 3.바닐라라떼 4.프라푸치노 5.돈이 없어요) ");
			int userNum = sc.nextInt();

			if (userNum == 3) {
				vanilalatte.name();
				vanilalatte.price();
				vanilalatte.hotOrIce();
				
			} else if (userNum == 4) {
				frapuccino.name();
				frapuccino.price();
				frapuccino.hotOrIce();
			} else if (userNum == 2) {
				cafelatte.name();
				cafelatte.price();
			} else if (userNum == 1) {
				espresso.name();
				espresso.price();
			} else if (userNum == 5) {
				System.out.println("그럼 가세요.");
				break;
			} else {
				System.out.println("메뉴판에 없네요.");
				
			}

		}
	}
}
