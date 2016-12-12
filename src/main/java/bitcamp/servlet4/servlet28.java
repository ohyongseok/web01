package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet28")
public class servlet28 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override //  AbstractHttpServlet 의 내부 protected doGet() 를 오버라이드 했다.
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String data1 = request.getParameter("data1");
    for (int i = 0; i < data1.length(); i ++) {
      out.printf("[%c]-%x\n", data1.charAt(i), (int)data1.charAt(i));
    }
  }
  
  @Override //  AbstractHttpServlet 의 내부 protected doGet() 를 오버라이드 했다.
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String data1 = request.getParameter("data1");
    for (int i = 0; i < data1.length(); i ++) {
      out.printf("[%c]-%x\n", data1.charAt(i), (int)data1.charAt(i));
    }
  }
}
