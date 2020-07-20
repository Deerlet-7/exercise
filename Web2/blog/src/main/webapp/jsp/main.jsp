<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/7/20
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 假如提交到后台的url是http://localhost:8080/blog/login-->
<!-- 实际访问到的是http://8080/blog/jsp/login,是以当前页面作为相对路径，加上请求路径-->
<!--login前面加上 / 即可-->
<form action="/login">
    <input type="text" name="username" placeholder="请输入用户名">
    <input type="password" name="password" placeholder="请输入密码">
    <input type="submit" value="提交">
</form>
</body>
</html>
