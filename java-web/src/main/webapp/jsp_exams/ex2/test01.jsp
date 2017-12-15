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
<h1>스크립트릿(scriptlet elememt)</h1>
<p>Jsp 페이지에 자바 코드를 넣을 사용한다.</p>

<h2>JSP 스크립트릿</h2>
<pre class="jsp">
&lt;%
int a = 10;
int b = 20;
out.printf("<p>%d + %d</p> = %d\n", a, b, a + b);
%>
</pre>

<h2>생성된 자바 코드</h2>
<pre class="java">
int a = 10;
int b = 20;
out.println(a + b);
</pre>

</body>
</html>