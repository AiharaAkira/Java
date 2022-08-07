import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx04 {

	public static void main(String[] args) {

		Connection con = null;
		
		Statement stmt = null;

		try {
			//드라이브 연결
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DBManager.connection();
			System.out.println("연결성공!");
			
			stmt = con.createStatement();
			
			  //쿼리문 작성 
			
			StringBuffer sql = new StringBuffer();
			  
			  sql.append("insert into department ");
			  sql.append("values(203, '제어계측공학과', 200, '7호관')");
			  
			  
			  //excuteUpdate = insert update delete 
					  //excuteQuery = select 
			  int result = stmt.executeUpdate(sql.toString());
			  
			  System.out.println(result+"개의 행이 추가");
			 			
		
		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {
				stmt.close();
				con.close();
			} catch (Exception e2) {

				e2.printStackTrace();
			}

		}

	}

}
