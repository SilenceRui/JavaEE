<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Silence
  Date: 2019/11/4
  Time: 22:01
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el3</title>
</head>
<body>
1111111111111111
<h1>
    111111111111111111
</h1>
<%
    ArrayList<Object> list = new ArrayList<>();
    list.add("aaaaaaaaaaaa");
    list.add("bbbbbbbbbbbbbbb");
    list.add("cccccccccccc");
    list.add("ddddddddddddd");
    request.setAttribute("list",list);
%>
<%=list%>
<hr>
${list}<br>
${list[10]}
</body>
</html>
