package sample;

import java.sql.*;

public class DBConn {
    private static String url="jdbc:oracle:thin:@155.158.112.45:1521:oltpstud";
    private static String username="ziibd35";
    private static String password="haslo1";

    public static Connection connection(){
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }
}