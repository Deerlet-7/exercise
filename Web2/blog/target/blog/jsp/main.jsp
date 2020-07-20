<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/7/20
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
    <link href="static/css/app.css" rel="stylesheet">
    <!-- jQuery -->
    <script type="text/javascript" src="static/jquery/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">//绑定页面加载事件，在加载完后执行
        $(document).ready(function(){
            //alert("jsp文件加载完成");
            $.ajax({//提交后台ajax请求
                url:"login",//请求路径
                type:"post",//请求方法
                contentType:"application/json",//请求的数据格式
                data:{username:"abc",password:"123"},//请求数据
                dataType:"json",//响应的数据格式
                success:function (data) {//返回状态码是200时，调用这个函数

                }
            });
            $("#btn").click(function () {//绑定按钮点击事件
                // alert("点击按钮");
                // 也可以写按钮点击请求服务的代码
            })
        });
    </script>
</head>
<body>
<!-- 假如提交到后台的url是http://localhost:8080/blog/login-->
<!-- 实际访问到的是http://8080/blog/jsp/login,是以当前页面作为相对路径，加上请求路径-->
<!--login前面加上 / 即可-->
<!-- 添加jsp变量即base标签，可以解决路径问题，action为login，访问是正确路径-->
<form action="login">
    <input type="text" name="username" placeholder="请输入用户名">
    <input type="password" name="password" placeholder="请输入密码">
    <input type="submit" value="提交">
</form>
<input id="btn" type="button" value="点击观看事件">
</body>
</html>
