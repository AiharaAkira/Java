package com.game;

import java.util.Random;

public class Coordinate {

	private int x;
	private int y;
	int monX;
	int monY;

	public Coordinate() {
		this.y = 8;
		this.x = 10;

	}

	public void down() {

		this.y = y + 1;

	}

	public void left() {

		this.x = x - 1;

	}

	public void right() {

		this.x = x + 1;

	}

	public void up() {

		this.y = y - 1;

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

	public Coordinate(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void print() {
		Random r = new Random();
		
		monX = r.nextInt(8)+1;
		monY = r.nextInt(17)+1;

		// print
		int[][] dementions = new int[10][19];

		for (int i = 0; i < dementions.length; i++) {

			for (int j = 0; j < dementions[i].length; j++) {
				if (i == 0 || i == dementions.length - 1 || j == 0 || j == dementions[i].length - 1) {
					System.out.print("#");
				} else if (i == y && j == x) {
					System.out.print("@");
				} else if (i == 4 && j == 5) {
					System.out.print("G");
				} else if (i == monX && j == monY) {
					System.out.print("M");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

	}

}
