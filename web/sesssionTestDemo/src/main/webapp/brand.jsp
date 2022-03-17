<%--
  Created by IntelliJ IDEA.
  User: 2414399808
  Date: 2022/2/4
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${loginuser.username}欢迎你</h1>
<input type="button" value="新增" id="add"><br>
<hr>
<script>
    var elementById = document.getElementById("add");
    elementById.onclick=function (){
        location.href="/brandExampleDemo/addBrand.html";
    }
</script>
<table border="1" cellspacing="0" width="1200">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>

    </tr>
    <c:forEach items="${brands}" var="brand" varStatus="status">
        <tr align="center">
            <td>${status.count}</td>
            <td>${brand.brandName}</td>
            <td>${brand.companyName}</td>
            <td>${brand.ordered}</td>
            <td>${brand.description}</td>
            <td>${brand.status==1?"启用":"禁用"}</td>
            <td><a href="/sesssionTestDemo/SelectByIdServlet?id=${brand.id}">修改</a> <a href="#">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
