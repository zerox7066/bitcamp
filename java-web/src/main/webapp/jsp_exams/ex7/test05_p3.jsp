<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>HttpServletRequest 보관소 II</h1>
모든 클라이언트가 같은 ServletContext 객체를 공유한다.<br>

<%=application.getAttribute("name")%>


</body>
</html>