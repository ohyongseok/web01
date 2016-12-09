package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet12")
public class Servlet12 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    
    response.setContentType("text/csv;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("홍길동1, 20, 222-1111, hong@test.com");
    out.println("홍길동2, 21, 333-1111, hong2@test.com");
    out.println("홍길동3, 22, 444-1111, hong3@test.com");
    out.println("홍길동4, 23, 555-1111, hong4@test.com");
    out.println("홍길동5, 24, 111-1111, hong5@test.com");
 
  }

}
