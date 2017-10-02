package mylogin.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 642202
 */
public class LoginServlet extends HttpServlet {    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        HttpSession session = request.getSession();
        String username = "";
        String action = "";
        action = request.getParameter("action");
        if (action != null && action.equals("logout")){
            session.setAttribute("user", null);
            request.setAttribute("message", "logged out");
        }
        
        if (cookies != null){
            for (Cookie cookie: cookies){
                if (cookie.getName().equals("username")){
                    username = cookie.getValue();
                }
            }
        }
    } 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
    }

}
