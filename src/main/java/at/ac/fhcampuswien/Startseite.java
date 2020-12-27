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

import java.net.URL;
import java.util.ResourceBundle;

public class Startseite implements Initializable {


    public TextField player_input;
    public Button startButton;
    public ComboBox<String> mode;
    public static String easyWord = List.EasyRandomWords();
    public static String mediumWord = List.MediumRandomWords();
    public static String challengingWord = List.ChallengingRandomWords();
    public static String[] actual = new String[easyWord.length()];
    public static String[] compare = new String[easyWord.length()];
    public static String actualWord;
    public static String compareWord;
    public static String startunderlines="";
    public static int lifescounter = 6;
    public static int mistakes = 0;
    public static int close=0;
    public static Stage window;
    public Label warning;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mode.getItems().addAll(
                "Easy", "Medium"
                , "Challenging"
        );

    }

    public void OpenGame() { //StartButton
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/playwindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Playwindow playerNameOutput = fxmlLoader.getController();
            if (player_input.getText().equals("")){
                player_input.setText("Anonymous");
            }
            playerNameOutput.showInformation(player_input.getText()); //TODO playerinput darf nicht empty sein, falls empty ->popup
            playerNameOutput.Lifecounter();
            easyWord = List.EasyRandomWords();
            mediumWord = List.MediumRandomWords();
            challengingWord = List.ChallengingRandomWords();

            if (mode.getValue().equals("Easy")) {
                actual = new String[easyWord.length()];
                compare = new String[easyWord.length()];
                for (int i=0; i<easyWord.length();i++){
                    startunderlines=startunderlines+"_  ";
                }
                playerNameOutput.underlines.setText(startunderlines);
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
                playerNameOutput.underlines.setText(startunderlines);
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
                playerNameOutput.underlines.setText(startunderlines);
                for (int i = 0; i < challengingWord.length(); i++) {
                    actual[i] = ((challengingWord.charAt(i)) + " ");
                    compare[i] = ("_ ");
                }
            }

            window = new Stage();
            window.setTitle("Hangman");
            window.setScene(new Scene(root1));
            window.getIcons().add(new Image("/icon2.png"));
            window.show();
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
                e.consume(); //damit das fenster bei no nicht schließt
                closeProgram();
            });
        } catch (Exception e) {
            warning.setVisible(true);
        }

    }

    private void closeProgram() {
        Boolean answer = ConfirmBox.display("Close Window", "Sure you want to exit?");
        if (answer)
            closeProgram2();
    }

    private void closeProgram2() {
        Boolean answer = ConfirmBox2.display("Close Window", "Are you really sure?");
        if (answer)
            closeProgram3();
    }

    private void closeProgram3() {
        Boolean answer = ConfirmBox3.display("Close Window", "Are you 100% sure?");
        if (answer)
            window.close();
    }
    public static void closeWindow() {
        window.close();
    }
}

