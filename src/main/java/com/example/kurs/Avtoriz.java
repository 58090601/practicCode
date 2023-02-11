package com.example.kurs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Avtoriz {

    @FXML
    private TextField nameAvt;

    @FXML
    private TextField passAvt;

    @FXML
    private TextField surnameAvt;

    @FXML
    private Button voiti;

    @FXML
    void initialize() {
        voiti.setOnAction(clik -> {
            voiti.setText("Спасибо за регистрацию ");
            System.out.println("Имя: " + nameAvt.getText());
            System.out.println("Фамилия: " + surnameAvt.getText());
            System.out.println("Пароль: " + passAvt.getText());
            voiti.getScene().getWindow().hide();

            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Артём\\IdeaProjects\\kurs\\src\\main\\resources\\com\\example\\kurs\\nameReg.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(surnameAvt.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("DataTable.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Магазин спортивного питания");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("Oshibka.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Магазин спортивного питания ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Артём\\IdeaProjects\\kurs\\src\\main\\resources\\com\\example\\kurs\\surnameReg.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.equals(passAvt.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("DataTable.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Магазин спортивного питания");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("Oshibka.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Магазин спортивного питания ");
                    }
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Артём\\IdeaProjects\\kurs\\src\\main\\resources\\com\\example\\kurs\\passReg.txt")) {
                };
                String line;
                while ((line = reader.readLine()) != null) {

                    if (line.equals(nameAvt.getText().trim())){
                        try {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("DataTable.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Магазин спортивного питания");
                        } catch (Exception e) {
                            FXMLLoader loader = new FXMLLoader();
                            loader.setLocation(getClass().getResource("Oshibka.fxml"));
                            loader.load();
                            Parent root = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(root));
                            stage.show();
                            stage.setTitle("Магазин спортивного питания");
                            e.printStackTrace();
                        }


                    }else {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(getClass().getResource("Oshibka.fxml"));
                        loader.load();
                        Parent root = loader.getRoot();
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root));
                        stage.show();
                        stage.setTitle("Магазин спортивнго питания");
                    }

                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

}








