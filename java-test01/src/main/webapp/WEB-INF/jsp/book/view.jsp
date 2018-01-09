<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<title>도서목록</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>도서 상세정보</h1>

<c:if test="${not empty book}">
        <form action='update' method='post' enctype="multipart/form-data">
        
        <div class='form-group row'>
        <label for='no' class='col-sm-2 col-form-label'>번호</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='no' type='number' 
                name='no' value='${book.no}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='bookName' class='col-sm-2 col-form-label'>도서명</label>
        <div class='col-sm-10'>
        <input class='form-control' id='bookName' type='text' 
                name='bookName' value='${book.bookName}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='publisher' class='col-sm-2 col-form-label'>출판사</label>
        <div class='col-sm-10'>
        <input class='form-control' id='publisher' type='text' 
                name='publisher' value='${book.publisher}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='publishDate' class='col-sm-2 col-form-label'>출판일</label>
        <div class='col-sm-10'>
        <input class='form-control' id='publishDate' type='date' 
                name='publishDate' value='${book.publishDate}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='price' class='col-sm-2 col-form-label'>가격</label>
        <div class='col-sm-10'>
        <input class='form-control' id='price' name='price' type='number' 
                value='${book.price}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='comment' class='col-sm-2 col-form-label'>설명</label>
        <div class='col-sm-10'>
        <textarea class='form-control' id='comment' 
                    name='comment'>${book.comment}</textarea>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='comment' class='col-sm-2 col-form-label'>사진</label>
        <div class='col-sm-10'>
        <img src="${contextPath}/download/${book.photo}"><br> 
        </div>
        </div>        
        
        <div class='form-group row'>
        <label class='col-sm-2 col-form-label'>첨부파일</label>
        <div class='col-sm-10'>
        <%-- <c:forEach items="${book.photo}" var="file"> --%>
          <a href="${contextPath}/download/${book.photo}">${book.photo}</a><br>
        <%-- </c:forEach> --%>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='file1' class='col-sm-2 col-form-label'>파일</label>
        <div class='col-sm-10'>
        <input type="file" class="form-control-file" id="file1" name="file">
        </div>
        </div>
        
        <div class='form-group row'>
        <div class='col-sm-10'>
        <button class='btn btn-primary btn-sm'>변경</button>
        <a href='delete?no=${book.no}' class='btn btn-primary btn-sm'>삭제</a>
        </div>
        </div>
        </form>
</c:if>
<c:if test="${empty book}">
        <p>'${param.no}'번 게시물이 없습니다.</p>
</c:if>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
