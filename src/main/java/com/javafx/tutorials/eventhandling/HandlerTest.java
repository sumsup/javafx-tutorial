package com.javafx.tutorials.eventhandling;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HandlerTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle c = new Circle(100, 100, 50);
        c.setFill(Color.GREEN);
        c.setStroke(Color.RED);

        Button btn = new Button("Play");
        btn.setTranslateX(125);
        btn.setTranslateY(200);

        Button btn1 = new Button("Pause");
        btn1.setTranslateX(175);
        btn1.setTranslateY(200);

        TranslateTransition trans = new TranslateTransition();
        trans.setAutoReverse(true);
        trans.setByX(200);
        trans.setCycleCount(100);
        trans.setDuration(Duration.millis(500));
        trans.setNode(c);

        EventHandler<MouseEvent> handler = event -> {
            if (event.getSource() == btn) {
                trans.play();
            }
            if(event.getSource() == btn1) {
                trans.pause();
            }
            event.consume();
        };

        EventHandler<KeyEvent> keyEventEventHandler = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().isArrowKey()) {
                    trans.play();
                }
            }
        };

        btn.setOnMouseClicked(handler);
        btn1.setOnMouseClicked(handler);

        Group root = new Group();
        root.getChildren().addAll(c, btn, btn1);
        Scene scene = new Scene(root, 420, 300, Color.WHEAT);

        primaryStage.setScene(scene);
        primaryStage.setTitle("EventHandler example");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
