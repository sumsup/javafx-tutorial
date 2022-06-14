package com.javafx.tutorials.selectoption.colorpicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class Controller {

    @FXML
    ColorPicker myColor;
    @FXML
    AnchorPane myPane;


    public void getColor(ActionEvent event) {
        Color color = myColor.getValue();
        myPane.setBackground(new Background(new BackgroundFill(color,null, null)));
    }


}
