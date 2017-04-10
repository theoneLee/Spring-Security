<%--
  Created by IntelliJ IDEA.
  User: Lee
  Date: 2017/4/2 0002
  Time: 2:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sf:form commandName="entity" method="post">
    username:<sf:input path="username"/><br>
    password:<sf:password path="password"/><br>
    <input id="remember_me" name="remember-me" type="checkbox"/>
    <label for="remember_me" class="inline">Remember me</label>
    <br>
    <input type="submit" value="login"/>
</sf:form>

</body>
</html>
