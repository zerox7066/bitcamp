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
<h1>jsp:useBean</h1>
JSP 페이지에 이 태그를 넣으면 자바 객체를 생성하는 코드를 삽입한다.<br>
<%-- <jsp:useBean id="member" class="" type="" scope="page"></jsp:useBean> --%>

<h2>주요 속성</h2>
<h3>id 속성</h3>
<p>객체를 생성한 후 저장할 때 사용할 이름<br>
동시에 변수명으로도 사용함.
</p>

<h3>class</h3>
<p>
객체를 생성하기 위한 클래스명.<br>
반드시 Fully-Qualified Class Name을 줘야 한다.<br>
즉 패키지명을 포함한 클래스 이름이어야 한다.<br>
객체를 생성할 때 사용할 이름이기 때문에 반드시 클래스이름이어야 한다.<br>
인스페이스와 추상 클래스는 인스턴스를 생성할 수 없기 때문에 사용할 수 없다.<br>
</p>

<h3>type</h3>
<p>
변수를 선언할 때 사용할 타입명.<br>
인스턴스를 만드는 용도가 아니기 때문에 인터페이스나 추상 클래스도 가능하다.<br>
물로 이 이름도 반드시 Full-Qualified Name 이어야 한다.<br>
만약 이 속성이 생략되면 class 속성 값을 변수 선언하는데 사용한다.<br>
</p>

<h3>scope 속성</h3>
<p>
객체를 생성한 후 저장할 보관소를 지정한다.<br>
이 속성을 생략하면 기본적으로 PageContext 보관소에 저장된다.<br>
서블릿은 총 4개의 
</p>






</body>
</html>