package database;

//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.fxml.FXML;
//import javafx.scene.control.cell.PropertyValueFactory;

//import javafx.beans.property.SimpleStringProperty;

public class Homecontroller {

//    @FXML
//    private Label nameLabel;

    @FXML
    private TableView<room> roomTable;

    @FXML
    private TableColumn<room, String> room_nameColumn;

    @FXML
    private TableColumn<room, Float> priceColumn;

    public void HomeController() throws SQLException {
        
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/khutro", "DB_USER", "DB_PASSWORD");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM room");
//
//            // Create an ObservableList to hold the Room objects
//            ObservableList<room> roomList = FXCollections.observableArrayList();
//
//            while (resultSet.next()) {
//                String name = resultSet.getString("name");
//                int price = resultSet.getInt("price");
//
//                roomList.add(new room(name, price));
//            }
//
//            // Set the data in the TableView
//            roomTable.setItems(roomList);
//
//            connection.close();
//        }

try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/khutro", "DB_USER", "DB_PASSWORD");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `room` WHERE 1");
            

            while (resultSet.next()) {
                String room_name = resultSet.getString("room_name");
                float price = resultSet.getFloat("price");

//                roomList.add(new room(name, price));
            }

//            roomTable.setItems(roomList);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
//    public void initialize() {
//        nameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getname()));
//        priceColumn.setCellValueFactory(cellData -> {
//            int value = cellData.getValue().getprice();
//            return value == null ? null : new SimpleStringProperty(value);
//});
//    }
    
}
    
}
    