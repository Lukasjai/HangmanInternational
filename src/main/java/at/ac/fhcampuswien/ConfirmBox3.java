package at.ac.fhcampuswien;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox3 {

    static boolean answer;

    //defines the popup window for exit the game
    public static boolean display(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); //must close this window first before opening another
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(250);
        Label label1 = new Label();
        label1.setText(message);

        //Two buttons
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");


        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });

        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox layout = new VBox(20);
        layout.getChildren().addAll(label1, noButton, yesButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait(); //before we go back to the main window alert has to be closed

        return answer;
    }


}

