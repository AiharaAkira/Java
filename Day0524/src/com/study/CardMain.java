package com.study;

public class CardMain {

	public static void main(String[] args) {

		Card[] cards = new Card[52];
		
		int cnt =0;
		
		
		for (Card card : cards) {
			card = new Card();
			if(cnt<=12) {
				card.setShape("Ŭ��");
				if(cnt == 1) {
					card.setNum("���̽�");
				}else if(cnt ==10) {
					card.setNum("��");
				}else if(cnt ==11) {
					card.setNum("��");
				}else if(cnt ==12) {
					card.setNum("ŷ");
				}
				
			}else if(cnt <= 25) {
				card.setShape("���̾Ƹ��");
				
				if(cnt == 13) {
					card.setNum("���̽�");
				}else if(cnt == 23 ) {
					card.setNum("��");
				}else if(cnt ==24) {
					card.setNum("��");
				}else if(cnt ==25) {
					card.setNum("ŷ");
				}
				
			}else if(cnt <= 38) {
				card.setShape("��Ʈ");
				
				if(cnt == 26) {
					card.setNum("���̽�");
				}else if(cnt == 36) {
					card.setNum("��");
				}else if(cnt ==37) {
					card.setNum("��");
				}else if(cnt ==38) {
					card.setNum("ŷ");
				}
				
			}else if(cnt <= 51) {
				card.setShape("�����̵�");
				
				if(cnt == 39) {
					card.setNum("���̽�");
				}else if(cnt ==49) {
					card.setNum("��");
				}else if(cnt ==50) {
					card.setNum("��");
				}else if(cnt ==51) {
					card.setNum("ŷ");
				}
				
			}
			
			
			
			cnt++;
		}
		
	
		
		
	}

}
