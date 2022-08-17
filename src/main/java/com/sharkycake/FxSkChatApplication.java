package com.sharkycake;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class FxSkChatApplication extends Application {

    public static void main(String[] args) {

        SpringApplication.run(FxSkChatApplication.class, args);

        launch(args);

    }


    @Override
    public void start(Stage stage) throws IOException {


        //读取对应的FXML文件
        FXMLLoader fxmlLoader = new FXMLLoader(FxSkChatApplication.class.getResource("re.fxml"));
        //创建场景
        Scene scene = new Scene(fxmlLoader.load(), 350, 150);
        //设置Scene名称
        stage.setTitle("Hello!");
        //设置scene属性
        stage.setScene(scene);
        stage.getIcons().add(new Image("imgs/1.png"));

        stage.show();
    }
}
