package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HobbyPhotographyServlet", value = "/HobbyPhotographyServlet")
public class HobbyPhotographyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myname = (String) session.getAttribute("MyName");
        String myage = (String) session.getAttribute("MyAge");
        String myhobby = (String) session.getAttribute("MyHobby");
        String myHobbyDesc1 = (String) session.getAttribute("MyHobbyDesc1");
        String deviceType = (String) session.getAttribute("DeviceType");
        String deviceName = (String) session.getAttribute("DeviceName");

//        HobbyPhotography hp = new HobbyPhotography(" Fariza","21"," Listen to indie music and photography",
//           " Photography"," Smartphone"," Iphone");
        HobbyPhotography hp = new HobbyPhotography (myname,myage,myhobby,myHobbyDesc1,deviceType, deviceName);


        out.println("<html><body>");
        out.println("<h1>" + "Name:"  +hp.getMyName()+ "</h1>");
        out.println("<h1>" + "Age:"   +hp.getMyAge()+ "</h1>");
        out.println("<h1>" + "Hobby:" +hp.getMyHobby()+ "</h1>");
        out.println("<h1>" + "Hobby Description:"   +hp.getMyHobbyDesc1()+ "</h1>");
        out.println("<h1>" + "Device Type Used:" +hp.getDeviceType()+ "</h1>");
        out.println("<h1>" + "Device Name Used:" +hp.getDeviceName()+ "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
