<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>编号</td>
        <td>商品名称</td>
        <td>商品描述</td>
        <td>商品价格</td>
    </tr>
   <c:forEach items="${list}" var="obj">
       <tr>
           <td>${obj.id}</td>
           <td>${obj.gname}</td>
           <td>${obj.gcontent}</td>
           <td>${obj.gprice}</td>
       </tr>
   </c:forEach>


</table>
</body>
</html>
