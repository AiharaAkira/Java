import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx01 {

	public static void main(String[] args) {

		Connection con = null;
		
		Statement stmt = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DBManager.connection();
			System.out.println("���Ἲ��!");
			
			stmt = con.createStatement();
			//������ �ۼ�
			StringBuffer sql = new StringBuffer();
			
			sql.append("insert into department ");
			sql.append("values(203, '����������а�', 200, '7ȣ��')");
		
			
			//excuteUpdate = insert update delete
			//excuteQuery = select
			int result = stmt.executeUpdate(sql.toString());
			
			System.out.println(result+"���� ���� �߰�");
			
		
		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}catch (SQLException e3) {

			e3.printStackTrace();
		
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
