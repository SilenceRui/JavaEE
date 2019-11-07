<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if</title>
</head>
<body>
<%
    ArrayList<Object> list = new ArrayList<>();
    list.add("AAAAAAAA");
//    list.add("bbbbbbbb");
    request.setAttribute("list",list);
    request.setAttribute("number","9");
%>
<c:if test="${not empty list}">
    list集合不为空，遍历集合……
</c:if>
<c:if test="${empty list}">
    list集合为空……
</c:if>
<hr>
<c:if test="${number%2==0}">
    number为偶数
</c:if>
<c:if test="${number%2!=0}">
    number为奇数
</c:if>

</body>
</html>
