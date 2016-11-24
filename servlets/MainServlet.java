package servlets;

import entity.User;
import helpers.Render;
import services.UserServiceImpl;
import services.interf.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

/**
 * Created by Alex on 20.11.2016.
 */
public class MainServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HashMap<String, Object> root = new HashMap<>();
        String login = (String)request.getSession().getAttribute("current_user");

        if (login != null) {
            root.put("current_user", userService.getUser(login));
        }

        Integer id = null;

        if (request.getParameter("id") != null) {
            id = new Integer(request.getParameter("id"));
        }

        if (id != null) {
            User user = userService.getUser(id);
            if (user != null) {
                root.put("user", user);
                new Render().render(request, response, "main.ftl", root);
            } else {
                new Render().render(request, response, "main.ftl", null);
            }
        } else {
            new Render().render(request, response, "main.ftl", null);
        }
    }
}
