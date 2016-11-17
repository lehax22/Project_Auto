package services;

import entity.Auth;
import entity.User;

/**
 * Created by Alex on 14.11.2016.
 */
public interface UserService {
    Auth getDataUser(String username);

    boolean checkUN(String login, String ulogin);

    boolean checkPW(String password, String upassword);

    boolean checkUserName(String username);

    void createNewUser(String username, String password, String lastName, String firstName, String male, String date, String exp, String cars);

    User getAllDataUser(String username);
}
