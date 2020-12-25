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

import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Startseite implements Initializable {


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
            Playwindow playerNameOutput = fxmlLoader.getController();
            playerNameOutput.showInformation(player_input.getText()); //TODO playerinput darf nicht empty sein, falls empty ->popup
            if (mode.getValue().equals("Easy")) {

                String easyWord = List.EasyRandomWords();

                String[] actual = new String[easyWord.length()];
                String[] compare = new String[easyWord.length()];

                for (int i = 0; i < easyWord.length(); i++) {
                    actual[i] = ((easyWord.charAt(i)) + " ");
                    compare[i] = ("_ ");
                }
                String actualword = Arrays.toString(actual).replaceAll("\\[|\\]|," , "");
                String comapareword = Arrays.toString(compare).replaceAll("\\[|\\]|," , "");

                playerNameOutput.letters.setText(actualword);
                playerNameOutput.underlines.setText(comapareword);

            } else if (mode.getValue().equals("Challenging")) {
                playerNameOutput.underlines.setText("_ _ _ _ _ _ _ _ _ _ _ _");
            }
            Stage stage = new Stage();
            stage.setTitle("Hangman");
            stage.setScene(new Scene(root1));
            stage.show();
            //App.closeWindow();
        } catch (Exception e) {
            System.out.println("Cant load Game");
        }

    }

}

