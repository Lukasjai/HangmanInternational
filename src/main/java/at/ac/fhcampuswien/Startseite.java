package at.ac.fhcampuswien;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Startseite implements Initializable {


    public TextField player;
    public Button startButton;
    public ComboBox mode;
    List<String> EasyMode= new ArrayList<String>();
    List<String> ChallengingMode= new ArrayList<String>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> list = FXCollections.observableArrayList("Easy", "Challenging");
        mode.setItems(list);
    }

    public void OpenGame() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/playwindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Hangman");
            stage.setScene(new Scene(root1));
            stage.show();
            App.closeWindow();
        } catch (Exception e) {
            System.out.println("Cant load Game");
        }
    }

    public void SelectMode() {
        EasyMode.add("twenty");
        EasyMode.add("orange");
        EasyMode.add("market");
        EasyMode.add("coffee");
        EasyMode.add("nature");
        EasyMode.add("people");
        EasyMode.add("mirror");
        EasyMode.add("family");
        EasyMode.add("office");
        EasyMode.add("silver");
        EasyMode.add("parent");
        EasyMode.add("period");
    }
    public void SelectModeChallenging(){
        ChallengingMode.add("strawberry");
        ChallengingMode.add("basketball");
        ChallengingMode.add("perfection");
        ChallengingMode.add("technology");
        ChallengingMode.add("watermelon");
        ChallengingMode.add("government");
        ChallengingMode.add("friendship");
        ChallengingMode.add("university");
        ChallengingMode.add("helicopter");
        ChallengingMode.add("generation");
        ChallengingMode.add("apocalypse");
        ChallengingMode.add("restaurant");
    }




}

