package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyselfServlet", value = "/MyselfServlet")
public class MyselfServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myname = (String) session.getAttribute("MyName");
        String myage = (String) session.getAttribute("MyAge");
        String myhobby = (String) session.getAttribute("MyHobby");

//        MySelf myself = new MySelf(" Fariza", 21," Listen to indie music and photography");
        MySelf myself = new MySelf( myname, myage, myhobby);

        out.println("<html><body>");
        out.println("<h1>" + "Name:"  +myself.getMyName()+ "</h1>");
        out.println("<h1>" + "Age:"   +myself.getMyAge()+ "</h1>");
        out.println("<h1>" + "Hobby:" +myself.getMyHobby()+ "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
