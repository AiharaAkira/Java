package com.cmw.book;
public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.update();
		dao.insert();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
		
	}

}
