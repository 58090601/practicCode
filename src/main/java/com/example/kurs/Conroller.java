package com.example.kurs;

import  javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;



public class Conroller {

    @FXML
    private Button ZakazatButton;

    @FXML
    private Button addTovar;

    @FXML
    private Button deleteButton;

    @FXML
    private TableColumn<Klient, String> modelColumn;

    @FXML
    private TableColumn<Klient, Integer> pricecolumn;

    @FXML
    private TableColumn<Klient, String> vidDobavokColumn;
    @FXML
    private TextField inputModel;

    @FXML
    private TextField inputPrice;

    @FXML
    private TextField inputVidDobavok;

    @FXML
    private TableView<Klient> tableview;

    ObservableList<Klient> klients = FXCollections.observableArrayList();

    @FXML
    void initialize() {
       ZakazatButton.setOnAction(clik -> {
            try {
                String line = ("Вид добавок : "+" "+inputVidDobavok.getText()+" ");
                String line2=("Модель : "+inputModel.getText()+" ");
                String line3=("Цена : "+inputPrice.getText()+" ");
                FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\Артём\\IdeaProjects\\kurs\\src\\main\\resources\\com\\example\\kurs\\dannye.txt");
                byte[] buffer=line.getBytes();
                fileOutputStream.write(buffer);
                buffer=line2.getBytes();
                fileOutputStream.write(buffer);
                buffer=line3.getBytes();
                fileOutputStream.write(buffer);
                System.out.println("Удачно сохранено");
                ZakazatButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("theEnd.fxml"));
                loader.load();
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();
                stage.setTitle("Магазин спортивного питания");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        });

        vidDobavokColumn.setCellValueFactory(new PropertyValueFactory<Klient, String>("Вид добавки"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<Klient, String>("Модель"));
        pricecolumn.setCellValueFactory(new PropertyValueFactory<Klient, Integer>("Цена"));
    }

    @FXML
    public void submit(ActionEvent event) {
        Klient klient = new Klient(inputVidDobavok.getText(),
                (inputModel.getText()),
                Integer.parseInt(inputPrice.getText()));
        klients.add(klient);
        tableview.setItems(klients);
    }

    @FXML
    public void removeCustomer(ActionEvent event) {
        int selectedID = tableview.getSelectionModel().getSelectedIndex();
        tableview.getItems().remove(selectedID);
    }

}





