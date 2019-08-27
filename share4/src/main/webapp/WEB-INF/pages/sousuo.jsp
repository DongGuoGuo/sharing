<%--
  Created by IntelliJ IDEA.
  User: HLD
  Date: 2019/5/13
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<link rel="stylesheet" type="text/css" href="../../css/sousuo.css" charset="utf-8"/>
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script type="text/javascript" src="../../js/jquery.cookie.js"></script>
        
    <script>
        //用window.opener.


        window.onload = function () {
            var param = $.cookie("key");
            sousuoform.key.value=param;
            sousuo();
        }

        function sousuo() {
            $.ajax({
                type: 'GET',
                url: "/UserControllerTest/outTest",
                contentType: "application/json;cherset=utf-8",
                dataType: "json",
                success: function (data) {
                    //取出后端传过来的list值
                    var chargeRuleLogs = data.data
                    //对list值进行便利
                    $.each(chargeRuleLogs, function (index, n) {
                        var rowTr = document.createElement('tr')
                        //找到html的tr节点

                        rowTr.className = "tr_node"
                        var child = "<td><font color=\"#0000FF\"  size=\"20\">" + chargeRuleLogs[index].username + "</font></td>"
                            + "<td>" + chargeRuleLogs[index].password + "</td>"
                            + "<td>" + chargeRuleLogs[index].nickname + "</td>"
                            + "<td>" + chargeRuleLogs[index].email + "</td>"
                            + "<td>" + chargeRuleLogs[index].email + "</td>" + "</br></br>"

                        //将要展示的信息写入页面
                        rowTr.innerHTML = child
                        //将信息追加
                        $(".table_node").append(rowTr)
                    });
                }
            })
        }
    </script>
</head>
<div class="kongxi"></div>
<div align="center">
    <form id="sousuoform">
        <input type="text" class="inputsousuo" name="key" checked="checked"/>
        <input type="button" class="sousuobutton" value="点击搜索">
    </form>
</div>

<table align="center">         
    <tbody class="table_node">
    <tr class="tr_node">
        <!--动态载入数据-->
    </tr>
        <!-- more data -->
    </tbody>
</table>
</body>
</html>