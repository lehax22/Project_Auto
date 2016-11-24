package filters;

import entity.User;
import helpers.CookieHelper;
import services.UserServiceImpl;
import services.interf.UserService;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alex on 18.11.2016.
 */
public class LoginFilter implements Filter {

    private UserService userService = new UserServiceImpl();

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String username = (String)request.getSession().getAttribute("current_user");
        if (username == null) {
            chain.doFilter(req, resp);
        } else {
            response.sendRedirect("/myprofile?id=" + userService.getUser(username).getId());
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
