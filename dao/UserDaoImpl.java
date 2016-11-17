package dao;

import entity.Auth;
import entity.User;
import helpers.DBConnectionHelper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Alex on 14.11.2016.
 */
public class UserDaoImpl implements UserDao{

    private Connection conn = DBConnectionHelper.getConn();
    private Auth auth;
    private User user;

    @Override
    public Auth getADataUser(String username) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT * FROM users WHERE login = '" + username + "'"
            );
            while (rs.next()) {
                auth = new Auth(rs.getInt("id"),rs.getString("login"), rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return auth;
    }

    @Override
    public Auth getUserName(String username) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT login FROM users WHERE login ='" + username + "'"
            );
            while (rs.next()) {
                auth = new Auth(rs.getString("login"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return auth;
    }

    @Override
    public void createNewUser(String username, String s, String lastName, String firstName, String male, String date, String exp, String cars) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "insert into users(\"login\", \"password\", \"path_to_the_photo\", \"firstname\", \"lastname\", \"male\", \"birthdate\", \"driving_stage\", \"car\") values ('" + username + "', '" + s + "', 'img/src', '" + firstName + "', '" + lastName + "', '" + male + "', cast('" + date + "' as date), '" + exp + "', '" + cars + "');"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User getAllDataUser(String username) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(
                    "SELECT * FROM users WHERE login ='" + username + "'"
            );
            while (rs.next()) {
                user = new User(
                        rs.getInt("id"),
                        rs.getString("login"),
                        rs.getString("password"),
                        rs.getString("path_to_the_photo"),
                        rs.getString("firstname"),
                        rs.getString("lastname"),
                        rs.getString("male"),
                        rs.getString("birthdate"),
                        rs.getInt("driving_stage"),
                        rs.getString("car")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
