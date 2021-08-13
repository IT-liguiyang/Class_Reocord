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
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="../background/css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="../background/js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="../js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
</head>
<body>
<div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>学生信息管理</cite></a>
              <a><cite>学生列表</cite></a>
            </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon"
                                                                        style="line-height:30px">ဂ</i></a>
</div>
<div class="container">
    <h3 style="text-align: center">学生信息列表</h3>

    <div style="float: left;">

        <form class="form-inline" action="${pageContext.request.contextPath}/student/findbycondition" method="post">
            <div class="form-group">
                <label for="search_username">学号</label>
                <input type="text" name="search_username" value="" class="form-control" id="search_username">
            </div>
            <div class="form-group">
                <label for="search_realname">姓名</label>
                <input type="text" name="search_birthplace" value="" class="form-control"
                       id="search_realname">
            </div>

            <div class="form-group">
                <label for="search_birthplace">籍贯</label>
                <input type="text" name="search_birthplace" value="" class="form-control"
                       id="search_birthplace">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
        </form>

    </div>

    <div style="float: right;margin: 5px;">
        <a class="btn btn-primary addstudent">添加联系人</a>
    </div>

    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>用户名</th>
            <th>密码</th>
            <th>姓名</th>
            <th>性别</th>
            <th>出生日期</th>
            <th>籍贯</th>
            <th>Email</th>
            <th>手机号</th>
            <th>激活状态</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${search_student_list}"  var="stu">
            <tr>
                <td>${stu.username}</td>
                <td>${stu.password}</td>
                <td>${stu.realname}</td>
                <td>${stu.sex}</td>
                <td>${stu.birthday}</td>
                <td>${stu.birthplace}</td>
                <td>${stu.email}</td>
                <td>${stu.telephone}</td>
                <td>${stu.status}</td>
                <td>
                    <div class="layui-table-cell laytable-cell-1-0-10">
                        <button class="btn btn-default btn-sm xiugai">修改</button>
                        <button class="btn btn-default btn-sm delete">删除</button>
                    </div>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div>

    </div>


</div>
<script>
    $(".addstudent").click(function(){
        // var username = $(this).parents("tr").find("td:eq(1)").text();
        window.location.href='/page/edit?page=addstudent';
    })


    $(".xiugai").click(function(){
        var username = $(this).parents("tr").find("td:eq(0)").text();
        window.location.href='/page/edit?page=updatestudent&&Uname='+username;
    })

    //判断弹框
    $(".delete").click(function(){
        //获取要删除用户的名字
        var username = $(this).parents("tr").find("td:eq(0)").text();
        alert("确定删除用户"+username+"吗?");
        window.location.href='${pageContext.request.contextPath}/student/delete?username='+username;
    })


</script>


</body>
</html>
