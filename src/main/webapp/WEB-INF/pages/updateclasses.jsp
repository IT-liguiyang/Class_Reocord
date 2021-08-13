<%@ page import="cn.web.domain.Classes" %>
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
    <title>更新班级</title>

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
    <center><h3>更新班级页面</h3></center>
    <form action="${pageContext.request.contextPath}/classes/update" method="post">
        <c:forEach items="${classesList}" var="a">
        <div class="form-group">
            <label for="cno">班级编号：</label>
            <input type="text" class="form-control" id="cno" name="cno" value="${a.cno}" readonly="readonly">
        </div>

        <div class="form-group">
            <label for="Cname">班级名称：</label>
            <input type="text" class="form-control" id="Cname" name="Cname" value="${a.cname}">
        </div>

        <div class="form-group">
            <label for="Academy">所属学院：</label>
            <input type="text" class="form-control" id="Academy" name="Academy" value="${a.academy}">
        </div>

        <div class="form-group">
            <label for="Specialty">所属专业：</label>
            <input type="text" class="form-control" id="Specialty" name="Specialty" value="${a.specialty}">
        </div>

        <div class="form-group">
            <label for="Grade">专业年级：</label>
            <input type="text" class="form-control" id="Grade" name="Grade" value="${a.grade}">
        </div>

        <div class="form-group">
            <label for="Amount">班级人数：</label>
            <input type="text" class="form-control" id="Amount" name="Amount" value="${a.amount}">
        </div>

        <div class="form-group">
            <label for="Description">班级格言：</label>
            <input type="text" class="form-control" id="Description" name="Description" value="${a.description}">
        </div>
        </c:forEach>
        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回" />
        </div>
    </form>
</div>

</body>
</html>