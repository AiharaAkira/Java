import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 

	트랜잭션(Transaction): 
	-insert, delete, update,,,등의 작업들을 하나의 논리적인 작업 단위로 묶어서 
	쿼리 실행시 모든 작업이 정상처리 된 경우에는 commit을 실행해서 db에 반영하고
	쿼리 실행 중 하나라도 정상처리가 되지 않은 경우 rollback을 실행해서
	작업단위내의 모든 작업을 취소한다.
	
	-논리적인 작업단위
	-트랜잭션은 여러개의 작업을 하나의 논리적인 작업 단위로 묶어주는 것을 말함.
	하나의 작업단위내에 전체 작업들이 모두 올바르게 수행되거나, 또는 전체 작업이
	모두 수행되지 않도록 함,
	
	메소드 종류
	commit()
	rollback(savePoint s)
	setSavePoint(String)
	setAutoCommit(Boolean value)
	
	
 * 
 * */
public class JdbcEx8 {

	public static void main(String[] args) {

		Connection con = null;
		
		PreparedStatement pstmt = null;

		ResultSet rs = null;
		
		try {
			
			//transaction 시작
			//드라이브 연결
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			con = ConnUtil.connection();
			//autoCommit기능 비활성화
			con.setAutoCommit(false);
			System.out.println("연결성공!");
			
			StringBuffer sql = new StringBuffer();
			//--작업시작-----------------------------------------------
			sql.append("insert into department values(?,?,?,?)");
			
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "간호학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "7호관");
			pstmt.executeUpdate();
			
			
			System.out.println("데이터 삽입 성공");
			//--작업끝-----------------------------------------------

			
			
			//--작업시작-----------------------------------------------
			
			StringBuffer sql2 = new StringBuffer();
			sql2.append("update department set dname =?, loc =? where deptno = ?");
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "간호학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			
			
			
			System.out.println("데이터 수정 성공");
			//--작업끝-----------------------------------------------

			con.commit();
			System.out.println("db에 정상적으로 반영");
			
			
		} catch (Exception e) {

			//쿼리가 정상적으로 실행 되지 않을 경우
			
			e.printStackTrace();

			try {

				con.rollback();
				System.out.println("롤백!");

			} catch (Exception e2) {

				e2.printStackTrace();
			
			}
			
			
			
			
		} finally {

			try {
																										
				
				ConnUtil.close(con, pstmt, rs);
				
			} catch (Exception e2) {

				e2.printStackTrace();
			}
			
			
			
		}

	}

}
