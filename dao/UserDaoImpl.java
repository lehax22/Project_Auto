package dao;

import coonhelp.DBConnectionHelper;
import dao.interf.UserDao;
import entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Alex on 18.11.2016.
 */
public class UserDaoImpl implements UserDao {

    private Connection connection = DBConnectionHelper.getConn();
    private User user;

    @Override
    public User getUser(String username, String password) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM users WHERE login = '" + username + "' AND password = '" + password + "'"
            );
            while (resultSet.next()) {
                user = new User(
                        resultSet.getLong("id"),
                        resultSet.getString("login"),
                        resultSet.getString("password"),
                        resultSet.getString("path_to_the_photo"),
                        resultSet.getString("firstname"),
                        resultSet.getString("lastname"),
                        resultSet.getString("male"),
                        resultSet.getString("birthdate"),
                        resultSet.getInt("driving_stage"),
                        resultSet.getString("car")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User getUser(String username) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM users WHERE login = '" + username + "'"
            );
            while (resultSet.next()) {
                user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("login"),
                        resultSet.getString("password"),
                        resultSet.getString("path_to_the_photo"),
                        resultSet.getString("firstname"),
                        resultSet.getString("lastname"),
                        resultSet.getString("male"),
                        resultSet.getString("birthdate"),
                        resultSet.getInt("driving_stage"),
                        resultSet.getString("car")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void createNewUser(String username, String password, String lastName, String firstName, String male, String date, String exp, String cars) {
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery(
                    "insert into users(\"login\", \"password\", \"path_to_the_photo\", \"firstname\", \"lastname\", \"male\", \"birthdate\", \"driving_stage\", \"car\") values ('" + username + "', '" + password + "', 'img/src', '" + firstName + "', '" + lastName + "', '" + male + "', cast('" + date + "' as date), '" + exp + "', '" + cars + "');"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getUser(Integer id) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM users WHERE id = '" + id.toString() + "'"
            );
            while (resultSet.next()) {
                user = new User(
                        resultSet.getInt("id"),
                        resultSet.getString("login"),
                        resultSet.getString("password"),
                        resultSet.getString("path_to_the_photo"),
                        resultSet.getString("firstname"),
                        resultSet.getString("lastname"),
                        resultSet.getString("male"),
                        resultSet.getString("birthdate"),
                        resultSet.getInt("driving_stage"),
                        resultSet.getString("car")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void changeUser(User user) {
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery(
                    "UPDATE users SET login = '" + user.getLogin() + "', password = '" + user.getPassword() + "' , firstname = '" + user.getFirstname() + "', lastname = '" + user.getMale() + "', birthdate = '" + user.getDate() + "', driving_stage = '" + user.getStrDriving_stage() + "', car = '" + user.getCar() + "' WHERE id = '" + user.getId() + "';"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
