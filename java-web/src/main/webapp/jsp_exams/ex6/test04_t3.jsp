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
<h1>jsp:getProperty</h1>
겟터 호출하기
setPropey를 사용하는 경우 new 명령을 사용하여 객체를 만든 후 PageContext에 담아 놓고,<br>
그 객체를 PageContext에 담아 놓고 사용해도 문제가 없다.<br>


<jsp:useBean id="m" class="domain.Member">
  <jsp:setProperty name="m" property="name" value="홍길동"/>
  <jsp:setProperty name="m" property="age" value="20"/>
  <jsp:setProperty name="m" property="working" value="true"/>
</jsp:useBean>

<P>
이름: <jsp:getProperty name="m" property="name"/><br>
나이: <jsp:getProperty name="m" property="age"/><br>
직업: <jsp:getProperty name="m" property="working"/><br>
</P>



</body>
</html>