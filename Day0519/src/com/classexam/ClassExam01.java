package com.classexam;

import java.io.IOException;

public class ClassExam01 {

	public static void main(String[] args) {
		try {
			
			ClassExam c = new ClassExam();
			c.setX();
			c.setY();
			c.display();
			c.setX(80);
			c.setY(50);
			c.display();
			
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
