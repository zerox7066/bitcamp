<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"
    import="java.util.Date"%>
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


<pre class="java">
    // contentType="text/html;charset=UTF-8"
    response.setContentType("text/html;charset=UTF-8");
    
    // import="java.lang";
    import java.lang.*;
    
    // import="java.lang.String, java.util.*, java.net.*"
    import java.lang.String;
    import java.util.*;
    
    //&lt;%@ page import="java.lang.STring" %>
    import java.lang.String;

</pre>

</body>
</html>