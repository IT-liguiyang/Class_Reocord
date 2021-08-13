<%@ page import="cn.web.domain.ActivityThought" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width,user-scalable=no,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0">
    <title>活动详情</title>
    <link href="../../background/css/bootstrap.css" rel="stylesheet">
    <script src="../../background/js/jquery-2.1.0.min.js"></script>
    <script src="../../js/bootstrap.js"></script>
    <link rel="stylesheet" href="../../activity/res/layui/css/layui.css">
    <link rel="stylesheet" href="../../activity/res/static/css/index.css">

</head>
<body>
<!-- nav部分 -->
<div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>班级活动管理</cite></a>
              <a><cite>班级活动感想</cite></a>
            </span>
</div>
<!-- banner部分 -->
<div class="container">
    <h3 style="text-align: center">班级活动感想列表</h3>
    <div style="float: left;">
        <form class="form-inline" id="qf" action="${pageContext.request.contextPath}/thought/findall" method="post">
            <input type="hidden" name="pageNum"value="${pageInfo.pageNum}" id="pageNum">
            <input type="hidden" name="pageSize"value="${pageInfo.pageSize}" id="pageSize">
            <div class="form-group">
                <label for="atcontent">活动感想</label>
                <input type="text" name="atcontent" class="form-control" id="atcontent">
            </div>
            <button type="submit" class="btn btn-default">查询</button>
        </form>
    </div>

    <div style="float: right;margin: 5px;">
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/thought/html/addActivityThought.jsp">添加感想</a>
    </div>

    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>编号</th>
            <th>人员编号</th>
            <th>活动时间</th>
            <th>活动感想</th>
            <th>发布者</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pageInfo.list}" var="at">
            <tr>
                <td>${at.atno}</td>
                <td>${at.username}</td>
                <td>${at.attime}</td>
                <td>${at.atcontent}</td>
                <td>${at.atname}</td>
                <td>
                    <div class="layui-table-cell laytable-cell-1-0-10">
                        <button class="btn btn-default btn-sm xiugai" style="background-color: #00FFFF">修改</button>
                        <button class="btn btn-default btn-sm delete" style="background-color: red">删除</button>
                    </div>
                </td>
            </tr>
        </c:forEach>
    </table>
    <!--显示分页信息-->
    <div>
        <nav aria-lable="Page navigation">
            <ul class="pagination">
                <li id="first">
                    <a href="javascript:void(0);">
                        <span aria-hidden="true">首页</span>
                    </a>
                </li>
                <li id="prev">
                    <a href="javascript:void(0);" aria-lable="Previous">
                        <span aria-hidden="true">上一页</span>
                    </a>
                </li>

                <c:forEach items="${pageInfo.navigatepageNums}" var="i">
                    <li name="pageNum" <c:if test="${i == pageInfo.pageNum}">class="active"</c:if> >
                        <a href="javascript:void(0);">${i}</a>
                    </li>
                </c:forEach>

                <li id="next">
                    <a href="javascript:void(0);" aria-lable="Next">
                        <span aria-hidden="true">下一页</span>
                    </a>
                </li>

                <li id="last">
                    <a href="javascript:void(0);">
                        <span aria-hidden="true">末页</span>
                    </a>
                </li>

                <span style="font-size: 20px;margin-left: 5px">
                    共条${pageInfo.total} 记录，共${pageInfo.pages}页，每页行数
                    <select  id="setRows">
                        <option value="5" <c:if test="${5 == pageInfo.pageSize}">selected</c:if> >5</option>
                        <option value="10" <c:if test="${10 == pageInfo.pageSize}">selected</c:if> >10</option>
                    </select>
                </span>

            </ul>

        </nav>
    </div>

</div>

<script src="../../background/js/jquery.min.js"></script>
<script src="../../background/js/layui.all.js"></script>
<script src="../../activity/res/layui/layui.js"></script>
<!--[if lt IE 9]>

<![endif]-->
<script>
    //1.初始化变量
    var pageNum = ${pageInfo.pageNum}; //当前页码
    var pages = ${pageInfo.pages}; //总页数
    var hasPreviousPage = ${pageInfo.hasPreviousPage}; //还有上一页
    var hasNextPage = ${pageInfo.hasNextPage}; //还有下一页
    //2.判断按钮的状态
    if (!hasPreviousPage){
        $("#prev").addClass("disabled");
        $("#first").addClass("disabled");
    }

    if (!hasNextPage){
        $("#next").addClass("disabled");
        $("#last").addClass("disabled");
    }
    //3.按钮的监听事件
    $("#first").click(function(){
        if (!$("#first").hasClass("disabled")){
            $("#pageNum").val(1);
            $("#qf").submit();
        }
    });

    $("#prev").click(function (){
        if (!$("#prev").hasClass("disabled")){
            $("#pageNum").val(pageNum-1);
            $("#qf").submit();
        }
    });

    $("#next").click(function (){
        if (!$("#next").hasClass("disabled")){
            $("#pageNum").val(pageNum+1);
            $("#qf").submit();
        }
    });

    $("#last").click(function (){
        if (!$("#last").hasClass("disabled")){
            $("#pageNum").val(pages);
            $("#qf").submit();
        }
    });

    //4.每页行数改变事件监听
    $("li[name='pageNum']").click(function () {
        if (!$(this).hasClass("active")){
            $("#pageNum").val($(this).children("a").html());
            $("#qf").submit();
        }
    });
    //5.点击页码时间监听
    $("#setRows").change(function () {
        $("#pageSize").val($(this).val());
        $("#pageNum").val(1);
        $("#qf").submit();
    })

</script>

<![endif]-->
<script>
    layui.config({
        base: '../res/static/js/'
    }).use('firm');

    $(".xiugai").click(function(){
        var atno = $(this).parents("tr").find("td:eq(0)").text();
        alert("确定修改"+atno+"吗?");
        //window.location.href='/page/edit?page=updateActivityThought&&atno='+atno;
        window.location.href='${pageContext.request.contextPath}/thought/queryKey?atno='+atno;
    })

    //判断弹框
    $(".delete").click(function(){
        //获取要删除用户的名字
        var atno = $(this).parents("tr").find("td:eq(0)").text();
        alert("确定删除"+atno+"吗?");
        window.location.href='${pageContext.request.contextPath}/thought/delete?atno='+atno;
    })
</script>

</body>
</html>