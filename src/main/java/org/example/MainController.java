package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    // Connects to the Label with fx:id="messageLabel" in Scene Builder
    @FXML
    private Label messageLabel;

    // Runs when the "Click Me!" button is pressed
    @FXML
    private void handleButtonClick() {

        // Changes the text displayed by the message Label
        messageLabel.setText("I Told you not to click me!");
    }
}