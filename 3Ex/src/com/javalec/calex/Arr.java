/**
 * 
 */
package com.javalec.calex;

import java.util.Scanner;

/**
 * @author user
 *
 */
public class Arr {

	/**
	 * 
	 */
	public Arr() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] name = {"����", "ö��", "�浿", "����", "����"};
		int[] cm = new int[5];
		int totalHeight = 0;
		int maxH = 0;
		int maxHindex = 0;
		int minH = 0;
		int minHindex = 0;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<cm.length; i++) {
			System.out.println(name[i] + "Ű�� �Է��ϼ���:");
			cm[i] = sc.nextInt();
			totalHeight = totalHeight + cm[i];
		}
		
		System.out.println("�л����� ��ս�����" + (totalHeight/cm.length)+"�Դϴ�.");
		
		for(int i =0; i<cm.length; i++) {
			if(cm[i] > maxH) {
				maxH = cm[i];
				maxHindex = i;
			}
		}
		
		System.out.println("����ū �л���" +name[maxHindex]  + "�Դϴ�.");
		
		
		for(int i =0; i<cm.length; i++) {
			if(cm[i] < minH) {
				minH = cm[i];
				minHindex = i;
			}
		}
		
		System.out.println("�������� �л���" +name[minHindex]  + "�Դϴ�.");
		// TODO Auto-generated method stub

	}

}
