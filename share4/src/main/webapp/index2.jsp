<%--
  Created by IntelliJ IDEA.
  User: HLD
  Date: 2019/5/8
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="../../css/index.css" charset="utf-8"/>
<link rel="stylesheet" type="text/css" href="../../css/base.css" charset="utf-8"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>何玲东的网页</title>
</head>
<body>
<div id="login-container" class="w">

    <!--登录注册部分开始-->
    <div class="login">
        <p class="pass-from-logo">帐号密码登录</p>
        <input type="text" name="name" value="用户名/邮箱" id="username">
        <input type="text" name="mima" value="登录密码" id="userpw">
        <div class="btn-div">
            <button class="btn-login fl">登录</button>
            <button class="btn-reset fr">重置</button>
        </div>
        <p class="tishi">我没有帐号，<a href="#" class="zhuce">请点击这里注册</a></p>
    </div>
    <!--登录注册部分结束-->

</div>
</body>
</html>
