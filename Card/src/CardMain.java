import java.util.ArrayList;

public class CardMain {

	public static void main(String[] args) {

		int number = 1;
		String shape = "";
		int cardNum = 2;
		
		ArrayList<Card2> cards = new ArrayList<>();
		
		for (int i = 0; i<52; i++) {
			//���̽�
			if(number == 1 || number == 14 || number == 27 || number == 40) {
				
				if(number == 14) {
					shape ="��Ʈ";
				}else if(number == 27) {
					shape = "�����̵�";
				}else if(number == 1) {
					shape = "Ŭ�ι�";
				}else if(number == 40) {
					
					shape ="���̾�";
				}
				
				cards.add(new Card2(shape, "���̽�"));
				
				
				
			}else if(number == 11 || number == 24 || number == 37 || number == 50) {
				cards.add(new Card2(shape, "��"));
				
			}else if(number == 12|| number == 25 || number == 38 || number == 51) {
				cards.add(new Card2(shape, "��"));
			}else if(number == 13|| number == 26 || number == 39 || number == 52) {
				
				cards.add(new Card2(shape, "ŷ"));
			}else {
				
				
				//1�� �� �� ŷx(2~10)
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
