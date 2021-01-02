<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<h1>登录页面</h1>
<hr>

<body>
<form action="${pageContext.request.contextPath}/login/register" method="post">
    用户名：<input type="text" name="username">
    <span style="color:red;">${error}</span>
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>