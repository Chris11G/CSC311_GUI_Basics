package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        // Loads the interface that we created using Scene Builder
        FXMLLoader fxmlLoader =
                new FXMLLoader(Main.class.getResource("/main-view.fxml"));

        // Creates a JavaFX Scene using the FXML interface
        Scene scene = new Scene(fxmlLoader.load());

        // Sets the title displayed at the top of the application window
        stage.setTitle("CSC 311 GUI Basics");

        // Places our Scene inside the application window
        stage.setScene(scene);

        // Displays the window
        stage.show();
    }

    public static void main(String[] args) {

        // Starts the JavaFX application
        launch();
    }
}