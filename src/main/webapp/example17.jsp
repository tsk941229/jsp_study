<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 29.
  Time: 오후 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

    <jsp:useBean id="hello" class="com.edu.beans.HelloBean" />

    <jsp:getProperty name="hello" property="name"/><br/>
    <jsp:getProperty name="hello" property="number"/><br/>

<%--    <jsp:setProperty name="hello" property="name" value="Amy" />--%>
<%--    <jsp:setProperty name="hello" property="number" value="12345" />--%>

    <%-- setProperty의 property에 "*" 명시하면 파라미터로 받은값 전부 바인딩함
         반드시 필드명과 똑같은 키값으로 파라미터 넣어야함 (request.getParameter("name")... )
         ex) 도메인/example17.jsp?name=Toby&number=9999
    --%>
    <jsp:setProperty name="hello" property="*" />

    <hr/>

    <jsp:getProperty name="hello" property="name"/><br/>
    <jsp:getProperty name="hello" property="number"/><br/>

</body>
</html>
