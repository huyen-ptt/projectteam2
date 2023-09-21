//package khutro.project2;
//
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.image.ImageView;
//import javafx.stage.Stage;
//import java.io.IOException;
//
//public class helloviewcontroller {
//    @FXML
//private ImageView imageView;
//
//@FXML
//private void initialize() {
//    FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
//    Parent root = loader.load();
//    helloviewcontroller controller = loader.getController();
//    imageView.setOnMouseClicked(event -> {
//        try {
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("detail.fxml"));
//            Parent root = loader.load();
//
//            // Access the controller of the target page (if needed)
////            detailController homeController = loader.getController();
//
//            // Get the stage and set the new scene
//            Stage stage = (Stage) imageView.getScene().getWindow();
//            stage.setScene(new Scene(root));
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    });
//}
//
//}
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class helloviewcontroller {
    
    @FXML
    private ImageView image;

    @FXML
    private void setOnMouseClicked(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("detail.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) image.getScene().getWindow();
            stage.setScene(new Scene(root));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
