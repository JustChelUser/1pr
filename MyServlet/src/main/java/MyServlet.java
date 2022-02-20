import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {         
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
         
        try {
            writer.println();
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title> MyServlet</title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>Reservation</h1>");
            writer.println(request.getParameter("Name")+" "+request.getParameter("Surname") +" "+ "'sYou has been reserved.");
            writer.println("</body>");
            writer.println("</html>");
        } finally {
            writer.close();  
        }
    }
}