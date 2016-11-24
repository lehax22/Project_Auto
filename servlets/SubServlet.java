package servlets;

import entity.Follows;
import entity.User;
import helpers.Render;
import services.FollowsServiceImpl;
import services.UserServiceImpl;
import services.interf.FollowsService;
import services.interf.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Alex on 21.11.2016.
 */
public class SubServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    private FollowsService followsService = new FollowsServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HashMap<String, Object> root = new HashMap<>();
        String login = (String)request.getSession().getAttribute("current_user");

        if (login != null) {
            root.put("current_user", userService.getUser(login));
        }

        Integer id = new Integer(request.getParameter("id"));

        if (id != null) {
            User user = userService.getUser(id);
            ArrayList<Follows> subs = followsService.getListSubFollows(id);

            if (subs != null) {
                ArrayList<User> users = new ArrayList<>();
                for (Follows sub: subs) {
                    users.add(sub.getFollower());
                }
                root.put("users", users);
                new Render().render(request, response, "subscriptions.ftl", root);
            } else {
                new Render().render(request, response, "subscriptions.ftl", null);
            }
        } else {
            response.sendError(404);
        }
    }
}
