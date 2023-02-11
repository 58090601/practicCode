package com.example.kurs;

import javafx.fxml.FXML;
import  javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Oshibka {


    @FXML
    private Button povtorButton;

    @FXML
    void initialize() {
        povtorButton.setOnAction(clik->{
            povtorButton.getScene().getWindow().hide();
            try{
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("oknoAvt.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Магазин спортивного питания");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });
    }

}


