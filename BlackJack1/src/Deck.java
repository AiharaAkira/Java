import java.util.ArrayList;
import java.util.Random;

public class Deck {
	
	private ArrayList<Card> cards; 
	
	public Deck() {
		cards = new ArrayList<Card>();
	}
	
	public ArrayList<Card> getCards(){
		return cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void print() {
		for(Card card : cards) {
			System.out.println(card.toString());
		}
	}
	
	public void shuffle() {
		
		Random r = new Random();
		for(int i = 0; i < cards.size(); i++) {
			int randIndex = r.nextInt(cards.size());
			
			Card temp = cards.get(i);
			cards.set(i, cards.get(randIndex));
			cards.set(randIndex, temp);
		}
	}
	
	public Deck deal(int count) {
		Deck hand = new Deck();
		
		int size = cards.size();
		
		for(int i = size-1; i >= size - count; i--) {
			hand.addCard(cards.remove(i));
		}
		
		return hand;
	}

}
