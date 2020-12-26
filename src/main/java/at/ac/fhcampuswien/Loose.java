package at.ac.fhcampuswien;

import at.ac.fhcampuswien.Playwindow;
import at.ac.fhcampuswien.Startseite;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Loose {
    public Button tryAgainButton;
    public TextField nameLost;
    public static Stage window;
    public Label WordOutput;
    public Label WordWas;

    public void TryAgain() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/startseite.fxml"));
        Parent root1 = fxmlLoader.load();
        window = new Stage();
        window.setTitle("Hangman");
        window.setScene(new Scene(root1));
        window.show();
        Playwindow.closeWindow();
        Startseite.closeWindow();

    }



    public void showInformation(String playerName) {
        nameLost.setText(playerName);
    }
    public static void closeWindow() {
        window.close();
    }
    public void showWord(String word){
        WordOutput.setText(word);
    }



}
