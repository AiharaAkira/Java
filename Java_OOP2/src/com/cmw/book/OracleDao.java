package com.cmw.book;

public class OracleDao implements DataAccessObject{
	
	@Override
	public void select() {
		System.out.println("oracle db 검색");
	}

	@Override
	public void insert() {
		
		System.out.println("oracle db 삽입");
	}

	@Override
	public void delete() {
		System.out.println("oracle db 삭제");
		
	}

	@Override
	public void update() {
		System.out.println("oracle db 수정");
		
	}
	
	
	public OracleDao() {
		select();
		insert();
		update();
		delete();
	}
}
