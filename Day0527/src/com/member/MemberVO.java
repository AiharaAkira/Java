package com.member;

public class MemberVO {

	private String name;
	private String tel;
	private String email;
	private int age;
	private String nation;
	
	public MemberVO() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public MemberVO(String name, String tel, String email, int age, String nation) {
		super();
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.age = age;
		this.nation = nation;
	}
	
	
	
}
