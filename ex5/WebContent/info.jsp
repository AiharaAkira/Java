<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="student" class="ex5.Student" scope="page"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<jsp:setProperty property="name" name="student" value="홍길동"/>
<jsp:setProperty property="age" name="student" value="10"/>
<jsp:setProperty property="grade" name="student" value="3"/>
<jsp:setProperty property="studentNum" name="student" value="27"/>

<jsp:getProperty property="name" name="student" /><br/>
<jsp:getProperty property="age" name="student" /><br/>
<jsp:getProperty property="grade" name="student" /><br/>
<jsp:getProperty property="studentNum" name="student"/>
</body>
</html>