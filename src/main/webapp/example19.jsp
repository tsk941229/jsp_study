<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 31.
  Time: 오후 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL</title>
</head>
<body>
    ${param.id} / ${param.pwd} <br>
    ${param["id"]} / ${param["pwd"]}
</body>
</html>
