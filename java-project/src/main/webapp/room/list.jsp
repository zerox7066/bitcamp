<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Room"%>
<%@page import="java.util.List"%>
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

<h1>강의실 목록</h1>
<p><a href='form.jsp' class='btn btn-primary btn-sm'>추가</a></p>
<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>지역</th><th>강의실명</th><th>수용인원</th><th>삭제</th>
</tr>
</thead>
<tbody>

<%
RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);

try {
    List<Room> list = roomDao.selectList();
    
    for (Room room : list) {
%>
    <tr>
        <td><%=room.getNo()%></td>
        <td><%=room.getLocation()%></td>
        <td><%=room.getName()%></td>
        <td><%=room.getCapacity()%></td>
        <td><a href='delete.jsp?no=<%=room.getNo()%>'>삭제</a></td>
    </tr>

<%
    }

} catch (Exception e) {
    e.printStackTrace();
%>
    <%=e.getMessage()%>
<%
}
%>

</tbody>
</table>
 
<footer>
 <jsp:include page="../footer.jsp"></jsp:include>
</footer>

</div>

<%@ include file="../jslib.txt"%>

</body>
</html>
    