package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet29") 
public class servlet29 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override 
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("서블릿 1");
    
    String menuNo= request.getParameter("menuNo");
    if ("m2".equals(menuNo)) {
      RequestDispatcher rd = request.getRequestDispatcher("/servlet/servlet29_2");
      rd.forward(request, response);
      return;
    } else if ("m3".equals(menuNo)) {
      RequestDispatcher rd = request.getRequestDispatcher("/servlet/servlet29_3");
      rd.forward(request, response);
      return;
    }
  }
  
}