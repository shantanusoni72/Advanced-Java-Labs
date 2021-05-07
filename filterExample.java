import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.*;  
  
public class FilterClass implements Filter {  
	public void init(FilterConfig arg0) throws ServletException {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {  
		PrintWriter out = response.getWriter();  
    	out.print("Filter execution before.");  
        chain.doFilter(request, response);
        out.print("Filter execution after");  
    }    
}  
