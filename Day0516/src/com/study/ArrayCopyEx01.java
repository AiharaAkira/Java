package com.study;


/*
 * 배열의 복사
 * -배열은 한번 생성된 후 배열의 크기를 변경할 수 없음
 * -크기를 더 늘리고 싶을 경우 같은 자료형 배열을 원하는 크기로 준비하고
 * 기존의 배열을 복사하면 작업을 완료 할 수 있음.
 * 
 * System.arraycopy()메소드 이용
 * 
 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * {....}
 * 
 * src:소스배열
 * srcPos:소스배열의 복사 시작위치
 * dest:복사 배열
 * destPos:복사시작위치
 * length:복사되는 배열의 요소 수
 *
 * */

public class ArrayCopyEx01 {

	public static void main(String[] args) {

		String[] src = {"JAVA", "DataBase", "JSP", "Spring"};
		String[] dest = new String[6];
		dest[0] ="OS";
		dest[1] = "Network";
		
		System.arraycopy(src, 0, dest, 2, 4);
		
		for (String s : dest) {
			System.out.println("s의 값: "+s);
		}
	}

}
