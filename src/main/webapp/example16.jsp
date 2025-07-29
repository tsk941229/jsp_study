<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 29.
  Time: 오후 9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>-- include 전 --</h3>
    <jsp:include page="test.jsp" />
    <%@ include file="test.jsp" %>
    <h3>-- include 후 --</h3>
</body>
</html>
