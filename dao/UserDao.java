package dao;

import entity.Auth;
import entity.User;

/**
 * Created by Alex on 14.11.2016.
 */
public interface UserDao {

    Auth getADataUser(String username);

    Auth getUserName(String username);

    void createNewUser(String username, String s, String lastName, String firstName, String male, String date, String exp, String cars);

    User getAllDataUser(String username);
}
