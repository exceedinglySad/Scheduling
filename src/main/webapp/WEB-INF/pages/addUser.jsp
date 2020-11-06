<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增客服人员</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增客服人员</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/user/addUser" method="post">
        客服人员姓名：
        <input type="text" name="name" required/>
        <br><br><br>
        客服人员角色：
        <select name="role">
            <option value ="客服人员">客服人员</option>
            <option value ="客服班长">客服班长</option>
        </select>
        <br><br><br>
        是否参与排班：
        <input id="isIn" type="radio" name="checked" value="1" checked>
        <label for="isIn">参与</label>
        <input id="isNotIn" type="radio" name="checked" value="0" >
        <label for="isNotIn">未参与</label>
        <br><br><br>
        <input type="submit" value="添加">
    </form>

</div>