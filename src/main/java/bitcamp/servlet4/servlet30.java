package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet30") 
public class servlet30 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override 
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("서블릿 30 - start");
    
    String menuNo= request.getParameter("menuNo");
    if ("m2".equals(menuNo)) {
      RequestDispatcher rd = request.getRequestDispatcher("/servlet/servlet30_2");
      rd.include(request, response);
    } else if ("m3".equals(menuNo)) {
      RequestDispatcher rd = request.getRequestDispatcher("/servlet/servlet30_3");
      rd.include(request, response);
    }
    out.println("서블릿 30 - end");
  }
  
}