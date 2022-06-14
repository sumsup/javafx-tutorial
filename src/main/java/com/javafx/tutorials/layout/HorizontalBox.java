package com.javafx.tutorials.layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HorizontalBox extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        HBox root = new HBox();
        root.setSpacing(50);
        root.setAlignment(Pos.CENTER);
        root.setFillHeight(false);
        root.getChildren().addAll(btn1, btn2, btn3);

        Scene scene = new Scene(root, 800, 800);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
