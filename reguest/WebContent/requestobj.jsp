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
out.println("����:"+request.getServerName()+ "<br/>");
out.println("��Ʈ��ȣ:"+request.getServerPort()+"<br/>");
out.println("��û���:"+request.getMethod()+"<br/>");
out.println("��������:"+request.getProtocol()+"<br/>");
out.println("url:"+request.getRequestURL()+"<br/>");
out.println("url:"+request.getRequestURI());
%>

</body>
</html>