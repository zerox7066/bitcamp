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
<h1>표현식(expression element)</h1>
<p>JSP 페이지에 어떤 명령의 결과를 출력하는 출력문을 만들 때 사용한다.</p>
<p>표현식? 작업을 수행한 후 값을 리턴하는 명령문</p>


<h2>JSP 표현식</h2>
<pre class="jsp">
&lt;%= 20 + 30%>
</pre>

<h2>생성된 자바 코드</h2>
<pre class="java">
out.println(20 + 30);
</pre>

</body>
</html>