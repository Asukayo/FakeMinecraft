package com.sharkycake.Learning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {


        //读取对应的FXML文件
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("re.fxml"));
        //创建场景
        Scene scene = new Scene(fxmlLoader.load(), 1000, 120);
        //设置Scene名称
        stage.setTitle("Minecraft!");
        //设置scene属性
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}