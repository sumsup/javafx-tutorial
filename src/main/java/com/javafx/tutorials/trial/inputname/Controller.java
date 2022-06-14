package com.javafx.tutorials.trial.inputname;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private TextField nameField;
    @FXML
    private Button submitButton;
    @FXML
    private Label welcome;

    public void submitName(ActionEvent event) {
        setWelcomeName();
    }

    public void submitName(KeyEvent event) {
        if (event.getCode().equals(KeyCode.ENTER)) {
            setWelcomeName();
        }
    }

    private void setWelcomeName() {
        String name = nameField.getText();

        welcome.setText(name + "님 반갑습니다.");
        welcome.setVisible(true);
    }

}
