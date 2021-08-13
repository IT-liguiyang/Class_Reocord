<%@ page import="cn.web.domain.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<!-- HTML5文档-->
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加学生信息</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="../../background/css/bootstrap.min.css" rel="stylesheet">

    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="height: 1000px">
    <center><h3>添加学生信息页面</h3></center>
    <form action="${pageContext.request.contextPath}/student/addstudent" method="post">
        <div class="form-group">
            <label for="username">编号：</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="请输入学生编号">
        </div>

        <div class="form-group">
            <label for="cno">班级编号：</label>
            <select name="cno" id="cno" class="form-control" lay-verify="required">
                <option value="">请选择班级编号</option>
                <option value="20181001">计科181</option>
                <option value="20181002">计科182</option>
                <option value="20181003">计科183</option>
            </select>
        </div>

        <div class="form-group">
            <label for="realname">姓名：</label>
            <input type="text" class="form-control layui-input" id="realname" name="realname" placeholder="请输入姓名">
        </div>

        <div class="form-group">
            <label for="sex">性别：</label>
            <input type="text" class="form-control" id="sex" name="sex" placeholder="请输入性别">
        </div>

        <div class="form-group">
            <label for="birthday">生日：</label>
            <input type="date" class="form-control" id="birthday" name="birthday" placeholder="请输入生日" >
        </div>
        <div class="form-group">
            <label for="birthplace">出生地：</label>
            <input type="text" class="form-control" id="birthplace" name="birthplace" placeholder="请输入出生地" >
        </div>
        <div class="form-group">
            <label for="email">email：</label>
            <input type="text" class="form-control" id="email" name="email" placeholder="请输入email" >
        </div>
        <div class="form-group">
            <label for="hobby">爱好：</label>
            <input type="text" class="form-control" id="hobby" name="hobby" placeholder="请输入爱好" >
        </div>
        <div class="form-group">
            <label for="signature">签名：</label>
            <input type="text" class="form-control" id="signature" name="signature" placeholder="请输入签名" >
        </div>


        <div class="form-group">
            <label for="password">密码：</label>
            <input type="text" class="form-control" id="password" name="password" placeholder="请输入密码" >
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