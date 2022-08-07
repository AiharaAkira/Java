import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * 

	Ʈ�����(Transaction): 
	-insert, delete, update,,,���� �۾����� �ϳ��� ������ �۾� ������ ��� 
	���� ����� ��� �۾��� ����ó�� �� ��쿡�� commit�� �����ؼ� db�� �ݿ��ϰ�
	���� ���� �� �ϳ��� ����ó���� ���� ���� ��� rollback�� �����ؼ�
	�۾��������� ��� �۾��� ����Ѵ�.
	
	-������ �۾�����
	-Ʈ������� �������� �۾��� �ϳ��� ������ �۾� ������ �����ִ� ���� ����.
	�ϳ��� �۾��������� ��ü �۾����� ��� �ùٸ��� ����ǰų�, �Ǵ� ��ü �۾���
	��� ������� �ʵ��� ��,
	
	�޼ҵ� ����
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
			
			//transaction ����
			//����̺� ����
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			con = ConnUtil.connection();
			//autoCommit��� ��Ȱ��ȭ
			con.setAutoCommit(false);
			System.out.println("���Ἲ��!");
			
			StringBuffer sql = new StringBuffer();
			//--�۾�����-----------------------------------------------
			sql.append("insert into department values(?,?,?,?)");
			
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "��ȣ�а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "7ȣ��");
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

			//������ ���������� ���� ���� ���� ���
			
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
