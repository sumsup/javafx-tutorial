package com.javafx.tutorials.bar.progressbar;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ProgressBar myProgressBar;
    @FXML
    private Button myButton;
    @FXML
    private Label myLabel;

    double progress;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myProgressBar.setStyle("-fx-accent: #ff2f69;");
        progress = myProgressBar.getProgress();
    }

    public void increaseProgress() {

        if (Math.round(progress * 100) >= 100) {
            progress = 0;
        } else {
            progress += 0.1;
        }

        myProgressBar.setProgress(progress);
        myLabel.setText((int) Math.round(progress * 100) + "%");
    }

}
