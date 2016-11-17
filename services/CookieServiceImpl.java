package services;

import javax.servlet.http.Cookie;

/**
 * Created by Alex on 14.11.2016.
 */
public class CookieServiceImpl implements CookieService{
    @Override
    public boolean checkCookies(Cookie[] cookies) {
        for (Cookie cookie: cookies) {
            if (cookie.getName().equals(idCookie)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Cookie createCookie() {
        Cookie cookie = new Cookie(idCookie, "ldhfkagdlskjfhiouweq");
        return cookie;
    }
}
