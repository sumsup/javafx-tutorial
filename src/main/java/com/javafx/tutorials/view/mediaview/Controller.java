package com.javafx.tutorials.view.mediaview;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private MediaView mediaView;

    @FXML
    private Button playButton, pauseButton, resetButton;

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // add run configuration. agruments. '--add-modules javafx.controls.,javafx.media'
        // file = new File("test.mp4"); // for in the package.

        file = new File("D:\\dev\\projects\\javafx-tutorial\\src\\view.mediaview\\test.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);

        mediaView.setMediaPlayer(mediaPlayer);
    }


    public void playMedia(ActionEvent event) {
        mediaPlayer.play();
    }

    public void pauseMedia(ActionEvent event) {
        mediaPlayer.pause();
    }

    public void resetMedia(ActionEvent event) {
        if (mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
            mediaPlayer.seek(Duration.seconds(0.0));
        }
    }

}
