<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.domain.Score"%>
<%@page import="java.util.List"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    

<!DOCTYPE html>
<html>
<head>
<title>성적관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>

<header>
<jsp:include page="../header.jsp"/>
</header>

<h1>성적 목록</h1>
<p><a href='form.jsp' class='btn btn-primary btn-sm'>추가</a></p>
<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>이름</th><th>합계</th><th>평균</th>
</tr>
</thead>
<tbody>

<%
ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);

try {
    List<Score> list = scoreDao.selectList();
    
    for (Score score : list) {
%>        

    <tr>
        <td><%=score.getNo()%></td>
        <td><a href='view.jsp?no=<%=score.getNo()%>'><%=score.getName() %></a></td>
        <td><%=score.getSum() %></td>
        <td><%=score.getAver() %></td>
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
<jsp:include page="../footer.jsp"/>
</footer>

</div>

<%@ include file="../jslib.txt"%>

</body>
</html>
    