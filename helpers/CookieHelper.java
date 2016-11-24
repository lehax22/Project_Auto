package helpers;

import javax.servlet.http.Cookie;

/**
 * Created by Alex on 18.11.2016.
 */
public class CookieHelper {

    private String idCookie = "AutoProject928ncx";

    public boolean checkCookies(Cookie[] cookies) {
        for (Cookie cookie: cookies) {
            if (cookie.getName().equals(idCookie)) {
                return true;
            }
        }
        return false;
    }

    public Cookie createCookie() {
        Cookie cookie = new Cookie(idCookie, "ldhfkagdlskjfhiouweq");
        cookie.setMaxAge(24 * 60 * 60);
        return cookie;
    }
}
