package bitcamp.servlet6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet32_1") 
public class servlet32_1 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  

  
  @Override 
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    float interest = Float.parseFloat(request.getParameter("interest"));
    ServletContext servletContext = request.getServletContext();
    
    servletContext.setAttribute("interest", interest);
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printf("설정된 이자율: %f\n", interest);
  }
  
}