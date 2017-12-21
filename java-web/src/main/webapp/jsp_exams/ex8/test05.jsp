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
<h1>EL(Expression Language)</h1>
OGNL 표기법을 이용하여 자바 객체의 프로퍼티 값을 꺼내는 문법이다.<br>
OGNL(Object Graph Navigation Language) 이란?<br>
점(.)이나 대괄호([]) 등을 이용하여 객체의 변수 값을 쉽게 꺼내게 해주는 문법이다.<br>

<%
application.setAttribute("name", "홍길동");
application.setAttribute("age", 20);
application.setAttribute("working", true);
%>

<h2>ServletContext에서 값 꺼내기</h2>
<p>PageContext의 getAttribute()를 호출할 때는 "pageScope" 이름을 이용하여  
값을 꺼내야 한다.</p>

${applicationScope.name}<br>
${applicationScope.age}<br>
${applicationScope.working}<br>
 
</body>
</html>