package com.sharkycake.Learning;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Date;

public class FlowPaneController {

    @FXML
    private TextField ReallyTextField;

    @FXML
    private TextField CheckTimeTextField;


    public void CheckTimeOnClick(ActionEvent actionEvent) {
        Date date = new Date();
        Long time = date.getTime();
        String s = time.toString();
        CheckTimeTextField.setText(s);
    }

    public void ReallyOnClick(ActionEvent actionEvent) {
        ReallyTextField.setText("看到时间了吗");
    }
}
