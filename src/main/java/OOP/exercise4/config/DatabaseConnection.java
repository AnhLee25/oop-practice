package OOP.exercise4.config;

import OOP.exercise4.constants.DatabaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static Connection connection = null;
    
    private DatabaseConnection() {}
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                //                Class.forName("com.mysql.jdbc.Driver");
                connection =
                        DriverManager.getConnection(DatabaseConfig.url, DatabaseConfig.user, DatabaseConfig.password);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
