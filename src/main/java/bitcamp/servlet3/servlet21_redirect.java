package bitcamp.servlet3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet21_redirect")
public class servlet21_redirect extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
    
    HttpServletRequest request = (HttpServletRequest)req;
    HttpServletResponse response = (HttpServletResponse)resp;
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
//    out.println("<meta http-equiv='Refresh' content='5;url=http://www.daum.net'>");
    out.println("<title>servlet21_refresh1</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<p>5초 후에 카카오 홈페이지로 이동.</p>");
    out.println("</body>");
    out.println("</html>");
    response.sendRedirect("http://www.daum.net");
    
  }
  
}
