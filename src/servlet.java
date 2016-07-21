import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class servlet extends HttpServlet {  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
    RequestDispatcher rd=request.getRequestDispatcher("/final.html");    
    String n=request.getParameter("userName"); 
    out.println("<html>");
    out.println("<body bgcolor=lightblue");
    out.println("<center>");
    out.println("<h2>");
    out.println("Welcome"+"  " +n);
    out.println("</h2>");
    out.println("<h3>You are logged in!!</h3>");
    out.println("</center>");
    out.println("</body>");
    out.println("</html>");

    }  
  
} 