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
    <title>Book Input</title>
</head>
<body>
    <form action="/example22.jsp" method="post">
        책제목 : <input type="text" name="title"><br>
        책저자 : <input type="text" name="author"><br>
        출판사 : <input type="text" name="publisher"><br>
        <input type="submit" value="등록" />

    </form>
</body>
</html>
