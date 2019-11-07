<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>foreach</title>
</head>
<body>
  <c:forEach begin="1" end="10" var="i" step="2" varStatus="s">
      ${i}<b>${s.index}</b> <i>${s.count}</i><br>
  </c:forEach>

<hr/>
<%
    ArrayList<Object> list = new ArrayList<>();
    list.add("aaaa");
    list.add("bbb");
    list.add("ccc");
    list.add("ddd");
    request.setAttribute("list",list);
%>
<c:forEach items="${list}" var="str" varStatus="s">
    ${s.index}&nbsp;&nbsp;<b>${s.count}</b>&nbsp;&nbsp;<i>${str}</i><br/>
</c:forEach>

</body>
</html>
