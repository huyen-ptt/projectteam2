package database;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.sql.*;

public class Main extends Application {

    // Define GUI elements
    TextField roomNumberField = new TextField();
    TextField capacityField = new TextField();
    Button addButton = new Button("Add Room");

    @Override
    public void start(Stage primaryStage) {
        // Set up the UI
        VBox root = new VBox(10);
        root.getChildren().addAll(
                new Label("Room Number:"),
                roomNumberField,
                new Label("Capacity:"),
                capacityField,
                addButton
        );

        // Set up event handler for the button
        addButton.setOnAction(e -> addRoom());

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Add Room Information");
        primaryStage.show();
    }

    private void addRoom() {
        String roomNumber = roomNumberField.getText();
        int capacity = Integer.parseInt(capacityField.getText());

        try {
            // Connect to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/khutro", "username", "password");

            // Create the SQL query
            var insertQuery = "INSERT INTO room (id, room_name, room_description, price, max_occupancy, status, room_area, type, created_time) VALUES (1, 'a', 'a', 1, null, null, null, 'a', null)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, roomNumber);
            preparedStatement.setInt(2, capacity);

            // Execute the query
            preparedStatement.executeUpdate();

            // Close the connection
            connection.close();

            // Provide feedback to the user
            System.out.println("Room information added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
