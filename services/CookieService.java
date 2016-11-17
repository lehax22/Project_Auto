package services;

import javax.servlet.http.Cookie;

/**
 * Created by Alex on 14.11.2016.
 */
public interface CookieService {

    String idCookie = "AutoProject928ncx";

    boolean checkCookies(Cookie[] cookies);
    Cookie createCookie();
}
