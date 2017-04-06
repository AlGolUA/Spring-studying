package algol.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by admin on 04.04.2017.
 */
@WebServlet(name = "Servlet2", urlPatterns = ("/second"))
public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        javax.servlet.jsp.JspPage x;
        String name = "Alik";
        request.setAttribute("nname", name);
        request.setAttribute("BIGNAME", name.toUpperCase());
        getServletContext().getRequestDispatcher("/mypage.jsp").forward(request, response);
//        response.setContentType("text/html");
//        response.getWriter().append("<strong>Second Servlet</strong>");
    }
}
