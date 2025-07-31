<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 31.
  Time: 오후 10:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EL</title>
</head>
<body>
    <%
        Enumeration<String> list = request.getHeaderNames();

        while(list.hasMoreElements()) {

            String key = list.nextElement();
            out.print("<br>" + key + " : " + request.getHeader(key));

        }

    %>

    <hr>

    ${header}

</body>
</html>
