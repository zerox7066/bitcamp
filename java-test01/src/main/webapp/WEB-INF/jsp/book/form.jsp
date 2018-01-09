<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>도서 정보</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>새 도서</h1>

<form action="add" method='post' enctype="multipart/form-data">

<div class='form-group row'>
<label for='bookname' class='col-sm-2 col-form-label'>도서명</label>
<div class='col-sm-10'>
<input class='form-control' id='bookname' type='text' name='bookName'>
</div>
</div>

<div class='form-group row'>
<label for='publisher' class='col-sm-2 col-form-label'>출판사</label>
<div class='col-sm-10'>
<input class='form-control' id='publisher' type='text' name='publisher'>
</div>
</div>

<div class='form-group row'>
<label for='publishDate' class='col-sm-2 col-form-label'>출판일</label>
<div class='col-sm-10'>
<input class='form-control' id='publishDate' type='date' name='publishDate'>
</div>
</div>

<div class='form-group row'>
<label for='price' class='col-sm-2 col-form-label'>가격</label>
<div class='col-sm-10'>
<input class='form-control' id='price' type='number' name='price'>
</div>
</div>

<div class='form-group row'>
<label for='comment' class='col-sm-2 col-form-label'>설명</label>
<div class='col-sm-10'>
<textarea class='form-control' id='comment' name='comment'></textarea>
</div>
</div>

<div class='form-group row'>
<label for='file1' class='col-sm-2 col-form-label'>사진</label>
<div class='col-sm-10'>
<input type="file" class="form-control-file" id="file1" name="file">
</div>
</div>

<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>등록</button>
</div>
</div>
</form>

<jsp:include page="../footer.jsp"/>

</div>

<jsp:include page="../jslib.jsp"/>

</body>
</html>
    