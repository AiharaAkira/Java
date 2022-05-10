package com.study;

public class Test02 {

	public static void main(String[] args) {

		char[] ch = new char[26];
		
		
		int k = 65;
		int h = 97;
		
		for(int i = 0; i<ch.length; i++) {
			ch[i]= (char) k;
			k++;
			System.out.println(ch[i]);
		}
		
		for(int i = 0; i<ch.length; i++) {
			ch[i]= (char) h;
			h++;
			System.out.println(ch[i]);
		}
		
		char[] arpha = new char[26];
		for(int i = 0; i < arpha.length; i++) {
			arpha[i] = (char)('A'+i);
			System.out.print(arpha[i]);
			
		}
		
		
	}

}
