<%--
  Created by IntelliJ IDEA.
  User: Silence
  Date: 2019/11/3
  Time: 20:54
--%>
<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" language="java" %>
<html>
<head>
    <title>500</title>
    <%
        String message = exception.getMessage();
        out.print(message);
    %>
</head>
<body>
<h1>
    服务器正忙...
</h1>
</body>
</html>
