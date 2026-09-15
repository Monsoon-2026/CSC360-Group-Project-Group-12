package com.group12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        // Create buttons
        Button changeTextButton = new Button("Change Text");
        Button changeColorButton = new Button("Change Color");
        Button resetButton = new Button("Reset Page");

        // Create button bar
        HBox buttonBar = new HBox(15);
        buttonBar.setStyle("-fx-alignment: center; -fx-padding: 15;");

        // Add buttons to the button bar
        buttonBar.getChildren().addAll(
                changeTextButton,
                changeColorButton,
                resetButton
        );

        // Create main layout
        BorderPane root = new BorderPane();
        root.setBottom(buttonBar);

        // Create scene
        Scene scene = new Scene(root, 1000, 700);

        stage.setTitle("CSC360 Group 12 - JavaFX Browser");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}