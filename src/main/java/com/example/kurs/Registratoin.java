package com.example.kurs;

import java.io.FileOutputStream;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Registratoin {

    @FXML
    private Button addName;

    @FXML
    private Button addPass;

    @FXML
    private Button addSurname;

    @FXML
    private Button daleeReg;

    @FXML
    private TextField nameReg;

    @FXML
    private TextField passReg;

    @FXML
    private TextField surnameReg;

    @FXML
    void initialize() {
        addName.setOnAction(clik -> {
            try {
                String line=(nameReg.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\Артём\\IdeaProjects\\kurs\\src\\main\\resources\\com\\example\\kurs\\nameReg.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Имя сохранено");
            } catch (Exception e) {
                System.out.println("Имя не удалось сохранить");
            }
        });
        addSurname.setOnAction(clik -> {
            try {
                String line=(surnameReg.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\Артём\\IdeaProjects\\kurs\\src\\main\\resources\\com\\example\\kurs\\surnameReg.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Фамилия сохранена");
            } catch (Exception e) {
                System.out.println("Фамилию не удалось сохранить");
            }
        });
        addPass.setOnAction(clik -> {
            try {
                String line=(passReg.getText());
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\Артём\\IdeaProjects\\kurs\\src\\main\\resources\\com\\example\\kurs\\passReg.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Пароль сохранен");
            } catch (Exception e) {
                System.out.println("Пароль не удалось сохранить");
            }
        });
        daleeReg.setOnAction(clik -> {
            try {


                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("oknoAvt.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Магазин спортивного питания");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

}




