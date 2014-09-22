
package chapter42;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;


public class CurrentTime extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        response.setContentType("text/http");
        PrintWriter out = response.getWriter();
        out.println("<p> The current time is " + new java.util.Date() + "</p>");
        out.close();
    }
}