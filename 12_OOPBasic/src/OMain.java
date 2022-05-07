

public class OMain {

	public static void main(String[] args) {
		
		// dog 강아지
		//나이가 3살
		int age = 3;
		//이름이 초코
		String name = "초코";
		//체중이 3.5
		double weight = 3.5;
		
		System.out.println("강아지 나이가" + age);
		System.out.println("강아지 이름이" + name);
		System.out.println("강아지 체중이" + weight);
		System.out.println("________________________________");
		
		//나이 3 이름 초코 체중 3.5
//		객체 : 존재하는 모든 것
//		객체를 만들려면? 클래스 생성이 먼저
		
		//실체화(인스턴스, 객체)
		//클래스명 변수명
		Dog d1 = new Dog(); // 객체생성
		d1.name = "초코";
		d1.age = 3;
		d1.weight = 3.5;
		d1.printInfo();
		System.out.println("--------");
		// 2번째 강아지
		// 이름 요미, 나이 1 , 체중 1.5
//		그렇게 생성이 된 요미가 1번 짖고 그 강아지 정보가 나오게
		Dog d2 = new Dog();
		d2.name = "초코";
		d2.age = 3;
		d2.weight = 3.5;
		d2.bark();
		d2.printInfo();
		
		System.out.println("--------------");
		
		Computer com = new Computer();
		com.cpu = 2.5;
		com.hdd = 255;
		com.ram = 8;
		
		com.printInfo();
		
		
//		컴퓨터를 객체로 표현해주세요
//		cpu 2.5, ram 8, hdd 256
//		printinfo()하면 그 컴터 정보 다 나오게
		System.out.println("-----------------------------");
		//커피
//		가격, 맛, 정보출력
		
		Coffee americano = new Coffee();
		americano.price = 2000;
		americano.taste = true;
		americano.printInfo();
		
		Coffee cafelatee = new Coffee();
		cafelatee.price = 3000;
		cafelatee.taste = true;
		cafelatee.printInfo();
		
		

	}

}
