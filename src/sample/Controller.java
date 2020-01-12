package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {
    private Label label;

    @FXML
   private Button Przycisk;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private Label label1;

    @FXML
    public void onClick( ){
        label1.setText("");
        if(radioButton1.isSelected()) {
            System.out.println("on ekszyn");
            ResultSet resultSet = QueryExec.executeSelect("Select * from employees");
            try {
                while (resultSet.next()) {
                    String x = resultSet.getString(2);
                    String x2 = resultSet.getString(3);


                    label1.setText("Imie: " + x + " Nazwisko " + x2 + " \n" + label1.getText());

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        else if(radioButton2.isSelected()){
            System.out.println("on ekszyn");
            ResultSet resultSet = QueryExec.executeSelect("Select first_name,last_name,salary from employees where salary >5000");
            try {
                while (resultSet.next()) {
                    String x = resultSet.getString(1);
                    String x2 = resultSet.getString(2);
                    int x3 = resultSet.getInt(3);

                    label1.setText("Imie: " + x + " Nazwisko " + x2 + " wynagrodzenie "+x3+ " \n" + label1.getText());

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
