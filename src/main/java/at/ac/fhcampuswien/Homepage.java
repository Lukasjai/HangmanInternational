package at.ac.fhcampuswien;


import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class Homepage implements Initializable {

    //define the buttons and text field
    public TextField player_input;
    public Button startButton;
    public ComboBox<String> mode;
    public static String[] actual;
    public static String[] compare;
    public static String actualWord;
    public static String compareWord;
    public static String startunderlines="";
    public static int lifescounter = 6;
    public static int mistakes = 0;
    public static int close=0;
    public static Stage window;
    public Label warning;
    public static String easyWord;
    public static String mediumWord;
    public static String challengingWord;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mode.getItems().addAll(
                "Easy", "Medium"
                , "Challenging"
        );

    }
    //This function starts by hitting the start button
    public void openGame() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/playwindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Playwindow playwindowController = fxmlLoader.getController();
            //If there is no input for the playername the name is anonymous
            if (player_input.getText().equals("")){
                player_input.setText("Anonymous");
            }
            playwindowController.showPlayerName(player_input.getText());
            playwindowController.lifeCounter();
            easyWord = List.easyRandomWords();
            mediumWord = List.mediumRandomWords();
            challengingWord = List.challengingRandomWords();

            // If statement to get the right chosen mode
            //then one array gets filled with the random word
            //and the other one with is printed in the next window is filled with underlines
            if (mode.getValue().equals("Easy")) {
                actual = new String[easyWord.length()];
                compare = new String[easyWord.length()];
                for (int i=0; i<easyWord.length();i++){
                    startunderlines=startunderlines+"_  ";
                }
                playwindowController.underlines.setText(startunderlines);
                for (int i = 0; i < easyWord.length(); i++) {
                    actual[i] = ((easyWord.charAt(i)) + " ");
                    compare[i] = ("_ ");
                }

            } else if (mode.getValue().equals("Medium")) {
                actual = new String[mediumWord.length()];
                compare = new String[mediumWord.length()];
                for (int i=0; i<mediumWord.length();i++){
                    startunderlines=startunderlines+"_  ";
                }
                playwindowController.underlines.setText(startunderlines);
                for (int i = 0; i < mediumWord.length(); i++) {
                    actual[i] = ((mediumWord.charAt(i)) + " ");
                    compare[i] = ("_ ");
                }
            } else if (mode.getValue().equals("Challenging")) {
                actual = new String[challengingWord.length()];
                compare = new String[challengingWord.length()];
                for (int i=0; i<challengingWord.length();i++){
                    startunderlines=startunderlines+"_  ";
                }
                playwindowController.underlines.setText(startunderlines);
                for (int i = 0; i < challengingWord.length(); i++) {
                    actual[i] = ((challengingWord.charAt(i)) + " ");
                    compare[i] = ("_ ");
                }
            }

            //the Second Window "Playwindow" gets opened
            window = new Stage();
            window.setTitle("Hangman");
            window.setScene(new Scene(root1));
            window.getIcons().add(new Image("/icon2.png"));
            window.show();
            //
            if(close==0){
                App.closeWindow();
            }
            else if (close==10){
                Win.closeWindow();
            }
            else {
                Loose.closeWindow();
            }
            window.setOnCloseRequest(e -> {
                e.consume();                //if you press no the window doesnt close
                closeProgram();
            });
        } catch (Exception e) {
            warning.setVisible(true);
        }
    }

    //The following 3 try and catch methods are to secure that there is a File  with this name
    //otherwise the system prints out file not found but did not crash
    static {
        try {
            easyWord = List.easyRandomWords();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }

    static {
        try {
            mediumWord = List.mediumRandomWords();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }

    static {
        try {
            challengingWord = List.challengingRandomWords();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        }
    }

    //are you really sure second window popup
    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Close Window", "Sure you want to exit?");
        if (answer)
            closeProgram2();
    }
    //are you 100% sure third window popup
    private void closeProgram2() {
        Boolean answer = ConfirmBox2.display("Close Window", "Are you really sure?");
        if (answer)
            closeProgram3();
    }
    // to close a window :)
    private void closeProgram3() {
        Boolean answer = ConfirmBox3.display("Close Window", "Are you 100% sure?");
        if (answer)
            window.close();
    }
    // to close a window :)
    public static void closeWindow() {
        window.close();
    }
}

