import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {

	public static Connection connection() throws SQLException {

		// ����
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		return DriverManager.getConnection(url, "scott", "tiger");

	}

	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null) {

				rs.close();
			}
		} catch (Exception e) {
		}

		try {

			pstmt.close();
		} catch (Exception e) {
		}
		try {
			con.close();

		} catch (Exception e) {
		}

	}

}
