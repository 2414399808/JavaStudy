<%--
  Created by IntelliJ IDEA.
  User: 2414399808
  Date: 2022/2/3
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${sss}
<table border="1" cellspacing="0" width="800">
<c:forEach items="${brands}" var="brand">
    <tr align="center">
        <td>${brand.id}</td>
        <td>${brand.brandName}</td>
        <td>${brand.companyName}</td>
        <td>${brand.ordered}</td>
        <td>${brand.description}</td>
        <td>${brand.status==1?"启用":"禁用"}</td>
        <td><a href="#">修改</a> <a href="#">删除</a></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
