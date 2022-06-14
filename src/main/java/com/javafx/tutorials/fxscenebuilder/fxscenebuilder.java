package com.javafx.tutorials.fxscenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class fxscenebuilder extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        Scene scene = new Scene(root);
//        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        String css = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
