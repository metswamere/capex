package view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/HLLDClass")
public class HLLD extends HttpServlet{
    @SuppressWarnings("compatibility:-790771052092975027")
    private static final long serialVersionUID = -558915929103477098L;

   
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        String app = req.getParameter("HLLDDocNumber");
        
        resp.getWriter().println("HHLD Doc Number: "+app);
    }
    
  
    public void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException, IOException
    {
            String app = req.getParameter("HLLDDocNumber");
            
            resp.getWriter().println("HHLD Doc Number: "+app);
        
        }
    
    
    public HLLD() {
        super();
    }
    
    
    
}
