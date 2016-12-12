package bitcamp.servlet4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/servlet27/update")
public class Servlet27_update extends HttpServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
    request.setCharacterEncoding("UTF-8");
    response.setHeader("Refresh", "1;url=list");
    PrintWriter out = response.getWriter();
    
    Connection con = null;
    PreparedStatement stmt = null;
    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java89db", 
          "java89", "1111");
      stmt = con.prepareStatement(
          "update ex_students set "
          + " pwd=?,name=?,tel=?,email=?,work=?,byear=?,schl=?"
          + " where uid=?");
      
      stmt.setString(1, request.getParameter("password"));
      stmt.setString(2, request.getParameter("name"));
      stmt.setString(3, request.getParameter("tel"));
      stmt.setString(4, request.getParameter("email"));
      stmt.setString(5, request.getParameter("working"));
      stmt.setInt(6, Integer.parseInt(request.getParameter("birthYear")));
      stmt.setString(7, request.getParameter("school"));
      stmt.setString(8, request.getParameter("userId"));
      
      int count = stmt.executeUpdate();
      
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<meta charset='UTF-8'>");
      out.println("<meta name='viewport' content='width=device-with, user-scalable=no, maximum-scale=1'>");
      out.println("<title>학생 관리-변경</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>변경 결과</h1>");
      
      if (count == 0) {
        out.println("해당 인원이 없습니다.");
      } else {
        out.println("변경하였습니다");
      }
      out.println("</form>");
      out.println("</body>");
      out.println("</html>");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {stmt.cancel();} catch(Exception e) {}
      try {con.close();} catch(Exception e) {}
    }
  }

}
