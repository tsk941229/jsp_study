<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>조회</title>
</head>
<body>

    <h3>회원정보 검색</h3>

    ${error}

    <form action="memberSearch.do" method="post">
        ID : <input type="text" name="id" />
        <input type="hidden" name="job" value="search" />
        <input type="submit" value="검색" />

    </form>

</body>
</html>
