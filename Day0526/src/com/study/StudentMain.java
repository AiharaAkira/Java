package com.study;

public class StudentMain {

	public static void main(String[] args) {


		Record2 r2 = new Record2();
		// 인원수 입력 메소드 호출
		r2.InputPeopleNum();
		r2.input();
		r2.set();
		r2.print();

		Record r1 = new Record();
		r1.InputPeopleNum();
		r1.input();
		r1.set();
		r1.print();

	}

}
