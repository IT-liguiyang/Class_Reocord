<%@ page import="cn.web.domain.Releaseforum" %>
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
    <title>添加论坛</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="../../background/css/bootstrap.min.css" rel="stylesheet">

    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../../js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../../js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="height: 1000px">
    <center><h3>添加论坛页面</h3></center>
    <form action="${pageContext.request.contextPath}/releaseforum/addreleaseforum" method="post">
        <div class="form-group">
            <label for="rno">编号：</label>
            <input type="text" class="form-control" id="rno" name="rno" placeholder="请输入论坛编号">
        </div>

        <div class="form-group">
            <label for="Sno">人员编号：</label>
            <select name="Sno" id="Sno" class="form-control" lay-verify="required">
                <option value="">请选择编号</option>
                <option value="1811001">周元</option>
                <option value="1811002">楚青</option>
                <option value="1811003">苏幼微</option>
                <option value="1822001">武瑶</option>
                <option value="1822002">叶歌</option>
                <option value="1822003">李卿婵</option>
                <option value="1833001">萧炎</option>
                <option value="1833002">林动</option>
                <option value="1833003">周小天</option>
            </select>
        </div>


        <div class="form-group">
            <label for="rname">人员：</label>
            <input type="text" class="form-control" id="rname" name="rname" placeholder="请输入人名">
        </div>

        <div class="form-group">
            <label for="rtime">论坛时间：</label>
            <input type="date" class="form-control layui-input" id="rtime" name="rtime" placeholder="请输入论坛时间">
        </div>



        <div class="form-group">
            <label for="rcontent">论坛内容：</label>
            <input type="text" class="form-control" id="rcontent" name="rcontent" placeholder="请输入论坛内容">
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