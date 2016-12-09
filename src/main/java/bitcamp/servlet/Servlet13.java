package bitcamp.servlet;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet13")
public class Servlet13 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    
    try {
      File file = new File("\\Users\\OYS\\Desktop\\img01.jpg");
      FileInputStream in = new FileInputStream(file);
      response.setContentType("image/jpeg");
      BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
      
      int b = 0; 
      while ((b = in.read()) != -1) {
        out.write(b);
      }
      out.flush();
      out.close();
      in.close();
      
    } catch(Exception e) {
      e.printStackTrace();
    }
 
  }

}
