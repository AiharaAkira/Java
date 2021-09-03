<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	session.setAttribute("mySesssionName", "mySessionData");
	session.setAttribute("myNum", 1234);

%>
<a href="sessionget.jsp">session get</a>

</body>
</html>