package com.javafx.tutorials.view.selectview.listview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ListView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("scene.fxml"));
        Scene scene = new Scene(parent);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
