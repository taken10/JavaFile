<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力された住所の表示</title>
</head>
<body>
<%String msg =(String)request.getAttribute("ads");%>
<h2>住所</h2>
<%= msg %>

</body>
</html>