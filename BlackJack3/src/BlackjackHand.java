
public class BlackjackHand extends Deck<BlackjackCard>{
	int value = 0;
	int aceCount = 0;
	public BlackjackHand() {
		
	}

	public int getValue() {
		
		//Ace value 가 21을 넘었을 경우 Ace는 1의 값을 가짐
		//Ace x2, J, 6
		//11 + 11 + 10 + 6 = 38
		//1 + 1 + 10 + 6 = 18
		
		//Ace 가 몇장 ? 현재 value 몇장?
		for(BlackjackCard card : getCards()) {
//			BlackjackCard card = (BlackjackCard) c;
			
			if(card.isAce()) {
				aceCount++;
			}
			
			value += card.getValue();
			
		}
		
		while(aceCount<0 && value > 21) {
			value-=10;
			aceCount --;
		}
		return value;
	}

	public boolean isBlackjack() {
		return getValue() == 21&&getCards().size() == 2;
	}

	public boolean isBusted() {
		return getValue() > 21;
	}
}
