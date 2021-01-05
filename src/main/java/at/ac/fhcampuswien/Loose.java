package at.ac.fhcampuswien;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Loose {
    //create variables
    public Button tryAgainButton;
    public Label nameLost;
    public static Stage window;
    public Label WordOutput;
    public Label WordWas;

    //if you click the try again button you will get back to the first window
    public void tryAgain() throws Exception {
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
        nameLost.setText(playerName);
    }

    // Close window for loose
    public static void closeWindow() {
        window.close();
    }

    // Method to show the right word and print it
    public void showWord(String word){
        WordOutput.setText(word);
    }




}
