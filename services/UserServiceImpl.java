package services;

import dao.UserDaoImpl;
import dao.interf.UserDao;
import entity.User;
import services.interf.UserService;

/**
 * Created by Alex on 18.11.2016.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public User getUser(String username, String password) {
        User user = userDao.getUser(username, password);
        if (user != null) {
            return user;
        }
        return null;
    }

    @Override
    public User getUser(String current_user) {
        User user = userDao.getUser(current_user);
        if (user != null) {
            return user;
        }
        return null;
    }

    @Override
    public void createNewUser(String username, String password, String lastName, String firstName, String male, String date, String exp, String cars) {
        userDao.createNewUser(username, password, lastName, firstName, male, date, exp, cars);
    }

    @Override
    public User getUser(Integer id) {
        User user = userDao.getUser(id);
        if (user != null) {
            return user;
        }
        return null;
    }

    @Override
    public void changeUser(User user) {
        userDao.changeUser(user);
    }
}
