import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// this  class code represents the entry point of the JavaFX application.
public class MainApp extends Application {
    // Constructor for the MainApp class.
    public MainApp() {
    }

    // The embark method is invoked when the application is launched.
    @Override
    public void start(Stage stage) throws IOException {
        // Load the main UI layout from the FXML file.
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MainScreen.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load());

        // Configure the primary stage.
        stage.setTitle("Assignment3"); // settin title of the application window.
        stage.setScene(scene); // scene containing the UI layout.
        stage.setResizable(false); // Prevent the user from resizing the window.
        stage.show(); // Displaying the application window
    }

    //  the predominant method, which generally serves as the entry point for the application.
    public static void main(String[] args) {
        launch(new String[0]); // starting the JavaFX application.
    }
}
