package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet23")
public class servlet23 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
    
    HttpServletRequest request = (HttpServletRequest)req;
    HttpServletResponse response = (HttpServletResponse)resp;
    
    if (request.getMethod().equals("GET")) {
      doGet(request, response);
    } else if (request.getMethod().equals("POST")) {
      doPost(request, response);
    }
   
    
  }

  // 여기는 내 마음대로 만든 메서드일뿐이다.
  private void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("POST 요청 처리 결과");
    out.printf("data1=%s\n", request.getParameter("data1"));
    out.printf("data2=%s\n", request.getParameter("data2"));
    out.printf("data3=%s\n", request.getParameter("data3"));
  }

  private void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.println("GET 요청 처리 결과");
    out.printf("data1=%s\n", request.getParameter("data1"));
    out.printf("data2=%s\n", request.getParameter("data2"));
    out.printf("data3=%s\n", request.getParameter("data3"));
  }
  
}
