




<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<!-- <!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN""http://w3.org/TR/html4/loose.dtd"> -->

<html>
<head>
<meta charset="EUC-KR">
<!-- <meta http-equiv="content-Type" content = "text/html; charset=EUC-KR"> -->
<title>Insert title here</title>
</head>
<body>

	<%!
	Connection connection;
	Statement statement;
	ResultSet resultSet;

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin@localhost:1521:xe";
	String uid = "system";
	String upw = "oracle";
	String query = "select * from member";
	%>

	<%
	try {
		Class.forName(driver);
		connection = DriverManager.getConnection(url, uid, upw);
		statement = connection.createStatement();
		resultSet = statement.executeQuery(query);

		while (resultSet.next()) {
			String id = resultSet.getString("id");
			String pw = resultSet.getString("pw");
			String name = resultSet.getString("name");
			String phone = resultSet.getString("phone");

			out.println("아이디: " + id + ", 비밀번호: " + ", 이름: " + name + ",전화번호: " + phone + "<br/>");

		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (resultSet != null)
		resultSet.close();
			if (statement != null)
		statement.close();
			if (connection != null)
		connection.close();

		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	%>

</body>
</html>