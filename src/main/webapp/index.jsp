<!-- 加这行解决中文乱码问题 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>主页</title>
    <meta name="viewport" content="width=device-width,initial-scale=1">
</head>
<body>
<h2>Hello World!</h2>
<form action="/login/">
    <input type="text" id="email" name="email" required
       minlength="4" maxlength="50" size="24" placeholder="请输入邮箱">
    <br/>
    <input type="password" id="pwd" name="pwd" required
    minlength="6" maxlength="24" size="24" placeholder="请输入密码前注意周边环境安全">
    <br/>
    <input type="submit" id="submitBtn" name="submitBtn" title="登录">
</form>
</body>
</html>
