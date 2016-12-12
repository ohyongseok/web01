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

@WebServlet("/servlet/servlet20")
public class servlet20 extends GenericServlet {
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
    out.println("<title>servlet20</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>HttpServletRequest </h1>");
    out.printf("요청 매서드=> %s<br>\n", request.getMethod());
    out.printf("Context Root(웹 어플리케이션 경로)=> %s<br>\n", request.getContextPath());
    out.printf("User-Agent헤더(웹 브라우저 이름)=> %s<br>\n", request.getHeader("User-Agent"));
    out.printf("PathInfo=> %s<br>\n", request.getPathInfo());
    out.printf("Query String=> %s<br>\n", request.getQueryString());
    out.printf("RequestURI=> %s<br>\n", request.getRequestURI());
    out.printf("RequestURL=> %s<br>\n", request.getRequestURL());
    out.printf("ServletPath=> %s<br>\n", request.getServletPath());
    
  }
  
}
