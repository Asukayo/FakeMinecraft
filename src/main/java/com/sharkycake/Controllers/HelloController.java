package com.sharkycake.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button helloButton;

    @FXML
    private TextField CloseText;

    @FXML
    protected void onHelloButtonClick() {
        System.out.println(welcomeText);
        welcomeText.setText("");

        helloButton.setText("");
    }

    public void Change(ActionEvent actionEvent) throws IOException {

        for (int i = 0; i < 150; i++) {
            int i1 = (int)(Math.random()*1000);
            int i2 = (int)(Math.random()*1000);
            int i3 = (int)(Math.random()*1000);
            System.out.println(i1);
            Stage stage = new Stage();
            //设置总是在最前端
            stage.setAlwaysOnTop(true);

            stage.setHeight(100);
            stage.setWidth(100);
            stage.setX(i1+i3);
            stage.setY(i2+14);
            stage.setTitle("Error!");
            //设置scene属性
            stage.show();
        }
        Stage stage = new Stage();
        stage.setAlwaysOnTop(true);
        stage.setHeight(500);
        stage.setWidth(500);
        stage.setTitle("Error");
        //设置scene属性
        stage.show();

    }




}