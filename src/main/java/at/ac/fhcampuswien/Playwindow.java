package at.ac.fhcampuswien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Playwindow extends Startseite implements Initializable {


    public TextField player_output;
    public TextField lifes;

    @FXML
    public TextField underlines; //compare
    public TextField letters;    //actual


    public Line hangman1;
    public ImageView hangman2;
    public Line hangman3;
    public Line hangman5;
    public Line hangman4;
    public Line hangman7;
    public Line hangman6;

    public Button buttonA;
    public Button buttonB;
    public Button buttonC;
    public Button buttonD;
    public Button buttonE;
    public Button buttonF;
    public Button buttonG;
    public Button buttonH;
    public Button buttonI;
    public Button buttonJ;
    public Button buttonK;
    public Button buttonL;
    public Button buttonM;
    public Button buttonN;
    public Button buttonO;
    public Button buttonP;
    public Button buttonQ;
    public Button buttonR;
    public Button buttonS;
    public Button buttonT;
    public Button buttonU;
    public Button buttonV;
    public Button buttonW;
    public Button buttonX;
    public Button buttonY;
    public Button buttonZ;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }


    public void ReplaceButtons(Button button) throws IOException {
        for (int i = 0; i < actual.length; i++) {
            if (actual[i].equals(button.getText() + " ")) {
                compare[i] = button.getText() + " ";
                mistakes++;
            }
            actualWord = Arrays.toString(actual).replaceAll("\\[|\\]|,", "");
            compareWord = Arrays.toString(compare).replaceAll("\\[|\\]|,", "");
            letters.setText(actualWord);
            underlines.setText(compareWord);
        }
        if (mistakes == 0) {
            lifescounter--;
        }
        if (actualWord.equals(compareWord)) {
            WinWindow();
            lifescounter = 6;
            close=10;
        }

        Lifecounter();
    }

    public int Lifecounter() throws IOException {
        lifes.setText(String.valueOf(lifescounter));
        mistakes = 0;
        switch (lifescounter) {
            case 5:
                hangman1.setVisible(true);
                break;
            case 4:
                hangman2.setVisible(true);
                break;
            case 3:
                hangman3.setVisible(true);
                break;
            case 2:
                hangman4.setVisible(true);
                break;
            case 1:
                hangman5.setVisible(true);
                break;
            case 0:
                hangman6.setVisible(true);
                hangman7.setVisible(true);
                LooseWindow();
                lifescounter = 6;
                close=20;
                break;

        }
        return lifescounter;
    }

    public static Stage window;


    public void WinWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/win.fxml"));
        Parent root1 = fxmlLoader.load();
        Win playerNameOutput = fxmlLoader.getController();
        playerNameOutput.showInformation(player_output.getText());
        window = new Stage();
        window.setTitle("Hangman");
        window.setScene(new Scene(root1));
        window.show();
        Startseite.closeWindow();
        window.setOnCloseRequest(e -> {
            e.consume(); //damit das fenster bei no nicht schließt
            closeProgram();
        });

    }

    public static void closeWindow() {
        window.close();
    }

    public void LooseWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/loose.fxml"));
        Parent root1 = fxmlLoader.load();
        Loose playerNameOutput = fxmlLoader.getController();
        playerNameOutput.showInformation(player_output.getText());
        playerNameOutput.showWord(actualWord);
        window = new Stage();
        window.setTitle("Hangman");
        window.setScene(new Scene(root1));
        window.show();
        Startseite.closeWindow();
        window.setOnCloseRequest(e -> {
            e.consume(); //damit das fenster bei no nicht schließt
            closeProgram();
        });
    }

    private void closeProgram() {
        boolean answer = ConfirmBox.display("Close Window", "Sure you want to exit?");
        if (answer)
            window.close();
    }

    public void showInformation(String playerName) {
        player_output.setText(playerName);
    }

    public void HideButtonA() throws IOException {
        ReplaceButtons(buttonA);
        buttonA.setVisible(false);
    }

    public void HideButtonB() throws IOException {
        ReplaceButtons(buttonB);
        buttonB.setVisible(false);
    }

    public void HideButtonC() throws IOException {
        ReplaceButtons(buttonC);
        buttonC.setVisible(false);
    }

    public void HideButtonD() throws IOException {
        ReplaceButtons(buttonD);
        buttonD.setVisible(false);
    }

    public void HideButtonE() throws IOException {
        ReplaceButtons(buttonE);
        buttonE.setVisible(false);
    }

    public void HideButtonF() throws IOException {
        ReplaceButtons(buttonF);
        buttonF.setVisible(false);
    }

    public void HideButtonG() throws IOException {
        ReplaceButtons(buttonG);
        buttonG.setVisible(false);
    }

    public void HideButtonH() throws IOException {
        ReplaceButtons(buttonH);
        buttonH.setVisible(false);
    }

    public void HideButtonI() throws IOException {
        ReplaceButtons(buttonI);
        buttonI.setVisible(false);
    }

    public void HideButtonJ() throws IOException {
        ReplaceButtons(buttonJ);
        buttonJ.setVisible(false);
    }

    public void HideButtonK() throws IOException {
        ReplaceButtons(buttonK);
        buttonK.setVisible(false);
    }

    public void HideButtonL() throws IOException {
        ReplaceButtons(buttonL);
        buttonL.setVisible(false);
    }

    public void HideButtonM() throws IOException {
        ReplaceButtons(buttonM);
        buttonM.setVisible(false);
    }

    public void HideButtonN() throws IOException {
        ReplaceButtons(buttonN);
        buttonN.setVisible(false);
    }

    public void HideButtonO() throws IOException {
        ReplaceButtons(buttonO);
        buttonO.setVisible(false);
    }

    public void HideButtonP() throws IOException {
        ReplaceButtons(buttonP);
        buttonP.setVisible(false);
    }

    public void HideButtonQ() throws IOException {
        ReplaceButtons(buttonQ);
        buttonQ.setVisible(false);
    }

    public void HideButtonR() throws IOException {
        ReplaceButtons(buttonR);
        buttonR.setVisible(false);
    }

    public void HideButtonS() throws IOException {
        ReplaceButtons(buttonS);
        buttonS.setVisible(false);
    }

    public void HideButtonT() throws IOException {
        ReplaceButtons(buttonT);
        buttonT.setVisible(false);
    }

    public void HideButtonU() throws IOException {
        ReplaceButtons(buttonU);
        buttonU.setVisible(false);
    }

    public void HideButtonV() throws IOException {
        ReplaceButtons(buttonV);
        buttonV.setVisible(false);
    }

    public void HideButtonW() throws IOException {
        ReplaceButtons(buttonW);
        buttonW.setVisible(false);
    }

    public void HideButtonX() throws IOException {
        ReplaceButtons(buttonX);
        buttonX.setVisible(false);
    }

    public void HideButtonY() throws IOException {
        ReplaceButtons(buttonY);
        buttonY.setVisible(false);
    }

    public void HideButtonZ() throws IOException {
        ReplaceButtons(buttonZ);
        buttonZ.setVisible(false);
    }


}

