package dao;

import coonhelp.DBConnectionHelper;
import dao.interf.MessagesDao;
import entity.Messages;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by Alex on 20.11.2016.
 */
public class MessagesDaoImpl implements MessagesDao{

    private Connection connection = DBConnectionHelper.getConn();
    private ArrayList<Messages> messages;

    @Override
    public ArrayList<Messages> getListMessages(Integer id) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM messages WHERE recipient = '" + id.toString() +"'"
            );
            messages = new ArrayList<>();
            while (resultSet.next()) {
                messages.add(new Messages(
                        resultSet.getLong("id"),
                        resultSet.getLong("sender"),
                        resultSet.getLong("recipient"),
                        resultSet.getString("content"),
                        resultSet.getTimestamp("date_written"),
                        resultSet.getBoolean("unread"))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return messages;
    }
}
