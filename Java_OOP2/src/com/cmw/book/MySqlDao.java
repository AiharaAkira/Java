package com.cmw.book;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySql db �˻�");
	}

	@Override
	public void insert() {
		
		System.out.println("MySql db ����");
	}

	@Override
	public void delete() {
		System.out.println("MySql db ����");
		
	}

	@Override
	public void update() {
		System.out.println("MySql db ����");
		
	}
	
	
	public MySqlDao() {
		
	}

}
