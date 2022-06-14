package com.javafx.tutorials.bar.spinner;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Spinner<Integer> mySpinner;
    @FXML
    private Label myLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
        valueFactory.setValue(1); // default value;
        mySpinner.setValueFactory(valueFactory);

        myLabel.setText(String.valueOf(mySpinner.getValue()));

//        mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {
//            @Override
//            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
//                myLabel.setText(String.valueOf(mySpinner.getValue()));
//            }
//        });

        // replace upper code into lambda.
        mySpinner.valueProperty().addListener((observable, oldValue, newValue) -> myLabel.setText(String.valueOf(mySpinner.getValue())));

    }

}