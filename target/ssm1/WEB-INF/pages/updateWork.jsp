<%@ page import="cn.web.domain.Work" %>
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
    <title>修改工作信息</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="../../background/css/bootstrap.min.css" rel="stylesheet">

    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../js/bootstrap.min.js"></script>


</head>
<body>
<div class="container" style="height: 1000px">
    <center><h3>修改工作信息页面</h3></center>
    <form action="${pageContext.request.contextPath}/work/update" method="post">

        <c:forEach items="${workList}" var="w">

            <div class="form-group">
                <label for="comno">编号：</label>
                <input type="text" class="form-control" id="comno" name="comno" value="${w.comno}" readonly="readonly">
            </div>

            <div class="form-group">
                <label for="username">人员编号：</label>
                <input type="text" class="form-control layui-input" id="username" name="username" value="${w.username}"  readonly="readonly">
            </div>

            <div class="form-group">
                <label for="comname">工作单位：</label>
                <input type="text" class="form-control layui-input" id="comname" name="comname" value="${w.comname}">
            </div>

            <div class="form-group">
                <label for="comaddress">工作地点：</label>
                <input type="text" class="form-control" id="comaddress" name="comaddress" value="${w.comaddress}">
            </div>

            <div class="form-group">
                <label for="comduty">职责：</label>
                <input type="text" class="form-control" id="comduty" name="comduty" value="${w.comduty}" >
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