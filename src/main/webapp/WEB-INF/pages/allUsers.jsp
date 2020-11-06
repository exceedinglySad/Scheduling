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
                    <small>用户列表 —— 显示所有用户</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/toAddUser">新增客服人员</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/allUsers">显示所有客服人员</a>
        </div>
        <div class="col-md-8 column">
            <form class="form-inline" action="${pageContext.request.contextPath}/user/queryUsers" method="post" style="float:right">
                <span style="color:red;font-weight:bold">${error}</span>
                <input type="text" name="queryUsername" class="form-control" placeholder="请输入客服人员姓名"/>
                <input type="submit" value="查询" class="btn btn-primary"/>
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>客服姓名</th>
                    <th>角色</th>
                    <th>是否参与排班</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="user" items="${requestScope.get('list')}">
                    <tr>
                        <td>${user.getName()}</td>
                        <td>${user.getRole()}</td>
                        <td>
                            <c:choose>
                                <c:when test="${user.getChecked()=='1'}">
                                    参与
                                </c:when>
                                <c:otherwise>
                                    未参与
                                </c:otherwise>
                            </c:choose>
                        </td>
                        <td>
                            <a href="${pageContext.request.contextPath}/user/toUpdateUser?id=${user.getId()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/user/del/${user.getId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>