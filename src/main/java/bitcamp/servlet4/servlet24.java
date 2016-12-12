package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet24")
public class servlet24 extends AbstractHttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override //  AbstractHttpServlet 의 내부 protected service() 를 오버라이드 했다.
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("service(ServletRequset, servletResponse)"
        + "--------> service(HttpServletRequest, HttpServletResponse)");
  }
}
