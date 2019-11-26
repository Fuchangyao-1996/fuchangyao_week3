<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/Solr/High.do" method="get">
    <input type="text" name="title">
    <input type="submit" value="查询">
</form>

<table border="1">
    <tr>
        <td>编号</td>
        <td>商品名称</td>
        <td>商品描述</td>
        <td>商品价格</td>
    </tr>
<c:forEach items="${list}" var="obj">
    <tr >
        <td>${obj.id}</td>
        <td>${obj.gname}</td>
        <td>${obj.gcontent}</td>
        <td>${obj.gprice}</td>
    </tr>
</c:forEach>

</table>

<a href="../Solr/findPage.do?currentPage=1">首页</a>
<a href="../Solr/findPage.do?currentPage=${currentPage>1? currentPage-1:1}">上页</a>
<a href="../Solr/findPage.do?currentPage=${currentPage<TotalPages? currentPage+1:TotalPages}">下页</a>
<a href="../Solr/findPage.do?currentPage=${TotalPages}">尾页</a>
总共${totalElements}条记录
</body>
</html>
