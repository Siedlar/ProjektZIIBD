package sample;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Funkszyn {
        public static String wykonaj(String zapytanie) throws SQLException {
            ResultSet resultSet = QueryExec.executeSelect(zapytanie);
            ResultSetMetaData resultMD=resultSet.getMetaData();
            int columnCount=resultMD.getColumnCount();
            String wynik="";
            while(resultSet.next()){
            for (int i=1;i<=columnCount;i++){
                if(resultMD.getColumnTypeName(i)=="NUMBER"){
                    wynik=wynik+" "+resultMD.getColumnName(i)+" = "+ Integer.toString(resultSet.getInt(i));
                }else if(resultMD.getColumnTypeName(i)=="VARCHAR"||resultMD.getColumnTypeName(i)=="VARCHAR2"){
                    wynik=wynik+" "+resultMD.getColumnName(i)+" = "+resultSet.getString(i);
                }
                else if(resultMD.getColumnTypeName(i)=="DATE"){
                    wynik=wynik+" "+resultMD.getColumnName(i)+" = "+resultSet.getDate(i);
                }
            }
    wynik=wynik+ "\n";
            }
            return wynik;
            }

}
