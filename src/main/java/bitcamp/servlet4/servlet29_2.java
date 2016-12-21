package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet29_2") 
public class servlet29_2 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override 
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("서블릿 2");
    
    String submenuNo= request.getParameter("submenuNo");
    if ("s1".equals(submenuNo)) {
      RequestDispatcher rd = request.getRequestDispatcher("/servlet/servlet29_2_1");
      rd.forward(request, response);
      return;
    } else if ("s2".equals(submenuNo)) {
      RequestDispatcher rd = request.getRequestDispatcher("/servlet/servlet29_2_2");
      rd.forward(request, response);
      return;
    } 
  }
  
}