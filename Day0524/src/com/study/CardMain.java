package com.study;

public class CardMain {

	public static void main(String[] args) {

		Card[] cards = new Card[52];
		
		int cnt =0;
		
		
		for (Card card : cards) {
			card = new Card();
			if(cnt<=12) {
				card.setShape("Å¬·´");
				if(cnt == 1) {
					card.setNum("¿¡ÀÌ½º");
				}else if(cnt ==10) {
					card.setNum("Àè");
				}else if(cnt ==11) {
					card.setNum("Äı");
				}else if(cnt ==12) {
					card.setNum("Å·");
				}
				
			}else if(cnt <= 25) {
				card.setShape("´ÙÀÌ¾Æ¸óµå");
				
				if(cnt == 13) {
					card.setNum("¿¡ÀÌ½º");
				}else if(cnt == 23 ) {
					card.setNum("Àè");
				}else if(cnt ==24) {
					card.setNum("Äı");
				}else if(cnt ==25) {
					card.setNum("Å·");
				}
				
			}else if(cnt <= 38) {
				card.setShape("ÇÏÆ®");
				
				if(cnt == 26) {
					card.setNum("¿¡ÀÌ½º");
				}else if(cnt == 36) {
					card.setNum("Àè");
				}else if(cnt ==37) {
					card.setNum("Äı");
				}else if(cnt ==38) {
					card.setNum("Å·");
				}
				
			}else if(cnt <= 51) {
				card.setShape("½ºÆäÀÌµå");
				
				if(cnt == 39) {
					card.setNum("¿¡ÀÌ½º");
				}else if(cnt ==49) {
					card.setNum("Àè");
				}else if(cnt ==50) {
					card.setNum("Äı");
				}else if(cnt ==51) {
					card.setNum("Å·");
				}
				
			}
			
			
			
			cnt++;
		}
		
	
		
		
	}

}
