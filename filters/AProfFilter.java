package filters;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Alex on 15.11.2016.
 */
public class AProfFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
