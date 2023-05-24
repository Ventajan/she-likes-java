package com.sda.she_likes_java.Database;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection con1 = DatabaseUtil.getConnection();

        try {
            DatabaseUtil.getConnectionButSometimesThrowException();
        } catch (SQLException e) {

            System.out.println("I need to handle it");
        }
    }
}
