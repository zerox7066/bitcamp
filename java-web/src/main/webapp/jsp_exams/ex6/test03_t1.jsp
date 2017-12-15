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
인스턴스 생성하기

<jsp:useBean id="list" class="java.util.ArrayList"/>

<%--
java.util.ArrayList<String> list = pageContext.getAttribute("list");
if (list == null) {
    list = new java.util.ArrayList<String>();
    // 생성한 객체는 pageContext 보관소에 저장한다.
    pageContext.setAttribute("list", list);
}
 --%>
 
 <%
 list.add("홍길동");
 list.add("임꺽정");
 list.add("유관순");
 %>

<p>
리스트 개수: <%=list.size() %><br>
</p>

<%
// 보관되었는지 확인
java.util.ArrayList list2 = (java.util.ArrayList) pageContext.getAttribute("list");
%>

<p>
list2.get(1): <%=list2.get(1) %>
</p>


</body>
</html>