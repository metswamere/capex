package view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HLLDServ", urlPatterns = { "/hlldserv" })
public class HLLDServ extends HttpServlet {
    @SuppressWarnings("compatibility:-1551566237928956775")
    private static final long serialVersionUID = 7796530111211254065L;
    private static final String CONTENT_TYPE = "text/html; charset=UTF-8";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        String name = request.getParameter("CPBNo");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>HLLDServ</title></head>");
        out.println("<body>");
        out.println("<p>CPB No.: "+name+"</p>");
        out.println("</body></html>");
        out.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>HLLDServ</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a POST. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }

    public void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    public void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException,
                                                                                          IOException {
    }
}
