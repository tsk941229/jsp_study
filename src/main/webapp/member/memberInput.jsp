<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>회원가입</h3>

    <form action="memberProc.jsp" method="post">

        ID : <input type="text" name="id" /><br/>
        비밀번호 : <input type="password" name="password" /><br/>
        이름 : <input type="text" name="name" /><br/>
        E-mail : <input type="text" name="mail" />

        <input type="submit" value="가입" />

    </form>

</body>
</html>
