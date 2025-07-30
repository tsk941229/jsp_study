<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 30.
  Time: 오후 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>

<%
    // 1. JNDI 서버 객체 생성
    InitialContext ic = new InitialContext();

    // 2. lookup()
    DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");

    // 3. getConnection()
    Connection conn = ds.getConnection();

    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery("select * from test order by id desc");

    while (rs.next()) {
        out.print("<br>" + rs.getString("id") + ":" + rs.getString(2));
    }

    rs.close();
    stmt.close();
    conn.close();

%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
