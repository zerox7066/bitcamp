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
<h1>EL(Expression Language)</h1>
OGNL 표기법을 이용하여 자바 객체의 프로퍼티 값을 꺼내는 문법이다.<br>
OGNL(Object Graph Navigation Language) 이란?<br>
점(.)이나 대괄호([]) 등을 이용하여 객체의 변수 값을 쉽게 꺼내게 해주는 문법이다.<br>

<%
pageContext.setAttribute("name", "홍길동");
pageContext.setAttribute("age", 20);
pageContext.setAttribute("working", true);
%>

<h2>PageContext에서 값 꺼내기</h2>
<p>PageContext의 getAttribute()를 호출할 때는 "pageScope" 이름을 이용하여  
값을 꺼내야 한다.</p>

${pageScope.name}<br>
${pageScope.age}<br>
${pageScope.working}<br>

<h2>EL에서 미리 등록된 객체 이름</h2>
<%--
servletContext   => ServletContext    => ${pageContext.servletContext.프로퍼티명}
session          => HttpSession       => ${pageContext.session.프로퍼티명}
request          => ServletRequest    => ${pageContext.request.프로퍼티명}
response         => ServletResponse   => ${pageContext.response.프로퍼티명}
pageContext      => PageContext       => ${pageContext} 

param   => request.getParameter(파라미터명)  
        => ${param.파라미터명}
paramvalues => request.getParameterValues(파라미터명)
            => ${paramValues.파라미터명}
header  => request.getHeader("User-Agent")
        => ${header["User-Agent"]}
        => ${header.헤더명}
 headerValues  =>  request.getHeader(헤더명)
               =>  ${headerValues.헤더명}
 cookie  => Cookie[] cookies = request.getCookies();
            반복문으로 조건 검사하여 쿠키 값 꺼낸다.
         => ${cookie.쿠키명}
initParam  => cofig.getInitParameter(파라미터명)
           => ${initParam.파라미터명}
pageScope  => pageContext.getAttribute(프로퍼티명)
           => ${pageScope.프로퍼티명}
requestScope  => request.getAttribute(프로퍼티명)
              => ${requestScope.프로퍼티명}
sessionScope  => session.getAttribute(프로퍼티명)
              => ${sessionScope.프로퍼티명}
applicationScope  => application.getAttribute(프로퍼티명)
                  => ${applicationScope.프로퍼티명}

 --%>
 
</body>
</html>