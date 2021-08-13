<%@ page import="cn.web.domain.Activity" %>
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
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="../../background/css/bootstrap.min.css" rel="stylesheet">

    <link rel="stylesheet" href="../res/layui/css/layui.css" media="all">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" style="height: 1000px">
    <center><h3>添加联系人页面</h3></center>
    <form action="${pageContext.request.contextPath}/activity/addActivity" method="post">
        <div class="form-group">
            <label for="ano">活动编号：</label>
            <input type="text" class="form-control" id="ano" name="ano" placeholder="请输入活动编号">
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
            <label for="aplace">活动地点：</label>
            <input type="text" class="form-control" id="aplace" name="aplace" placeholder="请输入活动地点">
        </div>

        <div class="form-group">
            <label for="atime">活动时间：</label>
            <input type="date" class="form-control" id="atime" name="atime" placeholder="请输入活动时间">
        </div>

        <div class="form-group">
            <label for="acontent">活动内容：</label>
            <input type="text" class="form-control" id="acontent" name="acontent" placeholder="请输入活动内容">
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