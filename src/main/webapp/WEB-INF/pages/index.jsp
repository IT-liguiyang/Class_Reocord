<%@ page import="cn.web.domain.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <title>班级同学录管理系统</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon"/>
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <script type="text/javascript" src="../background/lib/loading/okLoading.js"></script>
    <link rel="stylesheet" href="../background/css/main.css" media="all">
    <link rel="stylesheet" href="../background/css/font.css">

</head>
<style>
    .show_list {
        display: block;
    }

    .hide_lits {
        display: none;
    }
</style>
<script>


</script>
<body>
<div class="layui-layout layui-layout-admin">
    <div class="layui-header header header-demo">
        <div class="layui-main">
            <div class="admin-logo-box">
                <a class="logo" href="" title="logo">班级同学录管理系统</a>
                <div class="larry-side-menu">
                    <img src="../img/ss.png" alt="">
                </div>
            </div>

            <ul class="layui-nav" lay-filter="">
                <li class="layui-nav-item" id="time"
                    style="margin-right: 50px;font-size: 16px;color: #2fb9d4;position: absolute;left: -250px;top: 0"></li>
                <li class="layui-nav-item"><img src="../img/tx.jpg" class="layui-circle"
                                                style="border: 2px solid #A9B7B7;" width="35px" height="35px" alt="">
                </li>
                <li class="new-nav " id="gonggao">
                    <i></i>
                    <a href="#"><i class="iconfont">&#xe6bc;</i><span class="layui-badge">4</span></a>
                    <ul class="news" id="gonggaos" style="display: none;">
                        <li class="dropdown-header"><i class="iconfont">&#xe6bc;</i>4条活动</li>
                        <li><a href="javascript:;" onclick="xadmin.add_tab('统计页面','notice-list.html')">
                            <div class="clearfix">
                                <span class="pull-left"> <i class="btn btn-pink iconfont">&#xe6bc;</i> 小区活动 </span>
                                <span class="pull-right badge badge-info">+12</span>
                            </div>
                        </a></li>
                        <li><a href="javascript:;"> <i class="btn btn-primary iconfont">&#xe6bc;</i> 业主活动 </a></li>

                        <li><a href="javascript:;">查看所有活动 <i class="iconfont">&#xe69b;</i> </a></li>
                    </ul>
                </li>
                <li class="new-nav" id="new-nav">
                    <i></i>
                    <a href="#"><i class="iconfont">&#xe713;</i><span class="layui-badge">5</span></a>
                    <ul class="news" id="news" style="display: none;">
                        <li class="dropdown-header"><i class="iconfont">&#xe6bc;</i>5条投诉</li>
                        <li><a href="#">
                            <div class="clearfix">
                                <span class="pull-left"> <i class="btn btn-pink iconfont">&#xe69b;</i> 投诉 </span>
                                <span class="pull-right badge badge-info">+5</span>
                            </div>
                        </a></li>

                        <li><a href="javascript:;"> 查看所有投诉 <i class="iconfont">&#xe69b;</i> </a></li>
                    </ul>
                </li>
                <c:forEach items="${login}" var="a">
                <li class="layui-nav-item"><a href="javascript:;">${a.realname}</a>
                    <dl class="layui-nav-child">
                        <!-- 二级菜单 -->
                        <dd><a href="javascript:;" onclick="one_set('个人信息','one_set.html','1000','600')">个人信息</a>
                        </dd>
                        <!--                        <dd><a href="one_set.html">个人信息</a></dd>-->
                        <dd><a href="">切换帐号</a></dd>
                        <dd><a href="${pageContext.request.contextPath}/admin/logout">退出</a></dd>
                    </dl>
                </li>
                </c:forEach>
                <li class="layui-nav-item x-index"><a href="#"></a></li>
            </ul>
        </div>
    </div>

    <!--左侧导航区域-->
    <div class="layui-side layui-bg-black x-side show_list" style="left:0px;" id="table1">
        <div style="height: 130px; width: 220px; ">
            <a class="img" title="我的头像" style="display: block;width: 80px;height: 80px;margin: 10px auto 10px;">
                <img src="../img/tx.jpg" class="userAvatar"
                     style="display: block;width: 100%;height: 100%;border-radius: 50%;-webkit-border-radius: 50%;-moz-border-radius: 50%;border: 4px solid #44576b;box-sizing: border-box;">
            </a>
            <c:forEach items="${login}" var="a">
            <p style=" display: block;width: 100%;height: 25px;color: #ffffff;text-align: center;font-size: 12px;white-space: nowrap;line-height: 25px;overflow: hidden;">
                你好！<span class="userName">${a.realname}</span>, 欢迎回来！
            </p>
            </c:forEach>
        </div>
        <div class="layui-side-scroll">

            <ul class="layui-nav layui-nav-tree site-demo-nav" lay-filter="side">
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;" _href="../views/welcome.jsp">
                    <i class="layui-icon left-n.av-li" lay-tips="首页">&#xe68e;</i><cite>首页</cite> </a>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i
                        class="iconfont icon-dashaxiaoqudizhi01" style="top: 3px;"></i><cite>班级信息管理</cite> </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/classes/findall"> <cite>班级信息列表</cite> </a></dd>
                        </dd>
                    </dl>
                </li>


                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i
                        class="iconfont icon-dashaxiaoqudizhi01" style="top: 3px;"></i><cite>学生信息管理</cite> </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/student/findall"> <cite>学生信息列表</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i
                        class="iconfont icon-dashaxiaoqudizhi01" style="top: 3px;"></i><cite>班级通知管理</cite> </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/notes/findall"> <cite>班级通知列表</cite> </a></dd>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i
                        class="layui-icon iconfont icon-zichan" style="top: 3px;"></i><cite>班级活动管理</cite> </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/activity/findall"> <cite>班级活动列表</cite> </a></dd>
                    </dl>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/thought/findall"> <cite>班级活动感想</cite> </a></dd>
                    </dl>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/commentActivityThought/findall"> <cite>活动感想评论</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i
                        class="layui-icon iconfont icon-zichan" style="top: 3px;"></i><cite>论坛信息管理</cite> </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/releaseforum/findall"> <cite>论坛列表</cite> </a></dd>
                    </dl>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/commentforum/findall"> <cite>评论论坛</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i
                        class="iconfont icon-dashaxiaoqudizhi01" style="top: 3px;"></i><cite>住址信息管理</cite> </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/homeinfo/findall"> <cite>住址信息列表</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i
                        class="iconfont icon-dashaxiaoqudizhi01" style="top: 3px;"></i><cite>工作信息管理</cite> </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="${pageContext.request.contextPath}/work/findall"> <cite>工作信息列表</cite> </a></dd>
                    </dl>
                </li>

                <li class="layui-nav-item" style="height: 30px; text-align: center"></li>
            </ul>
        </div>
    </div>


    <div class="layui-side layui-bg-black x-side hide_lits" style="left:0px;" id="table2">
        <div style="height: 130px; width: 220px; ">
            <a class="img" title="我的头像" style="display: block;width: 80px;height: 80px;margin: 10px auto 10px;">
                <img src="../img/tx.jpg" class="userAvatar"
                     style="display: block;width: 100%;height: 100%;border-radius: 50%;-webkit-border-radius: 50%;-moz-border-radius: 50%;border: 4px solid #44576b;box-sizing: border-box;">
            </a>
            <p style=" display: block;width: 100%;height: 25px;color: #ffffff;text-align: center;font-size: 12px;white-space: nowrap;line-height: 25px;overflow: hidden;">
                你好！<span class="userName">xiyuan</span>, 欢迎回来
            </p>
        </div>
        <div class="layui-side-scroll">
            <ul class="layui-nav layui-nav-tree site-demo-nav" lay-filter="side">
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe607;</i><cite>栏目管理</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                        <dd class=""><a href="javascript:;" _href="/xiyuan/cate/lst.html"> <cite>栏目列表</cite> </a></dd>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe62d;</i><cite>公告管理</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                        <dd class=""><a href="javascript:;" _href="/xiyuan/notice/typelist.html"> <cite>公告类型</cite> </a>
                        </dd>
                        </dd>
                        <dd class="">
                        <dd class=""><a href="javascript:;" _href="/xiyuan/notice/lst.html"> <cite>公告列表</cite> </a></dd>
                        </dd>

                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe634;</i><cite>文章管理</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                        <dd class=""><a href="javascript:;" _href="/xiyuan/article/typelist.html"> <cite>文章类型列表</cite>
                        </a></dd>
                        <dd class=""><a href="javascript:;" _href="/xiyuan/article/lst.html"> <cite>文章列表</cite> </a>
                        </dd>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe642;</i><cite>订单管理</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class="">
                        <dd class=""><a href="javascript:;" _href="../views/welcome.jsp"> <cite>订单列表（待开发）</cite> </a></dd>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe630;</i><cite>分类管理111</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="./category.html"> <cite>分类列表</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe606;</i><cite>评论管理</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="./comment-list.html"> <cite>评论列表</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./feedback-list.html"> <cite>意见反馈</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe612;</i><cite>会员管理</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="member-list.html"> <cite>会员列表</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./member-del.html"> <cite>删除会员</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./member-level.html"> <cite>等级管理</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./member-kiss.html"> <cite>积分管理</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./member-view.html"> <cite>浏览记录</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./member-view.html"> <cite>分享记录</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe613;</i><cite>管理员管理</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="/xiyuan/admin/lst.html"> <cite>管理员列表</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./admin-role.html"> <cite>角色管理</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./admin-cate.html"> <cite>权限分类</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./admin-rule.html"> <cite>权限管理</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe629;</i><cite>系统统计</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="./echart.html"> <cite>统计报表</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item"><a class="javascript:;" href="javascript:;"> <i class="layui-icon"
                                                                                           style="top: 3px;">&#xe614;</i><cite>系统设置</cite>
                </a>
                    <dl class="layui-nav-child">
                        <dd class=""><a href="javascript:;" _href="./sys-set.html"> <cite>系统设置</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./sys-data.html"> <cite>数字字典</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./sys-shield.html"> <cite>屏蔽词</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./sys-log.html"> <cite>系统日志</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./sys-link.html"> <cite>友情链接</cite> </a></dd>
                        <dd class=""><a href="javascript:;" _href="./sys-qq.html"> <cite>第三方登录</cite> </a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item" style="height: 30px; text-align: center"></li>
            </ul>
        </div>
    </div>


    <div class="layui-tab layui-tab-card site-demo-title x-main" lay-filter="x-tab" lay-allowclose="true"
         style="left: 220px;border-left: solid 2px #2299ee;">
        <ul class="layui-tab-title">
            <li class="layui-this"> 我的桌面 <i class="layui-icon layui-unselect layui-tab-close">ဆ</i></li>
        </ul>
        <div class="layui-tab-content site-demo site-demo-body">
            <div class="layui-tab-item layui-show">
                <iframe frameborder="0" src="../views/welcome.jsp" class="x-iframe"></iframe>
            </div>
        </div>
    </div>
    <div class="site-mobile-shade"></div>
</div>


<script src="../background/lib/layui/layui.js" charset="utf-8"></script>
<script src="../background/js/main.js"></script>
<script src="../background/js/jquery.min.js"></script>
<script src="../background/js/x-layui.js" charset="utf-8"></script>

<script>
    $(".daohang").click(function () {
        var table = $(this).attr("ids");
        var ids = $(".show_list").attr("id");
        $("#" + ids + "").addClass("hide_lits");
        $("#" + ids + "").removeClass("show_list");
        $("" + table + "").removeClass("hide_lits");
        $("" + table + "").addClass("show_list");
    })


</script>
<script>
    layui.use(['laydate', 'element', 'laypage', 'layer'], function () {
        $ = layui.jquery;//jquery
        laydate = layui.laydate;//日期插件
        lement = layui.element();//面包导航
        laypage = layui.laypage;//分页
        layer = layui.layer;//弹出层
        okLoading.close($)
        //以上模块根据需要引入

    });

    /**
     * 退出登陆
     * 2019年8月17日19:43:15
     */
    function logout() {

        $.ajax({
            type: "post",
            url: "xxxxx",
            data: {e: 1},
            dataType: "json",
            success: function (data) {
                if (data.status == 1) {
                    layer.msg(data.info, {icon: 1, time: 1000});
                    setTimeout("window.location.href='xxxx'", 2000);
                    return false;
                    return false;
                } else {
                    layer.msg(data.info, {icon: 5, time: 2000});
                    return false;
                }
            }
        })
        return false;
    }

    function one_set(title, url, w, h) {
        x_admin_show(title, url, w, h);
    }
</script>
<script>
    //顶部时间
    function getTime() {
        var myDate = new Date();
        var myYear = myDate.getFullYear(); //获取完整的年份(4位,1970-????)
        var myMonth = myDate.getMonth() + 1; //获取当前月份(0-11,0代表1月)
        var myToday = myDate.getDate(); //获取当前日(1-31)
        var myDay = myDate.getDay(); //获取当前星期X(0-6,0代表星期天)
        var myHour = myDate.getHours(); //获取当前小时数(0-23)
        var myMinute = myDate.getMinutes(); //获取当前分钟数(0-59)
        var mySecond = myDate.getSeconds(); //获取当前秒数(0-59)
        var week = ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'];
        var nowTime;

        nowTime = myYear + '-' + fillZero(myMonth) + '-' + fillZero(myToday) + '&nbsp;&nbsp;' + week[myDay] + '&nbsp;&nbsp;' + fillZero(myHour) + ':' + fillZero(myMinute) + ':' + fillZero(mySecond);
        //console.log(nowTime);
        $('#time').html(nowTime);
    };

    function fillZero(str) {
        var realNum;
        if (str < 10) {
            realNum = '0' + str;
        } else {
            realNum = str;
        }
        return realNum;
    }

    setInterval(getTime, 1000);
</script>
<script>
    window.onload = function () {
        var click = document.getElementById('new-nav');
        var news = document.getElementById('news');
        click.addEventListener('mousemove', function () {
            news.style.display = 'block';
        });
        click.addEventListener('mouseout', function () {
            news.style.display = 'none';
        });

        var gonggao = document.getElementById('gonggao');
        var gonggaos = document.getElementById('gonggaos');
        gonggao.addEventListener('mousemove', function () {
            gonggaos.style.display = 'block';
        });
        gonggao.addEventListener('mouseout', function () {
            gonggaos.style.display = 'none';
        });
    }
</script>
</body>
</html>
