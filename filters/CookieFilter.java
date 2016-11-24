package filters;

import helpers.CookieHelper;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alex on 18.11.2016.
 */
public class CookieFilter implements Filter {

    public CookieHelper cookieHelper = new CookieHelper();

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        if (cookieHelper.checkCookies(request.getCookies())) {
            response.sendRedirect("/main");
        } else {
            response.addCookie(cookieHelper.createCookie());
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
