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


<h2>JSP 코드 - tablib</h2>
JSP 에서 제공하는 태그 외에 외부에서 확장 태그를 가져올 때 사용한다.<br>
확장 태그의 예로 JSTL(JSP Standard Tag Library) 태그 라이브러리가 있다<br>
<pre class="jsp">
&lt;%@ taglib uri="URI" prefix="네임스페이스명"%>
</pre>


</body>
</html>