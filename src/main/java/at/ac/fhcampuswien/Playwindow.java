package at.ac.fhcampuswien;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

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
    public void replaceButtons(Button button) throws IOException, InterruptedException {
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
            TimeUnit.SECONDS.sleep(2);
            winWindow();
            lifescounter = 6;
            close = 10;
            startunderlines = "";
        }

        lifeCounter();
    }

    //Function that makes visible our Hangman by decreased lifes
    public int lifeCounter() throws IOException, InterruptedException {
        lifes.setText(String.valueOf(lifescounter));
        mistakes = 0;
        switch (lifescounter) {
            case 5:
                FadeTransition ft1 = new FadeTransition(Duration.millis(1000), hangman1);
                ft1.setFromValue(0.1);
                ft1.setToValue(1.0);
                hangman1.setVisible(true);
                ft1.play();
                break;
            case 4:
                FadeTransition ft2 = new FadeTransition(Duration.millis(1000), hangman2);
                ft2.setFromValue(0.1);
                ft2.setToValue(1.0);
                hangman2.setVisible(true);
                ft2.play();
                break;
            case 3:
                FadeTransition ft3 = new FadeTransition(Duration.millis(1000), hangman3);
                ft3.setFromValue(0.1);
                ft3.setToValue(1.0);
                hangman3.setVisible(true);
                ft3.play();
                break;
            case 2:
                FadeTransition ft4 = new FadeTransition(Duration.millis(1000), hangman4);
                ft4.setFromValue(0.1);
                ft4.setToValue(1.0);
                hangman4.setVisible(true);
                ft4.play();
                break;
            case 1:
                FadeTransition ft5 = new FadeTransition(Duration.millis(1000), hangman5);
                ft5.setFromValue(0.1);
                ft5.setToValue(1.0);
                hangman5.setVisible(true);
                ft5.play();
                break;
            case 0:

                FadeTransition ft6 = new FadeTransition(Duration.millis(1000), hangman6);
                ft6.setFromValue(0.1);
                ft6.setToValue(1.0);
                hangman6.setVisible(true);
                ft6.play();

                FadeTransition ft7 = new FadeTransition(Duration.millis(1000), hangman7);
                ft7.setFromValue(0.1);
                ft7.setToValue(1.0);
                hangman7.setVisible(true);
                ft7.play();

                //Made by Mr.Prof.Dr.Strommer to solve the Problem
                ft6.setOnFinished(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        try {
                            looseWindow();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });



                //TimeUnit.SECONDS.sleep(5);


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
        playerNameOutput.showWordWin(actualWord);
        window = new Stage();
        window.setTitle("Hangman");
        window.setScene(new Scene(root1));
        window.getIcons().add(new Image("/icon2.png"));
        window.setResizable(false);
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
        window.setResizable(false);
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
    public void hideButtonA() throws IOException, InterruptedException {
        replaceButtons(buttonA);
        buttonA.setVisible(false);
    }

    public void hideButtonB() throws IOException, InterruptedException {
        replaceButtons(buttonB);
        buttonB.setVisible(false);
    }

    public void hideButtonC() throws IOException, InterruptedException {
        replaceButtons(buttonC);
        buttonC.setVisible(false);
    }

    public void hideButtonD() throws IOException, InterruptedException {
        replaceButtons(buttonD);
        buttonD.setVisible(false);
    }

    public void hideButtonE() throws IOException, InterruptedException {
        replaceButtons(buttonE);
        buttonE.setVisible(false);
    }

    public void hideButtonF() throws IOException, InterruptedException {
        replaceButtons(buttonF);
        buttonF.setVisible(false);
    }

    public void hideButtonG() throws IOException, InterruptedException {
        replaceButtons(buttonG);
        buttonG.setVisible(false);
    }

    public void hideButtonH() throws IOException, InterruptedException {
        replaceButtons(buttonH);
        buttonH.setVisible(false);
    }

    public void hideButtonI() throws IOException, InterruptedException {
        replaceButtons(buttonI);
        buttonI.setVisible(false);
    }

    public void hideButtonJ() throws IOException, InterruptedException {
        replaceButtons(buttonJ);
        buttonJ.setVisible(false);
    }

    public void hideButtonK() throws IOException, InterruptedException {
        replaceButtons(buttonK);
        buttonK.setVisible(false);
    }

    public void hideButtonL() throws IOException, InterruptedException {
        replaceButtons(buttonL);
        buttonL.setVisible(false);
    }

    public void hideButtonM() throws IOException, InterruptedException {
        replaceButtons(buttonM);
        buttonM.setVisible(false);
    }

    public void hideButtonN() throws IOException, InterruptedException {
        replaceButtons(buttonN);
        buttonN.setVisible(false);
    }

    public void hideButtonO() throws IOException, InterruptedException {
        replaceButtons(buttonO);
        buttonO.setVisible(false);
    }

    public void hideButtonP() throws IOException, InterruptedException {
        replaceButtons(buttonP);
        buttonP.setVisible(false);
    }

    public void hideButtonQ() throws IOException, InterruptedException {
        replaceButtons(buttonQ);
        buttonQ.setVisible(false);
    }

    public void hideButtonR() throws IOException, InterruptedException {
        replaceButtons(buttonR);
        buttonR.setVisible(false);
    }

    public void hideButtonS() throws IOException, InterruptedException {
        replaceButtons(buttonS);
        buttonS.setVisible(false);
    }

    public void hideButtonT() throws IOException, InterruptedException {
        replaceButtons(buttonT);
        buttonT.setVisible(false);
    }

    public void hideButtonU() throws IOException, InterruptedException {
        replaceButtons(buttonU);
        buttonU.setVisible(false);
    }

    public void hideButtonV() throws IOException, InterruptedException {
        replaceButtons(buttonV);
        buttonV.setVisible(false);
    }

    public void hideButtonW() throws IOException, InterruptedException {
        replaceButtons(buttonW);
        buttonW.setVisible(false);
    }

    public void hideButtonX() throws IOException, InterruptedException {
        replaceButtons(buttonX);
        buttonX.setVisible(false);
    }

    public void hideButtonY() throws IOException, InterruptedException {
        replaceButtons(buttonY);
        buttonY.setVisible(false);
    }

    public void hideButtonZ() throws IOException, InterruptedException {
        replaceButtons(buttonZ);
        buttonZ.setVisible(false);
    }

    // a very nice button try to find it :)
    public void easterEggButton() {
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

