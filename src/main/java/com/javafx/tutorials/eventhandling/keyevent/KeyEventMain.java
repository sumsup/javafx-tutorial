package com.javafx.tutorials.eventhandling.keyevent;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class KeyEventMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/eventhandling/keyevent/scene.fxml"));
        Parent root = loader.load();
        Controller controller = loader.getController();
        Scene scene = new Scene(root);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                switch (event.getCode()) {
                    case UP:
                        controller.moveUp();
                        break;
                    case DOWN:
                        controller.moveDown();
                        break;
                    case LEFT:
                        controller.moveLeft();
                        break;
                    case RIGHT:
                        controller.moveRight();
                        break;
                    default:
                        break;
                }

            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
