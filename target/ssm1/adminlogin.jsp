<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html class="loginHtml">
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="css/layui.css" media="all" />
    <link rel="stylesheet" href="css/adminlogin.css">

</head>

<script type="text/javascript">
    history.pushState(null, null, document.URL);
    window.addEventListener('popstate', function () {
        history.pushState(null, null, document.URL);
    });
</script>

<body class="loginBody">

<form class="layui-form " lay-filter="first" action="${pageContext.request.contextPath}/admin/login" type="post">
    <div class="login-box" id="demo">
        <div class="canvaszz"> </div>
        <canvas id="canvas"></canvas>

        <div id="container">
            <div class="input-content">
                <div class="login_tit">
                    <div>
                        <i class="tit-bg left"></i>
                        后台管理系统
                        <i class="tit-bg right"></i>
                    </div>
                </div>
                <span style="color: red;font-size: 20px">${msg}</span>
                <p class="p user_icon">
                    <input type="text" placeholder="请输入用户名" autocomplete="off"id="adno" name="adno"
                           class="layui-input login_txtbx">
                </p>
                <p class="p pwd_icon">
                    <input type="password" placeholder="请输入密码" autocomplete="off" name="password"
                           id="password" class="layui-input login_txtbx"
                           >
                </p>
                <div class="signup">
                    <button  type="submit" class="gv" lay-filter="login">登&nbsp;&nbsp;录</button>
                    <button class="gv " type="reset">清&nbsp;&nbsp;空</button>

                </div>

            </div>

        </div>

    </div>
</form>

<script type="text/javascript" src="js/layui.js"></script>
<script type="text/javascript" src="js/adminlogin.js"></script>

</body>
</html>