<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/11/17
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../common/ctx.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>李畅</h1>
<table>
    <form action="${ctx}/hello/test" method="post">
        <input name="bookName">
        <input type="submit" value="搜索">
    </form>
    <a href="${ctx}/hello/doadd">新增</a>
    <tr>
        <td>书本编号</td>
        <td>书本名称</td>
        <td>书本价格</td>
        <td>书本简介</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="b">
        <tr>
        <td>${b.getBookId()}</td>
        <td>${b.getBookName()}</td>
        <td>${b.getBookPrice()}</td>
        <td>${b.getBookBrief()}</td>
         <td><a href="javascript:mya(${b.getBookId()})">删除</a>  <a href="${ctx}/hello/doUpdate?bookId=${b.getBookId()}">修改</a></td>
        </tr>
    </c:forEach>

</table>
<script>
    function mya(id) {
        var n=confirm("是否确认删除");
        console.log(n)
        if (n){
            location.href="/ideaFirst/hello/del?bookId="+id;
        }
    }
</script>
</body>
</html>
