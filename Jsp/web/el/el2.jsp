<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Silence
  Date: 2019/11/4
  Time: 20:46
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el2</title>
</head>
<body>
<%
    request.setAttribute("name","张三");
    session.setAttribute("age","23");
    Date date = new Date();
    session.setAttribute("birthday",date.toLocaleString());
%>
<h3>
    获取值
</h3>
${requestScope.name}<br>
${sessionScope.age}<br>
${name}<br>
${age}<br>
${birthday}
<%--${requestScope.get(name)}--%>
<%--${sessionScope.get(age)}--%>
<%--${requestScope.get(age)}--%>
<%--${sessionScope.get(haha)}--%>
</body>
</html>
