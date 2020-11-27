<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common/ctx.jsp"%>
<html>
<head>
    <title>上传</title>
</head>
<body>
<form action="${ctx}/hello/doupload" method="post" enctype="multipart/form-data">
    <input type="file" name="mf"/><input type="submit"/>
</form>
<form action="${ctx}/hello/down"
      method="get">
    <input type="submit" value="下载">
</form>
</body>
</html>
