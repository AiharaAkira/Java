<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page="fo02.jsp">
<jsp:param value="abcde" name="id"/>
<jsp:param value="abcde12" name="pw"/>
</jsp:forward>

</body>
</html>