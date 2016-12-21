package bitcamp.servlet6;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/servlet/serlvet33_1",loadOnStartup=1) 
public class servlet33_1 extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  @Override
  public void init(ServletConfig config) throws ServletException {
    System.out.println("Servlet33_1.init() 호출됨");
    
    ServletContext servletContext = config.getServletContext();
    servletContext.setAttribute("interest", 0.11f);
  }
  
  @Override 
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    
    int money = Integer.parseInt(request.getParameter("money"));
    float interest = 0.01f;
    
    ServletContext servletContext = request.getServletContext();
    Object value = servletContext.getAttribute("interest");
    
    if (value != null) {
      interest = (float)value;
    }
    
    response.setContentType("text/plain;charset=UTF-8");
    PrintWriter out = response.getWriter();
    out.printf("%d의 년 이자는: %f\n", money,  money * interest);
  }
  
}