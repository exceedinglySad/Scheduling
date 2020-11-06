<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>修改班次信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改信息</small>
                </h1>
            </div>
        </div>
    </div>

    <form:form modelAttribute="order" method="post" action="${pageContext.request.contextPath}/order/updateOrder">
        <form:hidden path="id"/>
        班次名称：
        <form:input path="name" required="required" />
        <br><br><br>
        班次的时间段：
        <form:input path="block" required="required" />
        <br><br><br>
        每个班次需要的人数：
        <form:input path="nums" required="required"/>
        <br><br><br>
        两次排班的最小间隔：
        <form:input path="interval" pattern="^[0-9]*$" required="required" />
        <br><br><br>
        <input type="submit" value="提交"/>
    </form:form>

</div>