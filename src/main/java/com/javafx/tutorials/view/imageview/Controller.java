package com.javafx.tutorials.view.imageview;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    ImageView myImageView;
    @FXML
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("cap2.jpg"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }

}
