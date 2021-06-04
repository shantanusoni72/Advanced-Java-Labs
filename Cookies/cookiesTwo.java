import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

public class CookiesTwo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            Cookie[] cookie = request.getCookies();
            PrintWriter result = response.getWriter();
            out.println("<!DOCTYPE html><head><title>Cookie</title></head><body>");
            for(int i=0;i<c.length;i++) {
            	out.println("<h1>Cookie Name Value:" + c[i].getName()+c[i].getValue() + "</h1>");
            }
            out.println("<a href='CookieThree'>Click here</form></body></html>");
            Cookie cookie = new Cookie("CookieTwo","val2");
            response.addCookie(cookie);      
    }
}
