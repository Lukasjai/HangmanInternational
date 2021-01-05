package at.ac.fhcampuswien;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Playwindow extends Homepage implements Initializable {

    // create Label und Buttons
    public Label player_output;
    public Label lifes;

    @FXML
    public Label underlines; //compare
    public Label letters;    //actual


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

    //default Interface
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    //Function for all Buttons to compare their letter with the searched word and write it in the array
    // Here we use two Arrays one to compare the letter of the pressed Button
    // and the other is used to print out at the window and add the new letters if they are right
    // if the letter is wrong the lifecounter is decreased
    public void replaceButtons(Button button) throws IOException {
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
            winWindow();
            lifescounter = 6;
            close = 10;
            startunderlines = "";
        }

        lifeCounter();
    }

    //Function that makes visible our Hangman by decreased lifes
    public int lifeCounter() throws IOException {
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
                looseWindow();
                lifescounter = 6;
                close = 20;
                startunderlines = "";
                break;

        }
        return lifescounter;
    }

    public static Stage window;

    //if the word is completed and the lifecounter is higher than 0 the Winwindow is opened
    public void winWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/win.fxml"));
        Parent root1 = fxmlLoader.load();
        Win playerNameOutput = fxmlLoader.getController();
        playerNameOutput.showInformation(player_output.getText());
        playerNameOutput.showWordwin(actualWord);
        window = new Stage();
        window.setTitle("Hangman");
        window.setScene(new Scene(root1));
        window.getIcons().add(new Image("/icon2.png"));
        window.show();
        Homepage.closeWindow();
        window.setOnCloseRequest(e -> {
            e.consume(); //damit das fenster bei no nicht schließt
            window.close();
        });
    }


    //if the word is not completed and the lifecounter is 0 the loosewindow is opened
    public void looseWindow() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/loose.fxml"));
        Parent root1 = fxmlLoader.load();
        Loose playerNameOutput = fxmlLoader.getController();
        playerNameOutput.showInformation(player_output.getText());
        playerNameOutput.showWord(actualWord);
        window = new Stage();
        window.setTitle("Hangman");
        window.setScene(new Scene(root1));
        window.getIcons().add(new Image("/icon2.png"));
        window.show();
        Homepage.closeWindow();
        window.setOnCloseRequest(e -> {
            e.consume(); //damit das fenster bei no nicht schließt
            window.close();
        });
    }

    //show Playername at layer playeroutput
    public void showPlayerName(String playerName) {
        player_output.setText(playerName);
    }


    //when the button is pressed the replaceButton function is opened and the button gets invisible
    public void hideButtonA() throws IOException {
        replaceButtons(buttonA);
        buttonA.setVisible(false);
    }

    public void hideButtonB() throws IOException {
        replaceButtons(buttonB);
        buttonB.setVisible(false);
    }

    public void hideButtonC() throws IOException {
        replaceButtons(buttonC);
        buttonC.setVisible(false);
    }

    public void hideButtonD() throws IOException {
        replaceButtons(buttonD);
        buttonD.setVisible(false);
    }

    public void hideButtonE() throws IOException {
        replaceButtons(buttonE);
        buttonE.setVisible(false);
    }

    public void hideButtonF() throws IOException {
        replaceButtons(buttonF);
        buttonF.setVisible(false);
    }

    public void hideButtonG() throws IOException {
        replaceButtons(buttonG);
        buttonG.setVisible(false);
    }

    public void hideButtonH() throws IOException {
        replaceButtons(buttonH);
        buttonH.setVisible(false);
    }

    public void hideButtonI() throws IOException {
        replaceButtons(buttonI);
        buttonI.setVisible(false);
    }

    public void hideButtonJ() throws IOException {
        replaceButtons(buttonJ);
        buttonJ.setVisible(false);
    }

    public void hideButtonK() throws IOException {
        replaceButtons(buttonK);
        buttonK.setVisible(false);
    }

    public void hideButtonL() throws IOException {
        replaceButtons(buttonL);
        buttonL.setVisible(false);
    }

    public void hideButtonM() throws IOException {
        replaceButtons(buttonM);
        buttonM.setVisible(false);
    }

    public void hideButtonN() throws IOException {
        replaceButtons(buttonN);
        buttonN.setVisible(false);
    }

    public void hideButtonO() throws IOException {
        replaceButtons(buttonO);
        buttonO.setVisible(false);
    }

    public void hideButtonP() throws IOException {
        replaceButtons(buttonP);
        buttonP.setVisible(false);
    }

    public void hideButtonQ() throws IOException {
        replaceButtons(buttonQ);
        buttonQ.setVisible(false);
    }

    public void hideButtonR() throws IOException {
        replaceButtons(buttonR);
        buttonR.setVisible(false);
    }

    public void hideButtonS() throws IOException {
        replaceButtons(buttonS);
        buttonS.setVisible(false);
    }

    public void hideButtonT() throws IOException {
        replaceButtons(buttonT);
        buttonT.setVisible(false);
    }

    public void hideButtonU() throws IOException {
        replaceButtons(buttonU);
        buttonU.setVisible(false);
    }

    public void hideButtonV() throws IOException {
        replaceButtons(buttonV);
        buttonV.setVisible(false);
    }

    public void hideButtonW() throws IOException {
        replaceButtons(buttonW);
        buttonW.setVisible(false);
    }

    public void hideButtonX() throws IOException {
        replaceButtons(buttonX);
        buttonX.setVisible(false);
    }

    public void hideButtonY() throws IOException {
        replaceButtons(buttonY);
        buttonY.setVisible(false);
    }

    public void hideButtonZ() throws IOException {
        replaceButtons(buttonZ);
        buttonZ.setVisible(false);
    }

    // a very nice button try to find it :)
    public void easterEggButton(){
        easterEgg();
    }

    // ????? :)
    public void easterEgg() {
        letters.setVisible(true);
    }

    //close the window its stormy
    public static void closeWindow() {
        window.close();
    }
}

