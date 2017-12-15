<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
    
<!DOCTYPE html>
<html>
<head>
<%!
    public int a;
%>
<meta charset="UTF-8">
<title>JSP 예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<%!
{
   this.a = 100;
   this.b = 200;
}
%>
<body>
<h1>선언부(declaration element)</h1>

a + b = <%=m()%>
</body>
<%!
    public int m() {
    return a +b;
  }
%>
</html>
<%!
    public int b;
%>