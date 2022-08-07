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
public class JdbcEx05 {

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
			
			sql.append("insert into professor values (?,?,?,?,?,sysdate,?, (select deptno from department  where loc='7ȣ��'))");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 02);
			pstmt.setString(2, "�̸�");
			pstmt.setString(3, "email");
			pstmt.setString(4, "������");
			pstmt.setInt(5, 100);
			pstmt.setInt(6, 40);
			
			
			pstmt.executeUpdate();
			System.out.println("������ ���� ����");
			
			
			
		
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
