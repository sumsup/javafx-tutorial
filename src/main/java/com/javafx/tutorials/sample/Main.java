package com.javafx.tutorials.sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label question = new Label("Question is");
        Label answer = new Label("Answer is");

        TextField questionField = new TextField();
        TextField answerField = new TextField();

        Button submit = new Button("submit");

        GridPane root = new GridPane();
        root.addRow(0, question, questionField);
        root.addRow(1, answer, answerField);
        root.addRow(2, submit);

        Scene scene = new Scene(root, 800, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("QnA list");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
