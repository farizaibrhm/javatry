<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body style="background-color: linen">
<h3 style="background-color: coral;"><%@include file="Menu.html" %></h3>
<h1><%= "<center> Hello! <br> My name is " + session.getAttribute("MyName") %> </h1>
<br/>
<h3 style="background-color: mintcream">
    <p><a href="MyselfServlet">Myself Servlet</a></p>
    <p><a href="HobbyListeningMusicServlet">Hobby Listening Music Servlet</a></p>
    <p><a href="HobbyPhotographyServlet">Hobby Photography Servlet</a></p>
</h3>
</body>
</html>