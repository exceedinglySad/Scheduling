<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增班次</title>
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
                    <small>新增班次</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/order/addOrder" method="post">
        班次名称：
        <input type="text" name="name" required/>
        <br><br><br>
        班次的时间段：
        <input type="text" name="block" required/>
        <br><br><br>
        每个班次需要的人数：
        <input type="text" name="nums" required/>
        <br><br><br>
        两次排班的最小间隔
        <input type="text" name="interval" required pattern="^[0-9]*$">
        <br><br><br>
        <input type="submit" value="添加">
    </form>

</div>