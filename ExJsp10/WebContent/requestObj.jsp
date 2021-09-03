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
	out.println("서버: " + request.getServerName() + "<br />");
	out.println("포트 번호: " + request.getServerPort() + "<br />");
	out.println("서버: " + request.getMethod() + "<br />");
	out.println("서버: " + request.getProtocol() + "<br />");
	out.println("서버: " + request.getRequestURL() + "<br />");
	out.println("서버: " + request.getRequestURL() + "<br />");
	%>
</body>
</html>