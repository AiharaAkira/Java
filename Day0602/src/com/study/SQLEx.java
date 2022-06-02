package com.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLEx {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:orclethin:@localhost:1521:orcl",
					"scott","tiger"
					);
			
		}catch(SQLException se){
			
			System.out.println("드라이버가 없습니다.");
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally {

			try {
				if(pstmt != null) {
					pstmt.close();
				}	
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
			
				if(con != null) {
					con.close();
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
			
	
			
		}
		
		
		
		
	}
	
}
