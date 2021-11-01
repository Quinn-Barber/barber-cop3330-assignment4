package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Quinn Barber
 */


import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import javafx.event.ActionEvent;

class MyLauncher {

    public static void main(String[] args) throws IOException {
        App.main(args);
    }
}

public class App extends Application{
    public static void main(String[] args) throws IOException {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(App.class.getResource("/ucf/assignments/ToDoLists.fxml"));
        Scene scene = new Scene(loader.load());
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
