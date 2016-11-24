package servlets;

import entity.Messages;
import entity.User;
import helpers.MD5Util;
import helpers.Render;
import services.UserServiceImpl;
import services.interf.UserService;

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
public class RedServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();
    private MD5Util md5Util = new MD5Util();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String reppassword = request.getParameter("reppassword");
        String lastName = request.getParameter("last_name");
        String firstName = request.getParameter("first_name");
        String male = request.getParameter("gender");
        String date = request.getParameter("date_birth");
        String exp = request.getParameter("exp");
        String cars = request.getParameter("cars");

        Integer id = new Integer(request.getParameter("id"));

        User user = userService.getUser(id);

        if (!username.equals("")) {
            user.setLogin(username);
        }
        if (password.equals(reppassword ) && !reppassword.equals("") && !password.equals("")){
            user.setPassword(md5Util.md5Custom(password));
        }
        if (!lastName.equals("")) {
            user.setPassword(lastName);
        }
        if (!firstName.equals("")) {
            user.setFirstname(firstName);
        }
        if (male != null) {
            user.setMale(male);
        }
        if (!date.equals("")) {
            user.setDate(date);
        }
        if (!exp.equals("")) {
            user.setDriving_stage(Integer.parseInt(exp));
        }
        if (!cars.equals("")) {
            user.setCar(cars);
        }

        userService.changeUser(user);
        response.sendRedirect("/main?id=" + id.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = (String)request.getSession().getAttribute("current_user");
        HashMap<String, Object> root = new HashMap<>();

        if (login != null)
            root.put("current_user", userService.getUser(login));

        Integer id = new Integer(request.getParameter("id"));

        if (id != null) {
            new Render().render(request, response, "redactor.ftl", root);
        } else {
            response.sendError(404);
        }
    }
}
