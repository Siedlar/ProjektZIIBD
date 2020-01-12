package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {

    @FXML
   private Button Przycisk;
    @FXML
    private TextArea textArea1;

    @FXML
    public void onClick(){
        System.out.println("on ekszyn");
        Przycisk.setText("ESZKERE");
        ResultSet resultSet=QueryExec.executeSelect("Select * from employees");
        try {
            while(resultSet.next()){
                String x=resultSet.getString(2);
                textArea1.setText("imie to:"+x);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
