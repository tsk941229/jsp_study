<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 31.
  Time: 오후 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>example</title>
</head>
<body>
    <jsp:useBean id="book" class="com.edu.beans.BookBean" />

    <jsp:setProperty name="book" property="*" />

    <%
//        request.setAttribute("book", book);
//        session.setAttribute("book", book);
        application.setAttribute("book", book);
    %>

    <jsp:forward page="bookOutput.jsp" />

</body>
</html>
