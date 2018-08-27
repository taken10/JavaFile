<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>住所入力</title>
</head>
<body>
	※住所送信フォーム
	<br>
	<form action="../AdressServlet1" method="post">
		郵便番号<br> <input type="text" name="post" pattern="\d{3}-\d{4}"
			placeholder="例 123-4567" title="郵便番号は
[3桁の数字]ー[4桁の数字]の順で記入してください。"><br>
		住所1<br> <input type="text" name="text1"><br>
		住所2（番地）<br>
		<input type="text" name="text2"><br>
		<input type="submit" name="submit" value="送信1" />
        <input type="submit"	name="submit" value="送信2" />
	</form>
</body>
</html>