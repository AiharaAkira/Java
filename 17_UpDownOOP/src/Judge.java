
public class Judge {

	public void play(Enemy e, Player p) {
		// e �� ��������
		int comNum = e.ChoosN();
		boolean isOver = false;
		System.out.println(comNum);// ������ �׽�Ʈ��

		int playerNum = 0;

		for (int turn = 1; true; turn++) {

			System.out.println("���ڸ� �Է� : ");
			playerNum = p.say();

			isOver = result(playerNum, comNum, turn);
			
			if(isOver == true) {
				break;
			}

		}

	}

	private boolean result(int playerNum, int comNum, int turn) {
	
		
		if (playerNum == comNum) {
			System.out.println("�����Դϴ�.");
			return true;
			
		} else if (playerNum > comNum) {
			System.out.println("�ٿ�!");
			turn ++;
		} else {
			System.out.println("��!");
			turn ++;

		}
		
		return false;
		
	}

}
