<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>修改信息</title>
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

    <form:form modelAttribute="user" method="post" action="${pageContext.request.contextPath}/user/updateUser">
        <form:hidden path="id"/>
        客服人员姓名：
        <form:input path="name" required="required" />
        <br><br><br>
        客服人员角色：
        <form:select path="role">
            <form:option value="客服人员">客服人员</form:option>
            <form:option value="客服班长">客服班长</form:option>
        </form:select>
        <br><br><br>
        是否参与排班：
        <form:radiobutton path="checked" value="1" label="参与"/>
        <form:radiobutton path="checked" value="0" label="未参与"/>
        <br><br><br>
        <input type="submit" value="提交"/>
    </form:form>

</div>