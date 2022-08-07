import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 
 * ����Ŭ�� ���۵� SQL���� Parsing - > execute plan -> fetch �� �۾��� �� ���Ŀ�
 * SQL���� �������� DATA Buffer Cache�� ������
 * 
 * 
 * �Ȱ��� SQL�� ���۵Ǹ� Library cache�� ����� SQL�� Parsing �����
 * execute plan�� �״�� ����ϰ� ������ �ӵ� ��� ������ ��
 * 
 * PreparedStatement�� SQL�� ���´� �����ϳ� �����̳� �������� �ٸ� ������ 
 * ���ε� ������ ����ؼ� ����ó�������ν� �׻� ������ SQL���� �����ϰ� ó���ϰ�
 * �� �� �ִ�.
 * 
 * PreparedStatement ��ü�� ������ ���ε� ������ ���
 * ���ε� ������ ���������� ��ü�� �κп� �����
 * 
 * String sql = "insert into department values(?, ?, ?)"
 * 
 * PreparedStatement pstmt = con.prepareStatement(sql)
 * 
 * ���ε� ������ ������ŭ ������� �ش� ������ ��ü�� ���� ������ �ش�.
 * 
 *pstmt.setInt(1, 203) ;
 *pstmt.setString(2, "��ǻ�Ͱ���");
 *pstmt.setInt(3, 200);
 *pstmt.setString(4, "7ȣ��")
 * 
 * �ءءءء� ���ε� ������ ���� �÷����� ����� �� ����.
 * 
 * */
public class JdbcEx7 {

	public static void main(String[] args) {

		Connection con = null;
		
		PreparedStatement pstmt = null;

		ResultSet rs = null;
		
		try {
			//����̺� ����
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			con = ConnUtil.connection();
			System.out.println("���Ἲ��!");
			
			StringBuffer sql = new StringBuffer();
			
			sql.append("select * from professor where deptno = ?");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 203);
			
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt("profno"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getString("position"));
				System.out.println(rs.getInt("sal"));
				System.out.println(rs.getDate("hiredate"));
				System.out.println(rs.getInt("age"));
				System.out.println(rs.getInt("deptno"));
				System.out.println("------------------------------------------");
				
			}
			
			
			System.out.println("������ ��� ����");
			
			
			
		
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
