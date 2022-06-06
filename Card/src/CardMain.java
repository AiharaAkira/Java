import java.util.ArrayList;

public class CardMain {

	public static void main(String[] args) {

		int number = 1;
		String shape = "";
		int cardNum = 2;
		
		ArrayList<Card2> cards = new ArrayList<>();
		
		for (int i = 0; i<52; i++) {
			//에이스
			if(number == 1 || number == 14 || number == 27 || number == 40) {
				
				if(number == 14) {
					shape ="하트";
				}else if(number == 27) {
					shape = "스페이드";
				}else if(number == 1) {
					shape = "클로버";
				}else if(number == 40) {
					
					shape ="다이아";
				}
				
				cards.add(new Card2(shape, "에이스"));
				
				
				
			}else if(number == 11 || number == 24 || number == 37 || number == 50) {
				cards.add(new Card2(shape, "잭"));
				
			}else if(number == 12|| number == 25 || number == 38 || number == 51) {
				cards.add(new Card2(shape, "퀸"));
			}else if(number == 13|| number == 26 || number == 39 || number == 52) {
				
				cards.add(new Card2(shape, "킹"));
			}else {
				
				
				//1도 잭 퀸 킹x(2~10)
				cards.add(new Card2(shape, Integer.toString(cardNum)));
			
				cardNum++;
				
				if(cardNum == 11) {
					
					cardNum = 2;
					
				}
				
			}
			number ++;
			
			
			
		}
		
		
		System.out.print("[");
		
		for (Card2 c2 : cards) {
			
			System.out.println(c2.shape +" "+ c2.num);
			
		}
		
		System.out.print("]");
		
		
	}

}
