<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
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
                    <small>排班列表 —— 显示所有排班</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/result/allResults">显示所有的排班信息</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/result/build">重新构建排班信息</a>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>排班天</th>
                    <th>班次</th>
                    <th>值班人员</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="resultVO" items="${requestScope.get('list')}">
                    <tr>
                        <td>${resultVO.getDays()}</td>
                        <td>${resultVO.getOrderName()}</td>
                        <td>${resultVO.getOperator()}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>