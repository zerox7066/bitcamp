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
인스턴스 꺼내기.

<%
// useBean을 사용하기 전에 먼저 객체를 만을어
pageContext.setAttribute("list", new java.util.ArrayList());
%>

<jsp:useBean id="list" type="java.util.ArrayList"/>

<%--
java.util.ArrayList<String> list = pageContext.getAttribute("list");
if (list == null) {
    throw new Exception("객체 없음");
}
 --%>
 
 <p>
 리스트 크기: <%=list.size() %>

</body>
</html>