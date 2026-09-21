import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class AppPhase5 extends Application {

    @Override
    public void start(Stage stage) {

        // Create buttons
        Button changeTextButton = new Button("Change Text");
        Button changeColorButton = new Button("Change Color");
        Button resetButton = new Button("Reset Page");

        // Create button bar
        HBox buttonBar = new HBox(15);
        buttonBar.setAlignment(Pos.CENTER);

        buttonBar.getChildren().addAll(
                changeTextButton,
                changeColorButton,
                resetButton
        );

        // Create WebView
        WebView webView = new WebView();

        // Get WebEngine
        WebEngine webEngine = webView.getEngine();

        // Load HTML page
        String htmlPath = getClass()
                .getResource("/webpage.html")
                .toExternalForm();

        webEngine.load(htmlPath);

        // JavaFX button → JavaScript → DOM
        changeTextButton.setOnAction(event -> {
            webEngine.executeScript(
                    "document.getElementById('message').innerText = 'Text changed by JavaFX';"
            );
        });

        changeColorButton.setOnAction(event -> {
            webEngine.executeScript(
                    "document.getElementById('message').style.color = 'red';"
            );
        });

        resetButton.setOnAction(event -> {
            webEngine.executeScript(
                    "document.getElementById('message').innerText = 'Hello from HTML';"
            );

            webEngine.executeScript(
                    "document.getElementById('message').style.color = 'black';"
            );
        });

        // Main layout
        BorderPane root = new BorderPane();

        root.setCenter(webView);
        root.setBottom(buttonBar);

        // Scene
        Scene scene = new Scene(root, 1000, 700);

        // Stage
        stage.setTitle("CSC360 Group 12 - Phase 5");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
