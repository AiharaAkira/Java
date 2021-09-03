<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!
int i =10;
String str = "ABCDEF";
%>

<%
out.println("i=" + i + "<br/>");
out.println("str="+ str + "<br/>");
%>
i=<%=i %>
str=<%=str %>
</body>
</html>