package servlets;

import entity.Messages;
import entity.User;
import helpers.Render;
import services.MessagesServiceImpl;
import services.UserServiceImpl;
import services.interf.MessagesService;
import services.interf.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Alex on 20.11.2016.
 */
public class MyMessServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    private MessagesService messagesService = new MessagesServiceImpl();

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
            User user =  userService.getUser(id);
            ArrayList<Messages> messages = messagesService.getMessages(id);

            if (messages != null) {
                root.put("messages", messages);
                root.put("user", user);
                new Render().render(request, response, "messages.ftl", root);
            } else {
                new Render().render(request, response, "messages.ftl", null);
            }
        } else {
            response.sendError(404);
        }

    }
}
