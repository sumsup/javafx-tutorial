package com.javafx.tutorials.view.mediaview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MediaViewMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
