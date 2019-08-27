<%--
  Created by IntelliJ IDEA.
  User: HLD
  Date: 2019/5/3
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>


<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<link rel="stylesheet" type="text/css" href="../../css/login.css" charset="utf-8"/>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="ajax方式">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript">

        function login() {
            $.ajax({
                //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "/disIntercept/userLogin" ,//url
                data: $('#form').serialize(),
                success: function (result) {
                    if(result.result){
                        window.location.href="/userController/toShouye";
                    }else {
                        alert(result.msg);
                    }
                },
                error : function() {
                    alert("异常！");
                }
            });
        }
    </script>
</head>


<body class="body">
<div class="div">
    <%--<label class="zuo_label">欢迎来到资源分享吧</label>--%>
</div>
<div class="input_div" align="right">
    <div class="div_kong"></div>
    <div class="div_kong"></div>
    <div class="div_kong"></div>
    <div align="left">
        <label class="zuo_label">账号密码登陆</label>
    </div>
    <div class="div_kong"></div>
    <div class="div_kong"></div>
    <div class="div_kong"></div>

    <form name="form" id="form" onsubmit="return false" action="##" method="post">
        <div align="center">
            <input name="username" type="text" class="input_text" placeholder="用户名/邮箱">
        </div>
        <div class="div_kong"></div>
        <div align="center">
            <input name="password" type="password" class="input_text" placeholder="登录密码">
        </div>
        <div class="div_kong"></div>
        <div align="center">
            <input onclick="login()" class="button1" type="button" value="登录">&emsp;&emsp;
            <input class="button1" type="reset" value="重置">
        </div>
    </form>

    <div class="div_kong"></div>
    <div align="left" class="div_kong">
        我没有账户，<a href="/disIntercept/toRegister">请点这里注册</a>
    </div>

</div>

</body>
</html>