package com.javafx.tutorials.animation.image;

import javafx.animation.Interpolator;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ImageView myImage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // translate
        /*TranslateTransition transition = new TranslateTransition();
        transition.setNode(myImage);
        transition.setDuration(Duration.millis(1000));
        transition.setCycleCount(transition.INDEFINITE);
        transition.setByX(250);
        transition.setByX(-250);
        transition.setAutoReverse(true);
        transition.play();*/

        // rotate
//        RotateTransition rotate = new RotateTransition();
//        rotate.setNode(myImage);
//        rotate.setDuration(Duration.millis(1000));
//        rotate.setCycleCount(rotate.INDEFINITE);
//        rotate.setInterpolator(Interpolator.LINEAR);
//        rotate.setByAngle(360);
//        rotate.setAxis(Rotate.X_AXIS);
//        rotate.play();

        // fade
//        FadeTransition fade = new FadeTransition();
//        fade.setNode(myImage);
//        fade.setDuration(Duration.millis(1000));
//        fade.setCycleCount(TranslateTransition.INDEFINITE);
//        fade.setInterpolator(Interpolator.LINEAR);
//
//        // fade in : from 0 to 1.
//        // fade out : from 1 to 0.
//        fade.setFromValue(1);
//        fade.setToValue(0);
//        fade.play();

        // scale
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(myImage);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(scale.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setByX(2.0);
        scale.setByY(2.0);
        scale.setAutoReverse(true);
        scale.play();

    }
}
