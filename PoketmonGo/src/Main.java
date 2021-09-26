import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {

		PokeBag pokeBag = new PokeBag();
		Scanner sc = new Scanner(System.in);
//        System.out.println("args=" +  args[0]);

		System.out.println("포켓몬 이름 입력: 파이숭이(cp:1500), 펭숭이(cp:1500))");
		String player = sc.next();

		if (player.equals("파이숭이")) {
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("파이숭이가 동료가 되었다.");
			pokeBag.add(new Pokemon("파이숭이", 1500));

		} else if (player.equals("펭숭이")) {
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("펭숭이가 동료가 되었다.");
			pokeBag.add(new Pokemon("펭숭이", 1500));
		} else {
			System.out.println("이름이 틀렸습니다. 다시 입력해주세요.");
			System.out.println("포켓몬 이름 입력: 파이숭이(cp:1500), 펭숭이(cp:1500))");
			player = sc.next();
		}

		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");

		System.out.println("마그마가 동료가 되었다.");
		pokeBag.add(new Pokemon("마그마", 1024));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("마그마그가 동료가 되었다.");
		pokeBag.add(new Pokemon("마그마그", 215));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("마릴이 동료가 되었다.");
		pokeBag.add(new Pokemon("마릴", 816));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("마그마그가 동료가 되었다.");
		pokeBag.add(new Pokemon("마그마그", 136));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("라프라스가 동료가 되었다.");
		pokeBag.add(new Pokemon("라프라스", 1822));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("마릴이 동료가 되었다.");
		pokeBag.add(new Pokemon("마릴", 215));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("마릴이 동료가 되었다.");
		pokeBag.add(new Pokemon("마릴", 185));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("마릴이 동료가 되었다.");
		pokeBag.add(new Pokemon("마릴", 110));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("니드킹이 동료가 되었다.");
		pokeBag.add(new Pokemon("니드킹", 1709));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("마릴이 동료가 되었다.");
		pokeBag.add(new Pokemon("마릴", 39));
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		Thread.sleep(300);
		System.out.print(".");
		System.out.println("마자용이 동료가 되었다.");
		pokeBag.add(new Pokemon("마자용", 12));
		
		System.out.println("마릴선별 이벤트를 진행하시겠습니까? press 'y'/'n'");
		String choose = sc.next();
		if(choose.equals("y")) {
			System.out.println("가장강한 마릴을 부릅니다.");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("소환되었습니다.");
			System.out.println(pokeBag.getStrongest("마릴"));
		}else {
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("내부분열 이벤트로 넘어 갑니다.");
		}
		
		System.out.println("내부분열 이벤트를 진행하시겠습니까? press 'y'/'n'");
		String choose2 = sc.next();

		if(choose2.equals("y")) {
			System.out.println("모든 포켓몬이 내부분열을 일으켰습니다. 전투가 시작됩니다.");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("승자는");
			System.out.println(pokeBag.getStrongest());
		}else {
			System.out.println("피카츄 소환 이벤트로 넘어갑니다.");
		}
		
		System.out.println("피카츄소환 이벤트를 진행하시겠습니까? press 'y'/'n'");
		String choose3 = sc.next();
		
		if(choose3.equals("y")) {
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("피카츄를 소환합니다.");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			Thread.sleep(300);
			System.out.print(".");
			System.out.println("피카츄가 존재하지 않습니다.");
			pokeBag.getStrongest("피카츄");
			
			System.out.println("다시한번 피카츄소환 이벤트를 진행하시겠습니까? press 'y'/'n'");
			String choose4 = sc.next();
			
			
			if(choose4.equals("y")) {
				
				Thread.sleep(300);
				System.out.print(".");
				Thread.sleep(300);
				System.out.print(".");
				Thread.sleep(300);
				System.out.print(".");
				System.out.println("피카츄가 동료가 되었다.");
				pokeBag.add(new Pokemon("피카츄", 122));
				
			}else {
				System.out.println("종료합니다.");
			}
			
		}else {
			System.out.println("종료합니다.");
		}
		
		
		
		sc.next();
	}
}