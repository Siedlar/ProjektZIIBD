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
    private Label label2;
    @FXML
   private Button Przycisk;
    @FXML
    private Label label4;
    @FXML
    private BorderPane bpid;
    @FXML
    private TextField z1;
    @FXML
    private TextField z2;
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
    private TextField y1;

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
    private Label label3;
@FXML
public void wykonaj() throws SQLException, ParseException {
    String zapytanie=("INSERT INTO EMPLOYEES VALUES(?,?,?,?,?,?,?,?,?,?,?)");
    QueryExec.executeInput(zapytanie,x1.getText(),x2.getText(),x3.getText(),x4.getText(),x5.getText(),x6.getText(),x7.getText(),x8.getText(),x9.getText(),x10.getText(),x11.getText());
    label2.setText("Dane zostały poprawnie dodane do bazy danych!!!");
}
@FXML
    public void wykonaj2() throws SQLException {
        String zapytanie="DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID=?";
        QueryExec.executeDelete(zapytanie,y1.getText());
        label3.setText("Dane zostały poprawnie usunięte z bazy danych!!!");
    }
    @FXML
    public void wykonaj3() throws SQLException {
        String zapytanie="UPDATE EMPLOYEES SET SALARY=SALARY+? WHERE EMPLOYEE_ID=?";
        QueryExec.executeUpdate(zapytanie,z1.getText(),z2.getText());
        label4.setText("Dane zostały poprawnie zaktualizowane !!!");
    }
    @FXML
    public void onClick( ) throws SQLException, IOException {
        if(radioButton1.isSelected()) {
            bpid.setCenter(spid);
        String zapytanie=("Select * from employees");
        label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton2.isSelected()){
            bpid.setCenter(spid);
            String zapytanie=("Select first_name,last_name,salary from employees where salary >12000");
            label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton3.isSelected()){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("input.fxml"));
            bpid.setCenter(pane);

        }
        else if(radioButton4.isSelected()){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("delete.fxml"));
            bpid.setCenter(pane);


        }
        else if(radioButton5.isSelected()){
            AnchorPane pane = FXMLLoader.load(getClass().getResource("update.fxml"));
            bpid.setCenter(pane);

        }
        else if(radioButton6.isSelected()){
            bpid.setCenter(spid);
            String zapytanie=("Select e.first_name,e.last_name,e.department_id,d.department_name from employees e join departments d on(e.department_id=d.department_id)");
            label1.setText(Funkszyn.wykonaj(zapytanie));

        }
        else if(radioButton7.isSelected()){

            bpid.setCenter(spid);
            String zapytanie=("Select e.first_name,e.last_name,p.first_name,p.last_name from employees e join employees p on(e.manager_id=p.employee_id)");
            label1.setText(Funkszyn.wykonaj(zapytanie));

        }
        else if(radioButton8.isSelected()){
            bpid.setCenter(spid);
            String zapytanie=("Select d.department_name,c.country_name,l.city from departments d join locations l on(d.location_id=l.location_id) join countries c on(l.country_id=c.country_id)");
            label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton9.isSelected()){
            bpid.setCenter(spid);
            String zapytanie=("SELECT last_name from employees where last_name like 'H%' Or last_name like 'W%'");
            label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton10.isSelected()){
            bpid.setCenter(spid);
            String zapytanie=("select d.department_name,avg(e.salary) as \"Srednia\" from departments d join employees e on(d.department_id=e.department_id) group by department_name");
            label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton11.isSelected()){
            bpid.setCenter(spid);
            String zapytanie=("SELECT last_name,job_id from employees where manager_id IS NULL");
            label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        else if(radioButton12.isSelected()){
            bpid.setCenter(spid);
            String zapytanie=("SELECT MAX(salary)-MIN(SALARY) \"DIFFERENCE\" from employees");
            label1.setText(Funkszyn.wykonaj(zapytanie));

        }
        else if(radioButton13.isSelected()){
            bpid.setCenter(spid);
            String zapytanie=("SELECT first_name,last_name,hire_date from employees where to_char(hire_date,'yyyy') <1997");
            label1.setText(Funkszyn.wykonaj(zapytanie));
        }
        }
    }

