package sample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
}
