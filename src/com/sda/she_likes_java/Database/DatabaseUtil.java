package com.sda.she_likes_java.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    //    handel internally
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/databases/jdbc",
                    "sa",
                    "");
        } catch (SQLException e) {
            return null;
        }
    }

    //declare
    public static Connection getConnectionButSometimesThrowException() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/databases/jdbc",
                "sa",
                "");
    }
}


;




