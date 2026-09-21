import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class AppPhase3 extends Application {

    @Override
    public void start(Stage stage) {

        // Create buttons
        Button changeTextButton = new Button("Change Text");
        Button changeColorButton = new Button("Change Color");
        Button resetButton = new Button("Reset Page");

        // Create button bar
        HBox buttonBar = new HBox(15);

        // Center the buttons horizontally
        buttonBar.setAlignment(Pos.CENTER);

        // Add buttons to the button bar
        buttonBar.getChildren().addAll(
                changeTextButton,
                changeColorButton,
                resetButton
        );

        // Create WebView
        WebView webView = new WebView();

        // Get WebEngine from WebView
        WebEngine webEngine = webView.getEngine();

        // Create main layout
        BorderPane root = new BorderPane();

        // Place WebView in the center
        root.setCenter(webView);

        // Place button bar at the bottom
        root.setBottom(buttonBar);

        // Create scene
        Scene scene = new Scene(root, 1000, 700);

        // Set stage
        stage.setTitle("CSC360 Group 12 - Phase 3");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}