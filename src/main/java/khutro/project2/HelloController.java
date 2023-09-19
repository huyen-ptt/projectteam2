package khutro.project2;

import database.ConnectionProvider;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
	
	   ConnectionProvider connection = new ConnectionProvider();

	
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Đây là chương trình javafx nhóm 3");
    }
}