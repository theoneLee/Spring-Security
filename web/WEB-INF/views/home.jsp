<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Lee
  Date: 2017/4/2 0002
  Time: 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hello，<security:authentication property="principal.username"/>!
<br>
<form method="post" action="/logout">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
    <input type="submit" value="log out">
</form>
<%--<a href="/j_spring_security_logout">Log Out</a>--%>
<%--
不是使用idea推荐的j_spring_security_logout
在开启csrf时需要用post的方式请求/logout，详见https://www.oschina.net/question/174718_249093--%>
</body>
</html>
