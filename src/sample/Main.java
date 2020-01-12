package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("PROJEKT ZIIBD");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {
        launch(args);
        ResultSet resultSet=QueryExec.executeSelect("Select * from employees");
        try {
            while(resultSet.next()){
                String x=resultSet.getString(2);
                System.out.println(x);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
