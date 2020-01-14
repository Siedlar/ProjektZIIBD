package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;

public class Controller {
    private Label label;
    @FXML
   private Button Przycisk;
    @FXML
    private BorderPane bpid;
    @FXML
    private TextField x1;
    @FXML
    private TextField x2;
    @FXML
    private TextField x3;
    @FXML
    private TextField x4;
    @FXML
    private TextField x5;
    @FXML
    private TextField x6;
    @FXML
    private TextField x7;
    @FXML
    private TextField x8;
    @FXML
    private TextField x9;
    @FXML
    private TextField x10;
    @FXML
    private TextField x11;

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
    private ScrollPane spid;
@FXML
public void wykonaj() throws SQLException, ParseException {
    String zapytanie=("INSERT INTO EMPLOYEES (EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID) VALUES(?,?,?,?,?,?,?)");
    QueryExec.executeInput(zapytanie,x1.getText(),x2.getText(),x3.getText(),x4.getText(),x5.getText(),x6.getText(),x7.getText(),x8.getText(),x9.getText(),x10.getText(),x11.getText());

}
    @FXML
    public void onClick( ) throws SQLException, IOException {
        if(radioButton1.isSelected()) {

        String zapytanie=("Select * from employees");
        label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton2.isSelected()){
            String zapytanie=("Select first_name,last_name,salary from employees where salary >12000");
            label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton3.isSelected()){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("input.fxml"));
            bpid.setCenter(pane);




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

