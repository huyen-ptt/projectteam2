package khutro.project2;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class alertMessage {
	private Alert alert;
	
	public void errorMessage(String message) {
		alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error message");
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
	
	public void successMessage(String message) {
		alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information message");
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.showAndWait();
	}
}
