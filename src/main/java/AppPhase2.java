import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        // Create browser
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

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

        // Put WebView in the center
        root.setCenter(webView);

        // Put buttons at the bottom
        root.setBottom(buttonBar);

        // Create scene
        Scene scene = new Scene(root, 1000, 700);

        // Set up the stage
        stage.setTitle("CSC360 Group 12 - JavaFX WebView DOM Controller");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
