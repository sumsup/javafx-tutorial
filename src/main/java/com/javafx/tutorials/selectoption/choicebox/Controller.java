package com.javafx.tutorials.selectoption.choicebox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] food = {"pizza", "sushi", "ramen"};

    // 초이스 박스에 값을 할당해주기 위한 것. choiceBox에는 onAction 이 없다.
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myChoiceBox.getItems().addAll(food);
        myChoiceBox.setOnAction(this::getFood);
    }

    public void getFood(ActionEvent event) {
        String myFood = myChoiceBox.getValue();
        myLabel.setText(myFood);
    }

}
