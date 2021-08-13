<%@ page import="cn.web.domain.ClassNotes" %>
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
    <title>添加通知</title>

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
    <center><h3>添加班级通知页面</h3></center>
    <form action="${pageContext.request.contextPath}/notes/add" method="post">
        <div class="form-group">
            <label for="cnno">班级编号：</label>
            <input type="text" class="form-control" id="cnno" name="cnno" placeholder="班级活动编号">
        </div>

        <div class="form-group">
            <label for="cno">班级编号：</label>
            <select name="cno" id="cno" class="form-control" lay-verify="required">
                <option value="">请选择班级编号</option>
                <option value="20181001">JK181</option>
                <option value="20181002">JK182</option>
                <option value="20181003">JK183</option>
            </select>
        </div>

        <div class="form-group">
            <label for="cntime">通知时间：</label>
            <input type="date" class="form-control" id="cntime" name="cntime" placeholder="请输入通知时间">
        </div>

        <div class="form-group">
            <label for="cncontent">通知内容：</label>
            <input type="text" class="form-control" id="cncontent" name="cncontent" placeholder="请输入通知内容">
        </div>

        <div class="form-group">
            <label for="cnsubject">通知主题：</label>
            <input type="text" class="form-control" id="cnsubject" name="cnsubject" placeholder="请输入通知主题">
        </div>

        <div class="form-group">
            <label for="cnpublisher">发布人：</label>
            <input type="text" class="form-control" id="cnpublisher" name="cnpublisher" placeholder="请输入发布人">
        </div>

        <div class="form-group">
            <label for="cnreader">已读人数：</label>
            <input type="text" class="form-control" id="cnreader" name="cnreader" placeholder="请输入已读人数">
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