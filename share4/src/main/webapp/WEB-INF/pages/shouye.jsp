<%--
  Created by IntelliJ IDEA.
  User: HLD
  Date: 2019/5/9
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="../../css/shouye.css" charset="utf-8"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>资源分享</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/jquery.cookie.js"></script>
    <script type="text/javascript"></script>
    <script>
        function tosousuo()  {
            var key=myform.key.value;
            $.cookie("key",key);
            window.location.href="/userController/tosousuo";
        }
    </script>
</head>
<body>

<div align="right">
    欢迎回来，<a href="" class="username">张三</a>
</div>

<div class="zhanwei"></div>
<div align="center">
    <img src="../../images/logo.jpg" class="logo">

</div>
<div class="zhanwei"></div>
<div align="center">
    <form id="myform">
        <input type="text" class="input_sousuo" name="key" checked="checked"/>
        <input type="button" class="button" value="点击搜索" onclick="tosousuo()">
    </form>
</div>
<div>

</div>

</body>
</html>


