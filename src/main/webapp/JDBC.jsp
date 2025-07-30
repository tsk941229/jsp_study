<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 30.
  Time: 오후 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // 1. JDBC Driver 로딩하기
    Class.forName("oracle.jdbc.driver.OracleDriver");

    // 2. DB 서버 접속하기
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    Connection conn = DriverManager.getConnection(url, "taeseok", "1234");

    // 3. Statement or PreparedStatement 객체 생성하기
    Statement stmt = conn.createStatement();

    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");

    PreparedStatement pstmt = conn.prepareStatement("insert into test values(?, ?)");

    pstmt.setString(1, id);
    pstmt.setString(2, pwd);
    pstmt.executeUpdate();

    // 4. SQL 실행
//    stmt.executeUpdate("create table test(id varchar2(5), pwd varchar2(5))");
//    stmt.executeUpdate("insert into test values('aa', '11')");
//    stmt.executeUpdate("insert into test values('bb', '22')");
//    stmt.executeUpdate("insert into test values('cc', '33')");

    ResultSet rs = stmt.executeQuery("select * from test");

    while (rs.next()) {
        out.print("<br>" + rs.getString("id") + ":" + rs.getString(2));
    }

    // 5. 자원해제
    stmt.close();
    conn.close();

%>
</body>
</html>
