<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25. 7. 28.
  Time: 오후 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>application</title>
</head>
<body>

    서버명 : <%= application.getServerInfo()%>
    서블릿 버전 : <%= application.getMajorVersion() %>.<%= application.getMinorVersion() %><br>
    <h3>/edu 리스트</h3>
    <%
        java.util.Set<String> list = application.getResourcePaths("/");
        if(list != null) {
            Object[] obj = list.toArray();
            for(int i = 0; i < obj.length; i++) {
                out.print(obj[i] + "<br>");
            }
        }
    %>

</body>
</html>
