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
<h1>지시부(directive element)</h1>
서블릿 클래스에 특별한 작업을 지시할 때 사용한다.<br>


<h2>JSP 코드 - include</h2>
JSP 페이지에 다른 파일의 내용을 포함
<pre class="jsp">
&lt;%@ include file="URL"%>
%>
</pre>

<p>
JSP 엔진이 JSP 파일을 가지고 서블릿 클래스로 만들기 전에,
먼저 include 태그에 지정된 파일을 가져온다.<br>
그런 후에 서블릿 클래스 만들기를 수행한다.<br>
서블릿의 include 방식으로 동작하는 것이 아님에 주의하라!<br>
"인크루딩"은 반드시 그 대상이 서블릿이나 JSP이여야 하고 <br>
파일의 내용을 가져오는 것이 아니라,<br>
서블릿(JSP) 를 실행하는 것이다<br>

</body>
</html>