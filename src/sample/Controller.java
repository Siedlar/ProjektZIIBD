package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Controller {
    private Label label;
@FXML
    VBox Vboxid;
    @FXML
   private Button Przycisk;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private Label label1;

    @FXML
    public void onClick( ) throws SQLException {
        if(radioButton1.isSelected()) {

        String zapytanie=("Select * from employees");
        label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton2.isSelected()){
            String zapytanie2=("Select first_name,last_name,salary from employees where salary >12000");
            label1.setText(Funkszyn.wykonaj(zapytanie2));
        }
        }
    }

