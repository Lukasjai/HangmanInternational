package at.ac.fhcampuswien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

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
    public Circle hangman2;
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
    public void ReplaceButtons(Button button){
        for (int i = 0; i < easyWord.length(); i++) {
            actual[i] = ((easyWord.charAt(i)) + " ");
            compare[i] = ("_ ");
        }

        for (int i = 0; i < actual.length; i++) {
            if (actual[i].equals(button.getText() + " ")) {
                compare[i] = button.getText() + " ";
            }

            actualWord = Arrays.toString(actual).replaceAll("\\[|\\]|," , "");
            compareWord = Arrays.toString(compare).replaceAll("\\[|\\]|," , "");
            letters.setText(actualWord);
            underlines.setText(compareWord);

        }
    }

    public void showInformation(String playerName) {
        player_output.setText(playerName);
    }

    public void HideButtonA() {
        ReplaceButtons(buttonA);
        buttonA.setVisible(false);
    }

    public void HideButtonB() {
        ReplaceButtons(buttonB);
        buttonB.setVisible(false);
    }

    public void HideButtonC() {
        ReplaceButtons(buttonC);
        buttonC.setVisible(false);
    }
    public void HideButtonD() {
        ReplaceButtons(buttonD);
        buttonD.setVisible(false);
    }

    public void HideButtonE() {
        ReplaceButtons(buttonE);
        buttonE.setVisible(false);
    }
    public void HideButtonF() {
        ReplaceButtons(buttonF);
        buttonF.setVisible(false);
    }
    public void HideButtonG() {
        ReplaceButtons(buttonG);
        buttonG.setVisible(false);
    }
    public void HideButtonH() {
        ReplaceButtons(buttonH);
        buttonH.setVisible(false);
    }
    public void HideButtonI() {
        ReplaceButtons(buttonI);
        buttonI.setVisible(false);
    }
    public void HideButtonJ() {
        ReplaceButtons(buttonJ);
        buttonJ.setVisible(false);
    }
    public void HideButtonK() {
        ReplaceButtons(buttonK);
        buttonK.setVisible(false);
    }
    public void HideButtonL() {
        ReplaceButtons(buttonL);
        buttonL.setVisible(false);
    }
    public void HideButtonM() {
        ReplaceButtons(buttonM);
        buttonM.setVisible(false);
    }
    public void HideButtonN() {
        ReplaceButtons(buttonN);
        buttonN.setVisible(false);
    }
    public void HideButtonO() {
        ReplaceButtons(buttonO);
        buttonO.setVisible(false);
    }
    public void HideButtonP() {
        ReplaceButtons(buttonP);
        buttonP.setVisible(false);
    }
    public void HideButtonQ() {
        ReplaceButtons(buttonQ);
        buttonQ.setVisible(false);
    }
    public void HideButtonR() {
        ReplaceButtons(buttonR);
        buttonR.setVisible(false);
    }
    public void HideButtonS() {
        ReplaceButtons(buttonS);
        buttonS.setVisible(false);
    }
    public void HideButtonT() {
        ReplaceButtons(buttonT);
        buttonT.setVisible(false);
    }
    public void HideButtonU() {
        ReplaceButtons(buttonU);
        buttonU.setVisible(false);
    }
    public void HideButtonV() {
        ReplaceButtons(buttonV);
        buttonV.setVisible(false);
    }
    public void HideButtonW() {
        ReplaceButtons(buttonW);
        buttonW.setVisible(false);
    }
    public void HideButtonX() {
        ReplaceButtons(buttonX);
        buttonX.setVisible(false);
    }
    public void HideButtonY() {
        ReplaceButtons(buttonY);
        buttonY.setVisible(false);
    }
    public void HideButtonZ() {
        ReplaceButtons(buttonZ);
        buttonZ.setVisible(false);
    }


}

