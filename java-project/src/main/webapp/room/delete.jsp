<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.RoomDao"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
    
<!DOCTYPE html>
<html>
<head>
<title>강의실관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>

<header>
<jsp:include page="../header.jsp"/>
</header>

<h1>강의실 삭제</h1>

<%
RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);

try {
    int no = Integer.parseInt(request.getParameter("no"));
    
    if (roomDao.delete(no) > 0) {
%>

<p>삭제했습니다.</p>
        
<%
    } else {
%>

<p>'<%=no%>'의 강의실 정보가 없습니다.</p>
        
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
    