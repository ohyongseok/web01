package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class AbstractHttpServlet extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
    
    this.service((HttpServletRequest)req, (HttpServletResponse)resp);
    
  }
  
  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    if (request.getMethod().equals("GET")) {
      doGet(request, response);
    } else if (request.getMethod().equals("POST")) {
      doPost(request, response);
    }
  
  }

  // 여기는 내 마음대로 만든 메서드일뿐이다.
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("이 서블릿은 GET 요청을 처리하지 않습니다");
  }
  
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("이 서블릿은 POST 요청을 처리하지 않습니다");
  }

  
}
