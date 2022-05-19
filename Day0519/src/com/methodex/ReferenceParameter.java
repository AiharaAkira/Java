package com.methodex;

public class ReferenceParameter {

	public static void increase(int[] n) {
		for(int i=0; i<n.length; i++) {
			n[i]++;
		}
	}
	
	public static void main(String[] args) {

		int[] arr = {100,80,60,40,20,0};
		
		increase(arr);

		for (int i : arr) {
			System.out.println(i);
		}
	}

}
