import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a label
        Label helloLabel = new Label("Hello, World!");

        // Set up the layout
        StackPane root = new StackPane();
        root.getChildren().add(helloLabel);

        // Create the scene
        Scene scene = new Scene(root, 300, 200);

        // Set the stage
        primaryStage.setTitle("Hello World JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launches the JavaFX application
    }
}
