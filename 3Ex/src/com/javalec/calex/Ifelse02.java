package com.javalec.calex;

import java.util.Scanner;

public class Ifelse02 {

	public Ifelse02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int mat = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = sc.nextInt();
		
		double ave = (kor + eng + mat)/3;
		System.out.println("평균점수는"+ave+"입니다.");
		
		if (kor>ave) {
			System.out.println("국어점수는 평균보다 높다");
		}else if(kor==ave) {
			System.out.println("국어점수는 평균과 같다");
		}else {
			System.out.println("국어점수는 평균보다 낮다");
		}
		
		if (eng>ave) {
			System.out.println("영어점수는 평균보다 높다");
		}else if(eng==ave) {
			System.out.println("영어점수는 평균과 같다");
		}else {
			System.out.println("영어점수는 평균보다 낮다");
		}
		
		if (mat>ave) {
			System.out.println("수학점수는 평균보다 높다");
		}else if(mat==ave) {
			System.out.println("수학점수는 평균과 같다");
		}else {
			System.out.println("수학점수는 평균보다 낮다");
		}
	}

}
