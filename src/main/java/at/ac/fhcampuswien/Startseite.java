package at.ac.fhcampuswien;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
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

    @FXML
    public TextField player_input;
    public Button startButton;
    public ComboBox mode;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mode.getItems().addAll(
                "Easy",
                "Challenging"
        );

    }

    public void OpenGame() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/playwindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Playwindow playWindowOutput = fxmlLoader.getController();
            playWindowOutput.showInformation(player_input.getText());
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
        at.ac.fhcampuswien.List.SelectEasyMode();
        at.ac.fhcampuswien.List.SelectModeChallenging();
    }




}

