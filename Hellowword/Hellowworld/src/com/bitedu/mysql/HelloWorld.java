package com.bitedu.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HelloWorld {
    public static void main(String[] args) {
        Connection connection = null;
        Statement stmt = null;
        try {
            // 加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost/class_13_db?useSSL=false&serverTimezone=UTC",
                            "root",
                            "");
            stmt = connection.createStatement();
            stmt.execute("create database my_jdbc_db");
            if (stmt != null) {
                stmt.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
