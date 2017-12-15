<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.MemberDao"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
    
<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>

<header>
<jsp:include page="../header.jsp"/>
</header>

<h1>회원 삭제</h1>

<%
MemberDao memberDao = ContextLoaderListener.iocContainer.getBean(MemberDao.class);

try {
    int no = Integer.parseInt(request.getParameter("no"));
    
    if (memberDao.delete(no) > 0) {
%>

<p>삭제했습니다.</p>
        
<%
    } else {
%>

<p>'<%=no%>'번의 회원 정보가 없습니다.</p>

<% 
    }

} catch (Exception e) {
    e.printStackTrace();
%>
    <%=e.getMessage()%>
<%
}
%>

<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>
 
<footer>
 <jsp:include page="../footer.jsp"></jsp:include>
</footer>

</div>

<%@ include file="../jslib.txt"%>

</body>
</html>
    