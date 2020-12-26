package at.ac.fhcampuswien;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Startseite implements Initializable {


    public TextField player_input;
    public Button startButton;
    public ComboBox<String> mode;
    public static String easyWord = List.EasyRandomWords();
    public static String mediumWord = List.MediumRandomWords();
    public static String challengingWord= List.ChallengingRandomWords();
    public static String[] actual = new String[easyWord.length()];
    public static String[] compare = new String[easyWord.length()];
    public static String actualWord;
    public static String compareWord;
    public static int lifescounter=6;
    public static int mistakes=0;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mode.getItems().addAll(
                "Easy","Medium"
                ,"Challenging"
        );

    }

    public void OpenGame() { //StartButton
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/playwindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Playwindow playerNameOutput = fxmlLoader.getController();
            playerNameOutput.showInformation(player_input.getText()); //TODO playerinput darf nicht empty sein, falls empty ->popup
            playerNameOutput.Lifecounter();

            if (mode.getValue().equals("Easy")) {
                actual=new String[easyWord.length()];
                compare=new String[easyWord.length()];
                for (int i = 0; i < easyWord.length(); i++) {
                    actual[i] = ((easyWord.charAt(i)) + " ");
                    compare[i] = ("_ ");
                }

            } else if (mode.getValue().equals("Medium")) {
                actual=new String[mediumWord.length()];
                compare=new String[mediumWord.length()];
                for (int i = 0; i < mediumWord.length(); i++) {
                    actual[i] = ((mediumWord.charAt(i)) + " ");
                    compare[i] = ("_ ");
                }
            } else if (mode.getValue().equals("Challenging")){
                actual=new String[challengingWord.length()];
                compare=new String[challengingWord.length()];
                for (int i = 0; i < challengingWord.length(); i++) {
                    actual[i] = ((challengingWord.charAt(i)) + " ");
                    compare[i] = ("_ ");
                }
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

