package khutro.project2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< HEAD
         FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/khutro/project2/contact.fxml"));
=======
         FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/khutro/project2/loginRegister.fxml"));
>>>>>>> 869497c216a0d5a0bfd15a3d14a90cbec7bae65f
        Scene scene = new Scene(fxmlLoader.load(), 1252.0, 608);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

}