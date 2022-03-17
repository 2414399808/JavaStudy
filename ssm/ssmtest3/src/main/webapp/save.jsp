<%--
  Created by IntelliJ IDEA.
  User: 2414399808
  Date: 2022/2/15
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="accountFrom" action="${pageContext.request.contextPath}/account/save" method="post">

    账户名称<input type="text" name="name"><br>
    账户金额<input type="text" name="money"><br>
    保存<input type="submit" ><br>

</form>
</body>
</html>
