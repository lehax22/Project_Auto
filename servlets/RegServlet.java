package servlets;

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
public class RegServlet extends HttpServlet {

    private UserServiceImpl userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String reppassword = request.getParameter("reppassword");
        String lastName = request.getParameter("last_name");
        String firstName = request.getParameter("first_name");
        String male = request.getParameter("male");
        String date = request.getParameter("date_birth");
        String exp = request.getParameter("exp");
        String cars = request.getParameter("cars");

        if (userService.checkUserName(username)) {
            if (password.equals(reppassword)) {
                userService.createNewUser(
                        username,
                        password,
                        lastName,
                        firstName,
                        male,
                        date,
                        exp,
                        cars
                );
                response.sendRedirect("/login");
            } else {
                response.sendRedirect("/regis?err=Wrong password");
            }
        } else {
            response.sendRedirect("/regis?err=Username already exists");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Configuration cfg = ConfigSingleton.getConfig(getServletContext());
        Template tmpl = cfg.getTemplate("regis.ftl");
        try {
            tmpl.process(null, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }
}
