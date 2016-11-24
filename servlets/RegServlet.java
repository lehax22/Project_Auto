package servlets;

import helpers.MD5Util;
import helpers.Render;
import services.UserServiceImpl;
import services.interf.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alex on 18.11.2016.
 */
public class RegServlet extends HttpServlet {

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

        String err = null;
        if (userService.getUser(username) != null) {
            err = "username already exist";
        } else if (password == null){
            err = "not typed your password";
        } else if (!password.equals(reppassword)) {
            err = "incorrect repeated password";
        } else if (lastName == null) {
            err = "not typed your lastname";
        } else if (firstName == null) {
            err = "not typed your firstname";
        } else if (male == null) {
            err = "not selected gender";
        } else if (date == null) {
            err = "not selected birthdate";
        } else if (exp == null) {
            err = "not typed your driving stage";
        } else if (cars == null) {
            err = "not typed your cars";
        }

        if (err != null) {
            response.sendRedirect("/regis?err=" + err);
        } else {
            userService.createNewUser(
                    username,
                    md5Util.md5Custom(password),
                    lastName,
                    firstName,
                    male,
                    date,
                    exp,
                    cars
            );
            response.sendRedirect("/login");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        new Render().render(request, response, "signup.ftl", null);
    }
}
