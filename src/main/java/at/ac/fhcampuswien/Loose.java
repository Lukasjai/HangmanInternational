package at.ac.fhcampuswien;

import at.ac.fhcampuswien.Playwindow;
import at.ac.fhcampuswien.Startseite;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Loose {
    public Button tryAgainButton;
    public TextField nameLost;

    public void TryAgain(ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/startseite.fxml"));
        Parent root1 = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Hangman");
        stage.setScene(new Scene(root1));
        stage.show();
        //App.closeWindow();


    }

    public void showInformation(String playerName) {
        nameLost.setText(playerName);
    }

}
