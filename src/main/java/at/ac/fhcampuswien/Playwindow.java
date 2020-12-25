package at.ac.fhcampuswien;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ResourceBundle;

public class Playwindow implements Initializable {


    public TextField player_output;
    public TextField lifes;


    public TextField underlines;
    public TextField letters;


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

    public Label LabelTry=new Label();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    public void HideButtonA(){
        buttonA.setVisible(false);
    }
    public void HideButtonB(){
        buttonB.setVisible(false);
    }

    public void showInformation(String playerName) {
        player_output.setText(playerName);
    }

   /* public void showUnderlinesEasy(String underlines){
        underlines.setText(underlines);

    }*/
}

