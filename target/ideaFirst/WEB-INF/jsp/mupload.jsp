<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../../common/ctx.jsp"%>
<html>
<head>
    <title>上传</title>
</head>
<body>
<form action="${ctx}/file/upload"
      method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="file" width="120px"> <input
        type="submit" value="上传">
</form>
<hr>
<form action="${ctx }/file/down"
      method="get">
    <input type="submit" value="下载">
</form>
</body>
</html>
