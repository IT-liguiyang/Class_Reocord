<%@ page import="cn.web.domain.Activity" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width,user-scalable=no,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0">
    <title>JK 181</title>
    <link href="../../background/css/bootstrap.min.css" rel="stylesheet">
    <script src="../../background/js/jquery-2.1.0.min.js"></script>
    <script src="../../js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../res/layui/css/layui.css">
    <link rel="stylesheet" href="../res/static/css/index.css">
    <style type="text/css">
        .container {
            margin-top: 100px;
        }
    </style>
</head>
<body>
<!-- nav部分 -->
<div class="nav index">
    <div class="layui-container">
        <!-- logo -->
        <div class="nav-logo">
            <a href="index.jsp">
                <img src="../res/static/img/logo.png" width="200px" height="80px" alt="JK 181">
            </a>
        </div>
        <div class="nav-list">
            <button>
                <span></span><span></span><span></span>
            </button>
            <ul class="layui-nav" lay-filter="">
                <li class="layui-nav-item"><a href="index.jsp">班级活动</a></li>
                <li class="layui-nav-item layui-this"><a href="hdlb.jsp">活动列表</a></li>
                <li class="layui-nav-item"><a href="hdgx.jsp">活动感想</a></li>
                <li class="layui-nav-item"><a href="hdxc.jsp">活动相册</a></li>
            </ul>
        </div>
    </div>
</div>
<!-- banner部分 -->
<div class="container">
    <%--    <h3 style="text-align: center">班级通知列表</h3>--%>
    <div style="float: left;">
        <form class="form-inline" action="${pageContext.request.contextPath}/findUserByPageServlet" method="post">
            <div class="form-group">
                <label for="exampleInputName2">通知编号</label>
                <input type="text" name="username" value="${condition.username[0]}" class="form-control"
                       id="exampleInputName2">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
        </form>
    </div>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>活动编号</th>
            <th>活动地点</th>
            <th>活动时间</th>
            <th>活动内容</th>
        </tr>
        <c:forEach items="${activity}" var="at">
            <tr>
                <td>${at.ano}</td>
                <td>${at.aplace}</td>
                <td>${at.atime}</td>
                <td>${at.acontent}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<script src="../../background/js/jquery.min.js"></script>
<script src="../../background/js/layui.all.js"></script>
<script src="../res/layui/layui.js"></script>
<!--[if lt IE 9]>
<script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
<script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<script>
    layui.config({
        base: '../res/static/js/'
    }).use('firm');
</script>
</body>
</html>