package com.score;

public class ScoreVO {

	private String name, birth, hak;
	private int kor, eng, mat;
	
	public ScoreVO() {
	}

	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public ScoreVO(String name, String birth, String hak, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.birth = birth;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getTot() {
		return (mat + kor + eng);
	}

	
	
	
	
	
	
	
}
