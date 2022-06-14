package com.javafx.tutorials.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneLayout extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label firstName = new Label("이름");
        Label lastName = new Label("나이");

        TextField textField1 = new TextField();
        TextField textField2 = new TextField();

        Button submit = new Button("제출");
        GridPane root = new GridPane();
        root.setHgap(20);
        root.setVgap(20);
        Scene scene = new Scene(root, 800, 800);
        root.addRow(0, firstName, textField1);
        root.addRow(1, lastName, textField2);
        root.addRow(2, submit);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}