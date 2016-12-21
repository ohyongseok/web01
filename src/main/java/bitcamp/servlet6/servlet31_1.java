package bitcamp.servlet6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet31_1") 
public class servlet31_1 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override 
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    int a = Integer.parseInt(request.getParameter("a"));
    int b = Integer.parseInt(request.getParameter("b"));
    
    int sum = a + b;
    
    request.setAttribute("result", sum);
    RequestDispatcher rd = request.getRequestDispatcher("/servlet/servlet31_2");
    rd.forward(request, response);
    
  }
  
}