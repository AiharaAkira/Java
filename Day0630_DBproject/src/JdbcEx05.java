import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 
 * 오라클로 전송된 SQL문은 Parsing - > execute plan -> fetch 의 작업을 한 이후에
 * SQL문을 수행결과를 DATA Buffer Cache에 저장함
 * 
 * 
 * 똑같은 SQL이 전송되면 Library cache에 저장된 SQL의 Parsing 결과와
 * execute plan의 그대로 사용하게 됨으로 속도 향상에 도움을 줌
 * 
 * PreparedStatement는 SQL의 형태는 동일하나 조건이나 변수값이 다른 문장을 
 * 바인딩 변수를 사용해서 변수처리함으로써 항상 동일한 SQL문을 동일하게 처리하게
 * 할 수 있다.
 * 
 * PreparedStatement 객체의 생성과 바인딩 변수의 사용
 * 바인딩 변수는 실제값으로 대체될 부분에 사용함
 * 
 * String sql = "insert into department values(?, ?, ?)"
 * 
 * PreparedStatement pstmt = con.prepareStatement(sql)
 * 
 * 바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해 준다.
 * 
 *pstmt.setInt(1, 203) ;
 *pstmt.setString(2, "컴퓨터공학");
 *pstmt.setInt(3, 200);
 *pstmt.setString(4, "7호관")
 * 
 * ※※※※※ 바인딩 변수는 절대 컬럼명에는 사용할 수 없다.
 * 
 * */
public class JdbcEx05 {

	public static void main(String[] args) {

		Connection con = null;
		
		PreparedStatement pstmt = null;

		ResultSet rs = null;
		
		try {
			//드라이브 연결
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			con = ConnUtil.connection();
			System.out.println("연결성공!");
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("insert into professor values (?,?,?,?,?,sysdate,?, (select deptno from department  where loc='7호관'))");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 02);
			pstmt.setString(2, "이름");
			pstmt.setString(3, "email");
			pstmt.setString(4, "포지션");
			pstmt.setInt(5, 100);
			pstmt.setInt(6, 40);
			
			
			pstmt.executeUpdate();
			System.out.println("데이터 삽입 성공");
			
			
			
		
		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
																										
				
				ConnUtil.close(con, pstmt, rs);
				
			} catch (Exception e2) {

				e2.printStackTrace();
			}
			
			
			
		}

	}

}
