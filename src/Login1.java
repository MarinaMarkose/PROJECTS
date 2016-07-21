import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
  
public class Login1  extends HttpServlet {  
  
public void doPost(HttpServletRequest request, HttpServletResponse response)  
        throws ServletException, IOException {  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
          
    String n=request.getParameter("userName");  
    String p=request.getParameter("userPass");  
          
    if(n.equals("marina") && p.equals("12345"))
    {  
       
       RequestDispatcher rd=request.getRequestDispatcher("servlet2"); 
       
        rd.forward(request, response);  
    }  
    else{  
        out.println("Wrong Credentials!");
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
        rd.include(request, response);  
        }  
    }  
  
} 