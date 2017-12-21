<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>JSTL(JSP Standard Tag Library) 사용법</h1>
특정 자바 코드를 생성하는 태그이다.<br>

<h2>core 라이브러리</h2>

<h3>c:redirect 태그 II</h3>
<p>
HTTP 요청을 수행하는 태그이다.<br>
<%--
<c:redirect url="요청 URL"/>
--%>
</p>

<c:if test="${empty param.name}">
    <jsp:forward page="error.jsp"/>
</c:if>

${param.name} 님 환영합니다.





</body>
</html>