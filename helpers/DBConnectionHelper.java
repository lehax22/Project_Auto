package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Alex on 14.11.2016.
 */
public class DBConnectionHelper {
    private static final String url =
            "jdbc:postgresql://localhost:5433/Project_Auto_Example";
    private static final String username = "postgres";
    private static final String password = "postgres";
    private static final String driver = "org.postgresql.Driver";

    private static Connection conn;
    public static Connection getConn() {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(
                        url, username, password
                );
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }
}
