<%--
  Created by IntelliJ IDEA.
  User: HLD
  Date: 2019/5/8
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<%--<%--%>
    <%--response.sendRedirect(request.getContextPath()+"/login.jsp");--%>
<%--%>--%>
<a href="/userController/findUserByUsername">findByUsername</a>
<a href="/UserControllerTest/outTest">outTest</a>
<a href="/disIntercept/toRegister">去注册</a>
<a href="/disIntercept/toLogin">去登陆</a>
<a href="/disIntercept/toShouye">去首页</a>
<a href="/userController/tosousuo">去suosou</a>
</body>
</html>
