<%--
  Created by IntelliJ IDEA.
  User: ifari
  Date: 9/11/2021
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1 style="background-color: wheat" style="font-family: Bahnschrift "> Myself Page</h1>
</head>
<body style="background-color:mintcream;">
<h3 style="background-color: coral"><%@include file="Menu.html"%></h3>

<form name ="MyselfForm" method="post" action="Myself.jsp">
    <br/>
    <br/>
    Name: <input type= "text" name= "MyName"> <br/><br/>
    Age: <input type= "text" name= "MyAge"> <br/><br/>
    Hobbies: <input type="text" name= "MyHobby"> <br/><br/>
    <br/>
    <input type="submit" value="Submit">
    <br/>
</form>

<%--jsp section--%>

<%! String getMessage()
    {
        return "Session created in declaration";
    }
%>

<%--scriplets section--%>

<%
    String mytext = request.getParameter("MyName");

    if(mytext == null)
    {

    }
    else
    {
        session.setAttribute("MyName",request.getParameter("MyName"));
        session.setAttribute("MyAge",request.getParameter("MyAge"));
        session.setAttribute("MyHobby",request.getParameter("MyHobby"));

        out.println(getMessage());
    }
%>
<jsp:include page="MyselfServlet"/>
</body>
</html>
