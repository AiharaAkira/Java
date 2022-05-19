package com.classexam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClassExam {


	private int x;
	private int y;
	private BufferedReader br;
	
	public ClassExam() {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		x=0;
		y=0;
		
	}
	
	public void setX() throws IOException{
		System.out.println("x?");
		x= Integer.parseInt(br.readLine()) ;
	}
	
	public void setY() throws IOException{
	
		System.out.println("y?");
		y= Integer.parseInt(br.readLine()) ;
	}
	
	public void display() {
		System.out.println("Á¡ÀÇ ÁÂÇ¥ ("+x+","+y+")	"+"x:"+x+", y:"+y);
	}
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ClassExam(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	
	
	
	
}
