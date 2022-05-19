package com.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class ClassExam {

	private BufferedReader br;
	private String name;
	private int[] jumin;
	private boolean right;
	
	public ClassExam() throws IOException {

		br = new BufferedReader(new InputStreamReader(System.in));
		jumin = new int[14];
		System.out.println("이름?");
		name = br.readLine();
	}
	
	

	public BufferedReader getBr() {
		return br;
	}

	public void setBr(BufferedReader br) {
		this.br = br;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getJumin() {
		return jumin;
	}

	public void setJumin() throws IOException {
		int hap = 0;
		int cre = 2;
		float temp = 0.0f;
		float temp1 = 0.0f;
		
		do {
			right = false;
			System.out.println("주민번호?ex)111111-1111111");
			for (int i = 0; i < jumin.length; i++) {
				jumin[i] = System.in.read() - 48;
				System.out.println();

				// 일 공식
				if (jumin[2] * 10 + jumin[3] > 12) {
					System.out.println("태어난 달은 12월 보다 클 수가 없습니다.");
					continue;
				} else if (jumin[4] * 10 + jumin[5] > 31) {
					System.out.println("태어난 달은 12월 보다 클 수가 없습니다.");
					continue;
				} else if (jumin[7] != 9 && jumin[7] != 0 && jumin[7] != 1 && jumin[7] != 2 && jumin[7] != 3
						&& jumin[7] != 4) {
					System.out.println("주민 번호 7번째자리는 901234만 가능합니다.");
					continue;
				} else if (jumin[8] != 9 && jumin[8] != 1 && jumin[8] != 3 && jumin[8] != 0 && jumin[8] != 2
						&& jumin[8] != 4) {
					System.out.println("주민 번호 8번째자리는 913024만 가능합니다.");
					continue;
				}
			}

			

			for (int j = 0; j < jumin.length; j++) {
				if (j == 6) {
					continue;
				}

				// 주민번호 검증 공식
				hap += jumin[j] * cre;
				cre++;

				if (cre == 10) {
					cre = 2;
				}

				// 주민번호 검증공식2
				temp = (int) (hap / 11.0f) * 11.0f + 11.0f - hap;
				temp1 = temp - (int) (temp / 10.0f) * 10.0f;	
			
				if (temp1 != jumin[13]) {
					continue;
				}
			}
			
			

			right = true;

		} while (!right);

		
		
	}
	
	
	public void display() {
		System.out.println();
		System.out.println("이름: " + name);
		System.out.print("주민번호: ");

		for (int i = 0; i < jumin.length; i++) {

			if (i == 6) {
				System.out.print("-");
				continue;
			}

			System.out.print(jumin[i]);
		}

		System.out.println();
		System.out.print("생년월일: ");
		int year = 0, month = 0, day = 0;

		switch (jumin[7]) {
		case 9:
		case 0:
			year = 1800;
			break;

		case 1:
		case 2:
			year = 1900;

			break;

		case 3:
		case 4:
			year = 2000;

			break;

		}

		year += jumin[0] * 10 + jumin[1];
		month = jumin[2] * 10 + jumin[3];
		day = jumin[4] * 10 + jumin[5];
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.print("성별: ");
		System.out.println(jumin[7] % 2 == 0 ? "여자" : "남자");
		System.out.print("태어난 시: ");
		String area = "";
		switch (jumin[8]) {
		case 0:
			area = "서울";
			break;

		case 1:
			area = "경기,인천";
			break;
		case 2:
			area = "부산";
			break;
		case 3:
			area = "강원도";
			break;
		case 4:
			area = "충청도";
			break;
		case 5:
			area = "전라도";
			break;
		case 6:
			area = "대구, 광주";
			break;
		case 7:
			area = "경북, 경남";
			break;
		case 8:
			area = "경남";
			break;
		case 9:
			area = "제주";
			break;
		}
		System.out.println(area);

		System.out.print("나이: ");
		Calendar ca = Calendar.getInstance();
		int age = ca.get(Calendar.YEAR) - year + 1;
		System.out.println(age);
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public ClassExam(BufferedReader br, String name, int[] jumin, boolean right) {
		super();
		this.br = br;
		this.name = name;
		this.jumin = jumin;
		this.right = right;
	}
	
	
	
	
	
}
