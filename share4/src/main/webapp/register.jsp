<%--
  Created by IntelliJ IDEA.
  User: HLD
  Date: 2019/5/4
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<link rel="stylesheet" type="text/css" href="../../css/register.css" charset="utf-8"/>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册的页面</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="ajax方式">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript">
        //onblur失去焦点的值
        function checkIt(){
            //获取文本框的值
            var username=document.getElementById("username").value;
            $.ajax({
                //几个参数需要注意一下
                type: "GET",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "/checkUserisExist/checkUsername?username="+username,//url
                // data: $('#form').serialize(),
                success: function (result) {
                    if(result.result){
                        alert(result.msg);
                    }else {
                    }
                },
                error : function() {
                    alert("异常！");
                }
            });
        }
        function checkIt2(){
            //获取文本框的值
            var email=document.getElementById("email").value;
            $.ajax({
                //几个参数需要注意一下
                type: "GET",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "/checkUserisExist/checkEmail?email="+email,//url
                // data: $('#form').serialize(),
                success: function (result) {
                    if(result.result){
                        alert(result.msg);
                    }else {
                    }
                },
                error : function() {
                    alert("异常！");
                }
            });
        }

        function register() {
            $.ajax({
                //几个参数需要注意一下
                type: "POST",//方法类型
                dataType: "json",//预期服务器返回的数据类型
                url: "/disIntercept/register" ,//url
                data: $('#from_register').serialize(),
                success: function (result) {
                    if(result.result){
                        window.location.href="/disIntercept/toLogin";
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

<div align="center">
    <img src="../../images/logo.jpg" class="logo">
</div>
<div align="center">
    <label class="font">欢&emsp;迎&emsp;您&emsp;的&emsp;加&emsp;入</label>
</div>

<div align="center">
    <form id="from_register" action="" method="post">
        <div class="input_div">
            <label>&emsp;用户名: </label>
            <input type="text" class="input_text" name="username"  id="username" onblur="checkIt()"/>
        </div>
        <div class="input_div">
            <label>密&emsp;&emsp;码: </label>
            <input type="text" class="input_text" name="password"/>
        </div>
        <div class="input_div">
            <label>确认密码: </label>
            <input type="text" class="input_text" name="password1"/>
        </div>
        <div class="input_div">
            <label>昵&emsp;&emsp;称: </label>
            <input type="text" class="input_text" name="nickname"/>
        </div>
        <div class="input_div">
            <label>邮&emsp;&emsp;箱: </label>
            <input type="text" class="input_text" name="email"  id="email" onblur="checkIt2()"/>
        </div>

        <div class="input_div">
            <input type="button" value="注册" class="button" onclick="register()">&emsp;&emsp;
            <input type="reset" value="重置" class="button">
        </div>
    </form>

</div>
</body>
</html>