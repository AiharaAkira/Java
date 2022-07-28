package com.fin.gui;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CalDAO {

	

	public ArrayList<CalVO> getAllCal() {
	
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		
		ArrayList<CalVO> lists = new ArrayList<CalVO>();
		try {
			
			con = DBManager.connection();
			
			StringBuffer bufferedSql = new StringBuffer();
			String sql = "select * from cal";
			bufferedSql.append(sql);
			pstmt = con.prepareStatement(bufferedSql.toString());
			
			rs = pstmt.executeQuery();
			
			
			
			while(rs.next()) {

				CalVO cal = new CalVO();
				System.out.println("-------------------------------------");
		
				cal.setC_no(rs.getBigDecimal("c_no"));
				cal.setC_income_type(rs.getString("c_income_type"));
				cal.setC_income_ammount(rs.getBigDecimal("c_income_ammount"));
				cal.setC_income_memo(rs.getString("c_income_memo"));
				cal.setC_expense_type(rs.getString("c_expense_type"));
				cal.setC_expense_ammount(rs.getBigDecimal("c_expense_ammount"));
				cal.setC_expense_memo(rs.getString("c_expense_memo"));
				
				lists.add(cal);
				
				System.out.println("-------------------------------------");
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return lists;
		
	}
	
	public int getAddCal() {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int add = 0;
		int minus = 0;
		
		ArrayList<CalVO> lists = new ArrayList<CalVO>();
		try {
			
			con = DBManager.connection();
			
			StringBuffer bufferedSql = new StringBuffer();
			String sql = "select * from cal";
			bufferedSql.append(sql);
			pstmt = con.prepareStatement(bufferedSql.toString());
			
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {

				
				BigDecimal num1 = rs.getBigDecimal("c_income_ammount") ;
				BigDecimal num2 = rs.getBigDecimal("c_expense_ammount");
				
				add += num1.intValue();
				minus += num2.intValue();
			}
			
		} catch (Exception e) {

			e.printStackTrace();
		
		}finally {
			DBManager.close(con, pstmt, rs);
		}
		
		return add-minus;
	}
	
		
	
public void insertCal(String string, String string2, String string3, String string4, String string5, String string6) {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int add = 0;
		int minus = 0;
		
		try {
			
			con = DBManager.connection();
			
			StringBuffer bufferedSql = new StringBuffer();
			String sql = "insert into cal  values(cal_seq.nextval, ?, ?, ?,?,?,?)";
			bufferedSql.append(sql);
			pstmt = con.prepareStatement(bufferedSql.toString());
			pstmt.setInt(2, Integer.parseInt(string2) );
			pstmt.setInt(5, Integer.parseInt(string5));
			pstmt.setString(1, string);
			pstmt.setString(3, string3);
			pstmt.setString(4, string4);
			pstmt.setString(6, string6);
			if(pstmt.executeUpdate()==1) {
			
				System.out.println("삽입 성공!");
			}
				
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("삽입 실패!");
		}finally {
			DBManager.close(con, pstmt, null);
		}
		
	}
	
}
