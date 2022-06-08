package com.achievement;

public class AchievementVO {

	private String hak;
	private String name;
	private String birth;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	 public AchievementVO() {
		// TODO Auto-generated constructor stub
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

	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public AchievementVO(String hak, String name, String birth, int kor, int eng, int mat, int tot) {
		super();
		this.hak = hak;
		this.name = name;
		this.birth = birth;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
	}
	
	@Override
	public String toString() {
		String str = String.format("%7s %10s %8s %5d %5d %5d %5d %6.1f", 
				hak, name, kor, eng, mat, kor, getTot(),(float)getTot()/3);
		
		return str;
	}
	
	
}
