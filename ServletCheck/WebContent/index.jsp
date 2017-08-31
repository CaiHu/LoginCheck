<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
	<form action="servlet/CheckServlet" method="get">
		姓名：<input type="text" name="username" value=""/>
		密码：<input type="text" name="password" value=""/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>