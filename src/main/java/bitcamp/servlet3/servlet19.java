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

@WebServlet("/servlet/servlet19")
public class servlet19 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<meta charset='UTF-8'>");
    out.println("<title>servlet19</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>HttpServletRequest 와 HttpServletResponse</h1>");
    out.printf("HttpServletRequest=%b<br>\n", request instanceof HttpServletRequest);
    out.printf("HttpServletResponse=%b<br>\n", response instanceof HttpServletResponse);
  }
  
}
