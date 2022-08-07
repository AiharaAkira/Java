import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcEx9 {

	public static void main(String[] args) {

		
		
		
		Connection con = null;
		
		PreparedStatement pstmt = null;

		ResultSet rs = null;
		
		try {
			
			Properties pro = new Properties();
			pro.load(new FileInputStream("src/department_insert.properties"));
			
			con = ConnUtil.connection();
			con.setAutoCommit(false);
			System.out.println("���Ἲ��!");
			
			StringBuffer sql = new StringBuffer();
			//--�۾�����-----------------------------------------------
			sql.append("insert into department values(?,?,?,?)");
			
			
			pstmt = con.prepareStatement(pro.getProperty("department_insert"));
			pstmt.setInt(04, 255);
			pstmt.setString(2, "��ȣ�а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "11ȣ��");
			pstmt.executeUpdate();
			
			
			System.out.println("������ ���� ����");
			//--�۾���-----------------------------------------------

			
			
			//--�۾�����-----------------------------------------------
			
			StringBuffer sql2 = new StringBuffer();
			sql2.append("update department set dname =?, loc =? where deptno = ?");
			pstmt = con.prepareStatement(sql2.toString());
			pstmt.setString(1, "��ȣ�а�");
			pstmt.setString(2, "8ȣ��");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			
			
			
			System.out.println("������ ���� ����");
			//--�۾���-----------------------------------------------

			con.commit();
			System.out.println("db�� ���������� �ݿ�");
			
			
		} catch (Exception e) {

			
			e.printStackTrace();

			try {

				con.rollback();
				System.out.println("�ѹ�!");

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
