package com.javafx.tutorials.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VerticalBox extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        VBox vBox = new VBox();
        Scene scene = new Scene(vBox, 300, 300);

        vBox.getChildren().addAll(btn1,btn2,btn3);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
