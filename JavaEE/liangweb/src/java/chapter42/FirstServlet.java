package chapter42;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class FirstServlet extends HttpServlet{
    /**
     Handle the HTTP GET method.
     * @param request servlet request
     * @param response servlet response
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws java.io.IOException{
        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();
        
         // output your page here
        out.println("<html>"
                + "<head><title>Servlet</title></head>");
        out.println("<body>Hello, Java Servlets is awesome </body>");
        out.println("</html>");
        out.close();
    }
}