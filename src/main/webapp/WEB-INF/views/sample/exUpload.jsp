<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8" http-equiv="Content-Type" content="text/html;  charset=UTF-8">
<title>Multipart Uplaod</title>
</head>
<body>

<form action="/sample/exUploadPost" method="post" enctype="multipart/form-data">
		
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='submit'>
		</div>
</form>
</body>
</html>