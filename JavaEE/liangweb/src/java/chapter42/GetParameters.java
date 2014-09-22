
package chapter42;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetParameters extends HttpServlet{
    /** Process the HTTP Post request */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{
        response.setContentType("text/html");
    }
}