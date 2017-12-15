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

<jsp:useBean id="list1" class="java.util.ArrayList"/>
<%--
java.util.List list = pageContext.getAttribute("list");
if (list == null) {
    list = new java.util.ArrayList();
    pageContext.setAttribute("list", list);
}
 --%>
 
 
<jsp:useBean id="list2" class="java.util.ArrayList" scope="request"/>
<%--
java.util.List list = request.getAttribute("list");
if (list == null) {
    list = new java.util.ArrayList();
    pageContext.setAttribute("list", list);
}
 --%>

 
<p>
<h2>PageContext 보관소</h2>
list1 : <%=pageContext.getAttribute("list1") %><br>
list2 : <%=pageContext.getAttribute("list2") %><br>

<h2>ServletRequest 보관소</h2>
list1 : <%=request.getAttribute("list1") %><br>
list2 : <%=request.getAttribute("list2") %><br>


</body>
</html>