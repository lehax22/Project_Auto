package dao.interf;

import entity.User;

/**
 * Created by Alex on 18.11.2016.
 */
public interface UserDao {
    User getUser(String username, String password);

    User getUser(String username);

    void createNewUser(String username, String s, String lastName, String firstName, String male, String date, String exp, String cars);

    User getUser(Integer id);

    void changeUser(User user);
}
