<%@ page import="com.edu.biz.MemberService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    request.setCharacterEncoding("UTF-8");
%>

<jsp:useBean id="member" class="com.edu.beans.Member" />
<jsp:setProperty name="member" property="*" />

<%
    MemberService service = new MemberService();
    service.insertMember(member);

    RequestDispatcher rd = request.getRequestDispatcher("memberOutput.jsp");
    rd.forward(request, response);
%>

<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
