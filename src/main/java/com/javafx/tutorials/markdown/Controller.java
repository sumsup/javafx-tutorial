package com.javafx.tutorials.markdown;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class Controller {

    @FXML
    private TextArea inputTextArea;
    @FXML
    private TextArea displayTextArea;
    @FXML
    private TextField title;

    public void displayText(KeyEvent event) {
        displayTextArea.setText(inputTextArea.getText());
    }

    public void save(ActionEvent event) throws IOException {
        FileWriter myWriter = new FileWriter("./ms/" + title.getText() + ".txt");
        myWriter.write(inputTextArea.getText());
        myWriter.close();
    }

    public void chooseFile(ActionEvent event) {
        inputTextArea.clear();
        displayTextArea.clear();

        FileChooser fileChooser = new FileChooser();
        Stage chooseStage = new Stage();
        File selectedFile = fileChooser.showOpenDialog(chooseStage);

//        try {
//            Scanner text = new Scanner(selectedFile);
//
//            while (text.hasNext()) {
//                inputTextArea.appendText(text.nextLine() + '\n');
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        BufferedReader text = null;
        try {
            text = new BufferedReader(new FileReader(selectedFile));

            String line;
            while((line = text.readLine()) != null) {
                inputTextArea.appendText(line + '\n');
            }
            text.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (text != null) {
                try {
                    text.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        title.setText(selectedFile.getName().replace(".txt", ""));
        displayTextArea.setText(inputTextArea.getText());

    }
}
