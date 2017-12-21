<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    trimDirectiveWhitespaces="true"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>JSTL(JSP Standard Tag Library) 사용법</h1>
특정 자바 코드를 생성하는 태그이다.<br>

<h2>core 라이브러리</h2>

<h3>c:forEach 태그 II</h3>
<p>
반복문을 생성할 때 사용하는 태그이다.<br>
<%--
<c:forEach var="변수명" items="목록" being="시작인덱스" end="끝인덱스">
   ....    
</c:forEach>

목록 : 배열, java.util.Collection, java.util.Iterator, java.util.Enumeration
       java.util.Map
--%>

</p>

<%
pageContext.setAttribute("list1", new String[]{"홍길동","유관순","임꺽정"});
%>

<p>배열:
<c:forEach items="${list1}" var="item">
    ${item}:
</c:forEach>
</p>


<p>배열:
<c:forEach items="${list1}" var="item" begin="1">
    ${item}:
</c:forEach>
</p>


<p>배열:
<c:forEach items="${list1}" var="item" end="2">
    ${item}:
</c:forEach>
</p>

<p>배열:
<c:forEach items="${list1}" var="item" begin="1" end="2">
    ${item}:
</c:forEach>
</p>


<%
ArrayList<String> list2 = new ArrayList<>();
list2.add("홍길동");
list2.add("임꺽정");
list2.add("유관순");
pageContext.setAttribute("list2", list2);
%>

<p>ArrayList:
<c:forEach items="${list2}" var="item">
    ${item}:
</c:forEach>
</p>

<%
HashMap<String, Object> map = new HashMap<>();
map.put("name","홍길동");
map.put("age",20);
map.put("working",true);
pageContext.setAttribute("map", map);
%>

<p>HashMap:
<c:forEach items="${map}" var="item">
    ${item.key} = ${item.value}:
</c:forEach>
</p>

<p>CSV:
<c:forEach items="홍길동,유관순,안중근" var="item">
    ${item}:
</c:forEach>
</p>
















</body>
</html>