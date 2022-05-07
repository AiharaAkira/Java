
public class Judge {

	public void play(Enemy e, Player p) {
		// e 가 랜덤숫자
		int comNum = e.ChoosN();
		boolean isOver = false;
		System.out.println(comNum);// 개발자 테스트용

		int playerNum = 0;

		for (int turn = 1; true; turn++) {

			System.out.println("숫자를 입력 : ");
			playerNum = p.say();

			isOver = result(playerNum, comNum, turn);
			
			if(isOver == true) {
				break;
			}

		}

	}

	private boolean result(int playerNum, int comNum, int turn) {
	
		
		if (playerNum == comNum) {
			System.out.println("정답입니다.");
			return true;
			
		} else if (playerNum > comNum) {
			System.out.println("다운!");
			turn ++;
		} else {
			System.out.println("업!");
			turn ++;

		}
		
		return false;
		
	}

}
