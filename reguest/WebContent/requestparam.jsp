<%@page import="java.util.Arrays" %>
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
String name, id, pw, major, protocol;
String[] hobbys;
%>

<%
request.setCharacterEncoding("EUC-KR");
name=request.getParameter("id");
id=request.getParameter("name");
pw=request.getParameter("pw");
major=request.getParameter("major");
protocol=request.getParameter("protocol");
hobbys=request.getParameterValues("hobby");
%>

이름:<%=name %><br/>
아이디:<%=id %><br/>
비밀번호:<%=pw %><br/>
취미:<%=Arrays.toString(hobbys) %><br/>
전공:<%=major %><br/>
프로토콜:<%=protocol %><br/>
</body>
</html>