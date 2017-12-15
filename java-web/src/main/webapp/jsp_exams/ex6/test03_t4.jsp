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
<h1>jsp:useBean 테스트</h1>
type 와 class 구분하기.

<jsp:useBean id="list" type="java.util.ArrayList" class="java.util.ArrayList"/>


<%--
java.util.List list = pageContext.getAttribute("list");
if (list == null) {
    throw new Exception("객체 없음");
}
 --%>
 
 <p>
 리스트 크기: <%=list.size() %>

</body>
</html>