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
    private RadioButton radioButton3;
    @FXML
    private RadioButton radioButton4;
    @FXML
    private RadioButton radioButton5;
    @FXML
    private RadioButton radioButton6;
    @FXML
    private RadioButton radioButton7;
    @FXML
    private RadioButton radioButton8;
    @FXML
    private RadioButton radioButton9;
    @FXML
    private RadioButton radioButton10;
    @FXML
    private RadioButton radioButton11;
    @FXML
    private RadioButton radioButton12;
    @FXML
    private RadioButton radioButton13;
    @FXML
    private Label label1;

    @FXML
    public void onClick( ) throws SQLException {
        if(radioButton1.isSelected()) {

        String zapytanie=("Select * from employees");
        label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton2.isSelected()){
            String zapytanie=("Select first_name,last_name,salary from employees where salary >12000");
            label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton3.isSelected()){

        }
        else if(radioButton4.isSelected()){

        }
        else if(radioButton5.isSelected()){

        }
        else if(radioButton6.isSelected()){

        }
        else if(radioButton7.isSelected()){

        }
        else if(radioButton8.isSelected()){

        }
        else if(radioButton9.isSelected()){

        }
        else if(radioButton10.isSelected()){

        }
        else if(radioButton11.isSelected()){

        }
        else if(radioButton12.isSelected()){

        }
        else if(radioButton13.isSelected()){

        }
        }
    }

