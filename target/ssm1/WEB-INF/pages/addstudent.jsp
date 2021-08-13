<%@ page import="cn.web.domain.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="../../background/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../background/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" style="height: 1000px">
    <center><h3>添加联系人页面</h3></center>
    <form action="${pageContext.request.contextPath}/student/addstudent" method="post">
        <div class="form-group">
            <label for="username">用户名：</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="请输入姓名">
        </div>

        <div class="form-group">
            <label for="password">密码：</label>
            <input type="text" class="form-control" id="password" name="password" placeholder="请输入密码">
        </div>

        <div class="form-group">
            <label for="realname">姓名：</label>
            <input type="text" class="form-control" id="realname" name="realname" placeholder="请输入姓名">
        </div>

        <div class="form-group">
            <label for="sex">性别：</label>
            <input type="text" class="form-control" id="sex" name="sex" placeholder="请输入性别">
        </div>

        <div class="form-group">
            <label for="birthday">出生日期：</label>
            <input type="text" class="form-control" id="birthday" name="birthday" placeholder="请输入出生日期"/>
        </div>

        <div class="form-group">
            <label for="birthplace">籍贯：</label>
            <input type="text" class="form-control" id="birthplace" name="birthplace" placeholder="请输入籍贯">
        </div>

        <div class="form-group">
            <label for="email">Email：</label>
            <input type="text" class="form-control" id="email" name="email" placeholder="请输入邮箱地址"/>
        </div>

        <div class="form-group">
            <label for="telephone">手机号：</label>
            <input type="text" class="form-control" id="telephone" name="telephone" placeholder="请输入手机号"/>
        </div>



        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回" />
        </div>
    </form>
</div>
</body>
</html>
