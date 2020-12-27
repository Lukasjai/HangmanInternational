package at.ac.fhcampuswien;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.stage.*;

import java.io.IOException;

public class App extends Application {
    public static Stage window;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/startseite.fxml"));
        window = primaryStage;
        window.setTitle("Hangman");
        Scene scene = new Scene(root);
        window.setScene(scene);
        window.getIcons().add(new Image("/icon2.png"));
        window.show();
        window.setOnCloseRequest(e -> {
            e.consume(); //damit das fenster bei no nicht schließt
            closeProgram();
        });
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
