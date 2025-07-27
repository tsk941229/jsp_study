<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 27.
  Time: 오후 5:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String user = request.getParameter("name");
        if(user == null)
            user = "Guest";
    %>
    <h1>
        Hello
        <%=user%>!
    </h1>
</body>
</html>
