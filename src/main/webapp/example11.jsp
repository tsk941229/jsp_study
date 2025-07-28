<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 28.
  Time: 오후 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    int total = out.getBufferSize();
    out.print("첫번째 텍스트입니다.");
    out.clearBuffer();
    out.print("출력 버퍼의 크기 : " + total);
    out.print("<br>사용되지 않은 버퍼의 크기 : " + out.getRemaining());
    out.flush();
    out.print("<br>flush 후 버퍼의 크기 : " + out.getRemaining());
%>
<hr>
<h3>out.print() 메소드</h3>

<%
    out.print(100);
    out.print(true);
    out.print(3.14);
    out.print("TEST");
    out.print('가');
    out.print(new java.io.File("\\"));
    out.print("버퍼의 크기 : " + out.getRemaining());
%>

</body>
</html>
