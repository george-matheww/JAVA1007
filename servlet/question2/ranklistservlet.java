
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author George
 */
@WebServlet(name = "ranklistservlet", urlPatterns = { "/ranklistservlet.html" })
public class ranklistservlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int v = Integer.valueOf(request.getParameter("vote"));
            int c = Integer.valueOf(request.getParameter("can"));
            // int v=8,c=4;
            String user = request.getParameter("user");
            String[] ranks = user.split(" ");
            ranklist r = new ranklist(v, c, ranks);
            String win = r.calc();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ranklist result</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2> the winner is " + win + "</h2>");
            out.println("</body>");
            out.println("</html>");

        } finally {
            out.close();
        }
    }
}
