package bitcamp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet05 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest reqeust, ServletResponse response) throws ServletException, IOException {
    PrintWriter out = response.getWriter();
    out.println("Hello, Wrold!");
    out.println("안녕하세요");
    out.println("니하오");
    out.println("Hallo");
    out.println("곤니찌와");
    // 한글 일본어 중국어는 깨짐
  }

}
