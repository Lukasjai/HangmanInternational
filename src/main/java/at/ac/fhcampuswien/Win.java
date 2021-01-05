package at.ac.fhcampuswien;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Win {
    public Button tryAgainButton;
    public Label nameWon;
    public static Stage window;
    public Label WordOutputwin;


    //if you click the try again button you will get back to the first window
    public void tryAgain(ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/homepage.fxml"));
        Parent root1 = fxmlLoader.load();
        window = new Stage();
        window.setTitle("Hangman");
        window.setScene(new Scene(root1));
        window.getIcons().add(new Image("/icon2.png"));
        window.show();
        Playwindow.closeWindow();
    }

    // get the name of the Player and print it
    public void showInformation(String playerName) {
        nameWon.setText(playerName);
    }
    // Close window for win
    public static void closeWindow() {
        window.close();
    }
    // Method to show the right word and print it
    public void showWordwin(String word){
        WordOutputwin.setText(word);
    }
}
