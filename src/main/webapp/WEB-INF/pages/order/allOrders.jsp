<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>班次管理</title>
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
                    <small>班次列表 —— 显示所有班次</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/order/toAddOrder">新增班次</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/order/allOrders">显示所有班次</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>班次名称</th>
                    <th>班次的时间段</th>
                    <th>每个班次需要的人数</th>
                    <th>两次排班的最小间隔</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="order" items="${requestScope.get('list')}">
                    <tr>
                        <td>${order.getName()}</td>
                        <td>${order.getBlock()}</td>
                        <td>${order.getNums()}</td>
                        <td>${order.getInterval()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/order/toUpdateOrder?id=${order.getId()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/order/del/${order.getId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>