package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx05 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor, eng, mat;
		System.out.println("��������: ");
		kor = Integer.parseInt(br.readLine());
		System.out.println("��������: ");
		eng = Integer.parseInt(br.readLine());
		System.out.println("��������: ");
		mat = Integer.parseInt(br.readLine());
		
		System.out.println("��������:");
		System.out.println(kor);
		System.out.println("��������:");
		System.out.println(eng);
		System.out.println("��������:");
		System.out.println(mat);
		
		 
	}

}
