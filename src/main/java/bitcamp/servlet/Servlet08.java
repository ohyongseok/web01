package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet08")
public class Servlet08 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  // http://localhost:8080/web01/servlet07?name=1&age=2&tel=3
  @Override
  public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("name");
    out.println("-------------------------------------------");
    
    String[] value = request.getParameterValues("name");
    for (String item : value) {
      out.println(item);
    }
 
  }

}
