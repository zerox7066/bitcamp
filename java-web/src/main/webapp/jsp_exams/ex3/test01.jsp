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
10 + 20 = <%= 10 + 20 %> 입니다.


<h2>JSP 표현식</h2>
<pre class="jsp">
&lt;%= 20 + 30%>
</pre>

<h2>생성된 자바 코드</h2>
<pre class="java">
out.write("<h1>표현식 테스트)</h1>\n")
out.write("10 + 20 =")
out.print(10 + 20)
out.write("입니다.")
</pre>

</body>
</html>