package com.example.jeetry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HobbyListeningMusicServlet", value = "/HobbyListeningMusicServlet")
public class HobbyListeningMusicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        String myname = (String) session.getAttribute("MyName");
        String myage = (String) session.getAttribute("MyAge");
        String myhobby = (String) session.getAttribute("MyHobby");
        String myHobbyDesc2 = (String) session.getAttribute("MyHobbyDesc2");
        String musicAppUsed = (String) session.getAttribute("MusicAppUsed");



//        HobbyListeningMusic hlm = new HobbyListeningMusic(" Fariza", "21"," Listen to indie music and photography",
//                " Listening To Indonesian and Malaysian Indie music"," Spotify");

        HobbyListeningMusic hlm = new HobbyListeningMusic(myname, myage,myhobby,myHobbyDesc2,musicAppUsed);

        out.println("<html><body>");
        out.println("<h1>" + "Name:"  +hlm.getMyName()+ "</h1>");
        out.println("<h1>" + "Age:"   +hlm.getMyAge()+ "</h1>");
        out.println("<h1>" + "Hobby:" +hlm.getMyHobby()+ "</h1>");
        out.println("<h1>" + "Hobby Description:"   +hlm.getMyHobbyDesc2()+ "</h1>");
        out.println("<h1>" + "Music Streaming Platform:" +hlm.getMusicAppUsed()+ "</h1>");
        out.println("<h1>" + "Hobby Description:"   +hlm.getMyHobbyDesc2()+ "</h1>");
        out.println("<h1>" + "Music Streaming Platform:" +hlm.getMusicAppUsed()+ "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
