package sample;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class QueryExec {

    public static ResultSet executeSelect(String select)  {

        try {
            Connection conn=DBConn.connection();
            Statement statement=conn.createStatement();
            return statement.executeQuery(select);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
    public static void executeOthers(String query){
        try {
            Connection conn=DBConn.connection();
            Statement statement=conn.createStatement();
            statement.executeQuery(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void executeInput(String query,String x1,String x2,String x3,String x4,String x5,String x6,String x7,String x8,String x9,String x10,String x11) throws SQLException, ParseException {
        Connection conn=DBConn.connection();
        PreparedStatement preparedStatement=conn.prepareStatement(query);
        preparedStatement.setInt(1,Integer.valueOf(x1));
        preparedStatement.setString(2,x2);
        preparedStatement.setString(3,x3);
        preparedStatement.setString(4,x4);
        preparedStatement.setString(5,x5);
        preparedStatement.setDate(6, new Date(1997,12,1));
       preparedStatement.setString(7,x7);
       preparedStatement.setInt(8,Integer.valueOf(x8));
        preparedStatement.setInt(9,Integer.valueOf(x9));
        preparedStatement.setInt(10,Integer.valueOf(x10));
       preparedStatement.setInt(11,Integer.valueOf(x11));
        preparedStatement.executeUpdate();

        System.out.println("ESSA byniu");


    }
}
