<%--
  Created by IntelliJ IDEA.
  User: ifari
  Date: 9/11/2021
  Time: 12:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1 style="background-color: wheat" style="font-family: Bahnschrift "> My Hobby Photography Page </h1>
</head>
<body>
<h3 style="background-color: coral"> <%@include file="Menu.html"%></h3>

<form name ="HobbyPhotographyForm" method="post" action="hobbyPhotography.jsp">
    <br>
    <br>
    Hobby Description: <input type= "text" name= "MyHobbyDesc1"> <br/><br/>
    Device Type Used: <input type="text" name= "DeviceType"> <br/><br/>
    Device Name Used: <input type="text" name= "DeviceName"> <br/><br/>
    <br/>
    <input type="submit" value="Submit">
    <br/>
    <br>
</form>
<%! String getMessage()
{
    return " session created in declaration for hobby photography";
}
%>
<%
    String mytext = request.getParameter("MyHobbyDesc1");

    if(mytext == null)
    {

    }
    else
    {
        session.setAttribute("MyHobbyDesc1",request.getParameter("MyHobbyDesc1"));
        session.setAttribute("DeviceType",request.getParameter("DeviceType"));
        session.setAttribute("DeviceName",request.getParameter("DeviceName"));

        out.println(getMessage());
    }
%>
<jsp:include page="HobbyPhotographyServlet" flush="true"/>
</body>
</html>
