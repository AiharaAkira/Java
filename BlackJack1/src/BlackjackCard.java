
public class BlackjackCard extends Card{

	
	
	public BlackjackCard(int suitNumber, int rankNumber) {
		super(suitNumber, rankNumber);
		
	}

	public int getValue() {
	    
		//ace�� 11����
		//jqk�� 10�� ����
		if(rankNumber ==1) {
			return 11;
		}else if(rankNumber == 11|| rankNumber == 12 || rankNumber == 13) {
			return 10;
		}
		return rankNumber;
		
	}
	
	public boolean isAce() {
	    return rankNumber == 1;
	}

}
