<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<%--    <title>JSP - Hello World</title>--%>
    <title>JSP - Login</title>
</head>
<body>
<%--<h1><%= "Hello World!" %></h1>--%>
<h1><%= "Login Page" %></h1>
<br/>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<form action="<%=request.getContextPath()%>/registration" method="post">
    Username: <input type="text" name="username" placeholder="Enter user name"><br>
    <br>
    Password: <input type="password" name="pwd" placeholder="Enter user password"><br>
    <br>
    <input type="submit" value="Register">
</form>

</body>
</html>