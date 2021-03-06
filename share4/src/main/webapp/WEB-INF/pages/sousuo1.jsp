<%--
  Created by IntelliJ IDEA.
  User: HLD
  Date: 2019/5/13
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>TAB样式</title>
</head>
<style type="text/css">
    #head{width:400px;
        height:30px;}
    #head ul{padding:0; margin:0;}
    #head ul li{ list-style:none; float:left; text-decoration:none; display:block;
        width:80px;padding:5px; margin:0px 10px 0px 0px; position:relative;}
    #head ul li a{ text-decoration:none; color:#000000;}
    #head ul li a:visited{ text-decoration:none; color:#000000;}

    #L1{
        background-color:#9CC;
        border-top-color: #F6C;
        border-right-color: #F6C;
        border-left-color: #F6C;
    }
    #L2{
        background-color:#CC9;
        border-color:#309;
        margin-left:1px;
    }

    #L3{
        background-color:#FF3;
        border-color:#360;
    }
    #L4{
        background-color:#690;
        border-color:#360;
    }

    #d1{
        background-color:#9CC;
        border:1px solid #C39;
        width:400px;
        height:220px;
        margin-top:0px;
        position:absolute;
        z-index:1;

    }
    #d2{
        background-color:#CC9;
        border:1px solid #309;
        display:none;
        width:400px;
        height:220px;
        margin-top:0px;
        position:absolute;
        z-index:1;
    }
    #d3{
        background-color:#FF3;
        border:1px solid #360;
        display:none;
        width:400px;
        height:220px;
        margin-top:0px;
        position:absolute;
        z-index:1;
    }

    #d4{
        background-color:#690;
        border:1px solid #360;
        display:none;
        width:400px;
        position:absolute;
        height:220px;
        margin-top:0px;
        z-index:1;
    }
</style>
<script language="javascript">
    function Tab(num)
    {
        var i;
        for(i=1;i<=4;i++)
        {
            if(i==num)
                document.getElementById("d"+i).style.display="block";
            else
                document.getElementById("d"+i).style.display="none";
        }
    }
</script>
<body>
<div id="head">
    <ul>
        <li id="L1" onclick="Tab(1)"><a href="#">公告信息</a></li>
        <li id="L2" onclick="Tab(2)"><a href="#">今日热点</a></li>
        <li id="L3" onclick="Tab(3)"><a href="#">最新新闻</a></li>
        <li id="L4" onclick="Tab(4)"><a href="#">考试信息</a></li>
    </ul>
</div>

<div id="d1">
    <ul>
        <li>这里是最新公告信息</li>
        <li>这里是最新公告信息</li>
        <li>这里是最新公告信息</li>
        <li>这里是最新公告信息</li>
    </ul>
</div>
<div id="d2">
    <ul>
        <li>这里是今日热点</li>
        <li>这里是今日热点</li>
        <li>这里是今日热点</li>
        <li>这里是今日热点</li>
    </ul>
</div>
<div id="d3">
    <ul>
        <li>这里是最新新闻</li>
        <li>这里是最新新闻</li>
        <li>这里是最新新闻</li>
        <li>这里是最新新闻</li>
    </ul>
</div>
<div id="d4">
    <ul>
        <li>这里是考试信息</li>
        <li>这里是考试信息</li>
        <li>这里是考试信息</li>
        <li>这里是考试信息</li>
    </ul>
</div>
</body>
</html>
