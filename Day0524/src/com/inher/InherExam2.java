package com.inher;

public class InherExam2 {

	public static void main(String[] args) {

			SuperExam se = new InherExam();
			se.write();
			se.print();
			
			((SuperExam)se).write();
			System.out.println("�ڽ�:"+se.b+"�θ�:"+((SuperExam)se).b);
			
			
		
	}

}
