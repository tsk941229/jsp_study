<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>

<%
    InitialContext ic = new InitialContext();
    DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
    Connection conn = ds.getConnection();

//    Class.forName("oracle.jdbc.driver.OracleDriver");
//    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "taeseok", "1234");
    Statement stmt = conn.createStatement();
    String sql = "create table member(id varchar2(10) primary key, password varchar2(10), name varchar2(10), mail varchar2(20))";
    stmt.executeUpdate(sql);
    out.print("member 테이블이 생성되었습니다.");
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
