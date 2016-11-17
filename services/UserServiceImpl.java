package services;

import dao.UserDaoImpl;
import entity.Auth;
import entity.User;
import helpers.MD5UtilImpl;

/**
 * Created by Alex on 14.11.2016.
 */
public class UserServiceImpl implements UserService{

    private UserDaoImpl userDao = new UserDaoImpl();
    private MD5UtilImpl md5Util = new MD5UtilImpl();
    private Auth auth;

    @Override
    public Auth getDataUser(String username) {
        return userDao.getADataUser(username);
    }

    @Override
    public boolean checkUN(String login, String ulogin) {
        return login.equals(ulogin);
    }

    @Override
    public boolean checkPW(String password, String upassword) {
        return md5Util.md5Custom(upassword).equals(password);
    }

    @Override
    public boolean checkUserName(String username) {
        auth = userDao.getUserName(username);
        return (auth == null);
    }

    @Override
    public void createNewUser(String username, String password, String lastName, String firstName, String male, String date, String exp, String cars) {
        userDao.createNewUser(username, md5Util.md5Custom(password), lastName, firstName, male, date, exp, cars);
    }

    @Override
    public User getAllDataUser(String username) {
        return userDao.getAllDataUser(username);
    }
}
