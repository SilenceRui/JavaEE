<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>if标签</title>
</head>
<body>
    <c:if test="true">
        <h1>I'm　true;</h1>
    </c:if>
    <c:if test="false">
        <h1>I'm　false;</h1>
    </c:if>

</body>
</html>
