<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/11/17
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common/ctx.jsp"%>
<html>
<head>
    <title>修改</title>
</head>
<body>
<form action="${ctx}/hello/update" method="post">
书本名<input name="bookName">
价格<input name="bookPrice">
简介<input name="bookBrief">
    <input type="submit">
</form>
</body>
</html>
