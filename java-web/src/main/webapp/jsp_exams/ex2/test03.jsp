<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<% int a = 10; %>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<% int b = 20; %>
<body>
<h1>스크립트릿 테스트</h1>
<%
out.println(a + b);
%>

</body>
</html>
<%
class MyInner {} //ㅋㅋ
%>