<%-- 
    Document   : Login
    Created on : Oct 2, 2017, 8:39:12 AM
    Author     : 642202
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <form action="login" method="POST">
            Username: <input type="text" name="username" value="${cookie.username.value}"><br>
            Password: <input type="password" name="password"><br>
            Remember Me <input type ="checkbox" name="remember" <c:if test="${cookie.username != null}">
                             checked</c:if>><br>
            <input type="submit" value="Login"><br>
        </form>
        <c:if test="${message != null}">
            <p>${message}</p>
        </c:if>
    </body>
</html>
