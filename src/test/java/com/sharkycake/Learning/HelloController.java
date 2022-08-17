package com.sharkycake.Learning;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Random;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button helloButton;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println(welcomeText);
        welcomeText.setText("");

        helloButton.setText("");
    }

    public void Change(ActionEvent actionEvent) throws IOException {

        for (int i = 0; i < 100; i++) {
            Random random = new Random(i);
            int i1 = (random.nextInt())/10000000;
            System.out.println(i1);
            Stage stage = new Stage();
            stage.setHeight(20);
            stage.setWidth(20);
            stage.setX(50+i1);
            stage.setY(200+i1);
            stage.setTitle("Hello!");
            //设置scene属性
            stage.show();
        }
    }
}