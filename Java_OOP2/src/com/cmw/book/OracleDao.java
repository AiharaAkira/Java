package com.cmw.book;

public class OracleDao implements DataAccessObject{
	
	@Override
	public void select() {
		System.out.println("oracle db �˻�");
	}

	@Override
	public void insert() {
		
		System.out.println("oracle db ����");
	}

	@Override
	public void delete() {
		System.out.println("oracle db ����");
		
	}

	@Override
	public void update() {
		System.out.println("oracle db ����");
		
	}
	
	
	public OracleDao() {
		select();
		insert();
		update();
		delete();
	}
}
