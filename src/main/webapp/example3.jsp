<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 27.
  Time: 오후 5:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>예외상황 처리</title>
</head>
<body>
    <h4>다음과 같은 에러가 발생하였습니다.</h4>
    에러타입 :
    <%= exception.getClass().getName()%>
    <br> 에러메시지 :
    <%= exception.getMessage()%>
</body>
</html>
