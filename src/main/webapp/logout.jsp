<%--
  Created by IntelliJ IDEA.
  User: syekhaja1
  Date: 27-02-2024
  Time: 10:49 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logged Out</title>

</head>
<body>
<h1><%= "Logged Out Successfully" %></h1>
<br/>
<form action="<%=request.getContextPath()%>/index.jsp" method="post">
    <input type="submit" value="Login Again">
</form>
</body>
</html>
