package com.example.javafxsecond;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class HelloApplication extends Application {


    public static void main(String[] args) {
      launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,Color.BEIGE);

        Image icon = new Image("icon.png");
        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo for Bootcamp");
        stage.setScene (scene);
        stage.show();


    }
}