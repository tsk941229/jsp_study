<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 29.
  Time: 오후 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

    <%
        String p = request.getParameter("p");
    %>

    <jsp:forward page="<%= p %>" />

</body>
</html>
