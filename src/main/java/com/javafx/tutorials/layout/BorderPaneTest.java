package com.javafx.tutorials.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneTest extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        pane.setTop(new Label("This will be at the top"));
        pane.setLeft(new Label("왼쪽"));
        pane.setCenter(new Label("가운데~"));
        pane.setBottom(new Label("아래쪽"));

        Scene scene = new Scene(pane, 800, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}