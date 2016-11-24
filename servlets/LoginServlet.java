package servlets;

import entity.User;
import helpers.MD5Util;
import helpers.Render;
import services.UserServiceImpl;
import services.interf.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;


/**
 * Created by Alex on 18.11.2016.
 */
public class LoginServlet extends HttpServlet {

    private MD5Util md5Util = new MD5Util();
    private UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = md5Util.md5Custom(request.getParameter("password"));

        User user = userService.getUser(username, password);

        if (user != null) {
            request.getSession().setAttribute("current_user", username);
            Cookie cookie = new Cookie("cookie_user", md5Util.md5Custom(new Date().toString()));
            response.addCookie(cookie);
            response.sendRedirect("/myprofile?id=" + user.getId());
        } else {
            response.sendRedirect("/login?err=Not found");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        (new Render()).render(request, response, "login.ftl", null);

    }
}
