package com.javafx.tutorials.layout;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneTest extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FlowPane 테스트");
        FlowPane flowPane = new FlowPane();
        flowPane.setVgap(10);
        flowPane.setHgap(20);
        flowPane.setPrefWrapLength(250);
        flowPane.getChildren().addAll(new Button("하낫"), new Button("둘"), new Button("셋"));
        flowPane.setOrientation(Orientation.VERTICAL);
        flowPane.setColumnHalignment(HPos.CENTER);
        Scene scene = new Scene(flowPane, 300, 200);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

}