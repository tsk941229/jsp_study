<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 28.
  Time: 오후 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input</title>
</head>
<body>

<% if(session.isNew() || session.getAttribute("id") == null) {%>
    <%
        String msg = (String) request.getAttribute("error");
        if(msg == null) msg = "";

    %>
    <%= msg %>

        <form action="example10.jsp" method="post">
            ID: <input type="text" name="id" /> <br/>
            비밀번호: <input type="password" name="pwd" /><br/>
            <input type="submit" value="로그인" />
        </form>
<%} else {%>
    <a href="example10.jsp">로그아웃</a>
<% } %>
</body>
</html>
