package com.cmw.book;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql db 검색");
	}

	@Override
	public void insert() {
		
		System.out.println("MySql db 삽입");
	}

	@Override
	public void delete() {
		System.out.println("MySql db 삭제");
		
	}

	@Override
	public void update() {
		System.out.println("MySql db 수정");
		
	}
	
	
	public MySqlDao() {
		
	}

}
