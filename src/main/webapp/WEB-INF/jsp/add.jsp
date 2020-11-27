<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/11/17
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@include file="../../common/ctx.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增</title>
</head>
<body>
<form action="${ctx}/hello/add">
    书本名<input name="bookName"><br>
    价格<input name="bookPrice"><br>
    简介<input name="bookBrief"><br>
    <input type="submit">
</form>

</body>
</html>
