package dao;

import coonhelp.DBConnectionHelper;
import dao.interf.FollowsDao;
import dao.interf.UserDao;
import entity.Follows;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Alex on 21.11.2016.
 */
public class FollowsDaoImpl implements FollowsDao{

    private Connection connection = DBConnectionHelper.getConn();
    private UserDao userDao = new UserDaoImpl();
    private ArrayList<Follows> followses;

    @Override
    public ArrayList<Follows> getListFollows(Integer id) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM follows where user_id ='" + id.toString() + "'"
            );
            followses = new ArrayList<>();
            while (resultSet.next()) {
                Integer iD = new Integer(resultSet.getString("follower_id"));
                followses.add(new Follows(
                        userDao.getUser(iD)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return followses;
    }

    @Override
    public ArrayList<Follows> getListSubFollows(Integer id) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM follows where follower_id ='" + id.toString() + "'"
            );
            followses = new ArrayList<>();
            while (resultSet.next()) {
                Integer iD = new Integer(resultSet.getString("user_id"));
                followses.add(new Follows(
                        userDao.getUser(iD)
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return followses;
    }

    @Override
    public void delSub(String sub, String user) {
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery(
                    "DELETE FROM follows WHERE user_id='" + sub + "' AND follower_id=" +
                            "'" + user + "'"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void unfollow(Integer id, Integer follow) {
        try {
            Statement statement = connection.createStatement();
            statement.executeQuery(
                    "DELETE FROM follows WHERE user_id='" + follow.toString() + "' AND follower_id=" +
                            "'" + id.toString() + "'"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
