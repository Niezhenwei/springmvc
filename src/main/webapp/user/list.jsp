<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/11/16
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>

</head>
<body>

<c:forEach items="${user}" var="user">
    ${user}
</c:forEach>

</body>
</html>
