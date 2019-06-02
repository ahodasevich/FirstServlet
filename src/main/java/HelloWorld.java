package main.java;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hi")
public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        pw.println("<form method=\"post\">");
        pw.println("<label>Name:<input type=\"text\" name=\"name\"><br /></label>");
        pw.println("<label>Surname:<input type=\"surname\" name=\"surname\"><br /></label>");
        pw.println("<button type=\"submit\">Submit</button>");
        pw.println("</form>");

     //   req.getRequestDispatcher("mypage.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        pw.println("Your name: "+ req.getParameter("name"));
        pw.println("Your surname: "+ req.getParameter("surname"));
        pw.println("getRequestURI: " + req.getRequestURI());
        pw.println("getAuthType: " + req.getAuthType());
        pw.println("getCharacterEncoding: " + req.getCharacterEncoding());
        pw.println("getContentType: " + req.getContentType());
        pw.println("getLocale: " + req.getLocale());
        pw.println("getWriter: " + resp.getWriter());
        pw.println("getCharacterEncoding: " + resp.getCharacterEncoding());

            }
}
