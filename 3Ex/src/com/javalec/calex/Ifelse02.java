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
		System.out.println("���������� �Է��ϼ���.");
		int kor = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		int mat = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		int eng = sc.nextInt();
		
		double ave = (kor + eng + mat)/3;
		System.out.println("���������"+ave+"�Դϴ�.");
		
		if (kor>ave) {
			System.out.println("���������� ��պ��� ����");
		}else if(kor==ave) {
			System.out.println("���������� ��հ� ����");
		}else {
			System.out.println("���������� ��պ��� ����");
		}
		
		if (eng>ave) {
			System.out.println("���������� ��պ��� ����");
		}else if(eng==ave) {
			System.out.println("���������� ��հ� ����");
		}else {
			System.out.println("���������� ��պ��� ����");
		}
		
		if (mat>ave) {
			System.out.println("���������� ��պ��� ����");
		}else if(mat==ave) {
			System.out.println("���������� ��հ� ����");
		}else {
			System.out.println("���������� ��պ��� ����");
		}
	}

}
