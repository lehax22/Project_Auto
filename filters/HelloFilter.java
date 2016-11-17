package filters;

import services.CookieServiceImpl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Alex on 14.11.2016.
 */
public class HelloFilter implements Filter {

    private CookieServiceImpl cookieService = new CookieServiceImpl();

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        if (cookieService.checkCookies(request.getCookies())) {
            response.sendRedirect("/main");
        } else {
            response.addCookie(cookieService.createCookie());
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
