package servlets;

import entity.Follows;
import entity.User;
import helpers.Render;
import services.FollowsServiceImpl;
import services.interf.FollowsService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Alex on 24.11.2016.
 */
public class UnFollowServlet extends HttpServlet {

    private FollowsService followsService = new FollowsServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = (String)request.getSession().getAttribute("current_user");

        Integer id = new Integer(request.getParameter("id"));
        Integer follow = new Integer(request.getParameter("del"));

        if (id != null && follow != null) {
            followsService.unfollow(id, follow);
            response.sendRedirect("/subscription?id=" + id.toString());
        } else {
            response.sendError(404);
        }
    }
}
