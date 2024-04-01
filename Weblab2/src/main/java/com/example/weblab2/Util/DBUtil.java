package com.example.weblab2.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
    private static Connection con;
    private static final String URL = "jdbc:mysql://localhost:3306/postgres";
    private static final String USERNAME = "mmsuser";
    private static final String PASSWORD = "test1234";
    private static final Connection createConnection() {
        // 连接数据库的代码
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
        return con;
    }

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                createConnection();
            }
        } catch (SQLException e) {
            e.printStackTrace();
    }
        return con;
    }
   public static void close() {
       try {
           if (!con.isClosed()) {
               con.close();
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
   public static void close(PreparedStatement ps, Connection con) {
       try {
           if (!ps.isClosed()) {
               ps.close();
           }
           if (!con.isClosed()) {
               con.close();
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }

}
