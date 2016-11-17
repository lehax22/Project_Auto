package servlets;

import entity.Auth;
import entity.User;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import helpers.ConfigSingleton;
import services.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alex on 14.11.2016.
 */
public class LoginServlet extends HttpServlet {

    private UserServiceImpl userService = new UserServiceImpl();
    private User user;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Auth auth = userService.getDataUser(username);

        if (userService.checkUN(auth.getLogin(), username)) {
            if (userService.checkPW(auth.getPassword(), password)) {
                request.getSession().setAttribute("current_user", username);
                user = userService.getAllDataUser(username);
                request.getSession().setAttribute("data_current_user", user);
                response.sendRedirect("/myprofile");
            } else {
                response.sendRedirect("/login?err=Wrong password");
            }
        } else {
            response.sendRedirect("login?err=Not found");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Configuration cfg = ConfigSingleton.getConfig(getServletContext());
        Template tmpl = cfg.getTemplate("login.ftl");
        try {
            tmpl.process(null, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
