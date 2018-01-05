<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>게시판</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>새 게시물</h1>
<form action="add" method='post'>

<div class='form-group row'>
<label for='title' class='col-sm-2 col-form-label'>제목</label>
<div class='col-sm-10'>
<input class='form-control' id='title' type='text' name='title'>
</div>
</div>

<div class='form-group row'>
<label for='content' class='col-sm-2 col-form-label'>내용</label>
<div class='col-sm-10'>
<textarea class='form-control' id='content' name='content'></textarea>
</div>
</div>

<div class="form-group row">
<div class='col-sm-2 col-form-label'></div>
<div class='col-sm-10'>
  <div class='custom-file'>
    <input type="file" class="custom-file-input" id="file" name="files">
    <label class='custom-file-label' for="file">첨부파일을 선택하세요.</label>
  </div>
</div>
</div>

<div class="form-group row">
<div class='col-sm-2 col-form-label'></div>
<div class='col-sm-10'>
  <div class='custom-file'>
    <input type="file" class="custom-file-input" id="file" name="files">
    <label class='custom-file-label' for="file">첨부파일을 선택하세요.</label>
  </div>
</div>
</div>

<div class="form-group row">
<div class='col-sm-2 col-form-label'></div>
<div class='col-sm-10'>
  <div class='custom-file'>
    <input type="file" class="custom-file-input" id="file" name="files">
    <label class='custom-file-label' for="file">첨부파일을 선택하세요.</label>
  </div>
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
    