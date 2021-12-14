<%@ page import="com.example.jeetry.HobbyListeningMusic" %><%--
  Created by IntelliJ IDEA.
  User: ifari
  Date: 9/11/2021
  Time: 12:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1 style="background-color: wheat" style="font-family: Bahnschrift "> My Hobby Listening Music Page </h1>
</head>
<body style="background-color: mintcream">
<h3 style="background-color: coral"><%@include file="Menu.html"%></h3>

<form name ="HobbyListeningMusicForm" method="post" action="HobbyListeningMusic.jsp">
    <br/>
    <br/>

    Hobby Description: <input type= "text" name= "MyHobbyDesc2"> <br/><br/>
    Music App Used: <input type= "text" name= "MusicAppUsed"> <br/><br/>
    <br/>
    <br/>
    <input type="submit" value="Submit">
    <br/>
</form>

<%! String getMessage()
{
    return "Session created in declaration for hobby listening music";
}
%>
<%
    String mytext = request.getParameter("MyHobbyDesc2");

    if(mytext == null)
    {

    }
    else
    {

        session.setAttribute("MyHobbyDesc2",request.getParameter("MyHobbyDesc2"));
        session.setAttribute("MusicAppUsed",request.getParameter("MusicAppUsed"));

        out.println(getMessage());
    }
%>
<jsp:include page="HobbyListeningMusicServlet" flush="true"/>
</body>
</html>
