package com.fin.gui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
			
			
			CalVO cal = new CalVO();
			
			while(rs.next()) {

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
	
			
	
}
