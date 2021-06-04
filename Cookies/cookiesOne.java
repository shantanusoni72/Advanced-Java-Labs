import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

public class CookieOne  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             PrintWriter out = response.getWriter();
              if(request.getParameter("id").equals("ss1234") && request.getParameter("password").equals("secret")) {
              		response.setContentType("text/html;charset=UTF-8");
              		out.println("<html><head><title>Servlet Cookie</title></head><body><h1>Welcome Cookie</h1><a href='CookieSecond'>Click here</a></body></html>");
             		Cookie cookie = new Cookie("CookieOne",request.getParameter("id"));
            		response.addCookie(cookie);
            } else { 
            		RequestDispatcher r=request.getRequestDispatcher("index.html");
            		r.include(request, response);
            		out.println("You entered wrong ID or Password");
            }
        }
    }
