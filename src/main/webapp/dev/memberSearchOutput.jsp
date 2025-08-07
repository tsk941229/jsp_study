<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>검색 결과</title>
</head>
<body>

    <h3>검색 결과</h3>
    
    <%
        String result = (String) request.getAttribute("result");
        if(result != null) {
            out.print(result + "<p>");
        } else {
        
    %>
        <h3>
            ${member.id} / ${member.password} / ${member.name} / ${member.mail}
        </h3>
    <%}%>

    <%@ include file="result/home.jsp" %>

</body>
</html>
