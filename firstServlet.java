import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NamasteServlet extends HttpServlet {

   private String msg;
   public void init() throws ServletException {
          msg = "You Are Welcome, Buddy!";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          response.setContentType("text/html");
          PrintWriter out = response.getWriter();
          out.println("<h3>" + msg + "</h3>");
   }
}
