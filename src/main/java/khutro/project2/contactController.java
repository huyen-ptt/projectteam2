package khutro.project2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.JOptionPane;
import java.awt.*;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class contactController {

    @FXML
    private Hyperlink contact_Facebook;

    @FXML
    private TextArea contact_content;

    @FXML
    private TextField contact_email;

    @FXML
    private TextField contact_phone;

    @FXML
    private Button contact_send;

    @FXML
    private TextField contact_title;

    Connection con;
    PreparedStatement pst;

    @FXML
    void sendContact(ActionEvent event) {
        String email = contact_email.getText();
        String title = contact_title.getText();
        String phone = contact_phone.getText();
        String content = contact_content.getText();

        try {
            // Tiếp tục xử lý và gửi dữ liệu nếu cả hai điều kiện đều đúng
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/khutro", "root", "");

            pst = con.prepareStatement("insert into contact (email, title, phone, content) values (?, ?, ?, ?)");
            pst.setString(1, email);
            pst.setString(2, title);
            pst.setString(3, phone);
            pst.setString(4, content);
            int status = pst.executeUpdate();

            if (status == 1) {
                JOptionPane.showMessageDialog(null, "Message sent successfully");
                contact_email.setText("");
                contact_title.setText("");
                contact_phone.setText("");
                contact_content.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Message send failed");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(contactController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void openLink(ActionEvent event) {
        // Open the Facebook link
        String facebookLink = "https://www.facebook.com/aptechvietnam.com.vn";
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(facebookLink));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Desktop browsing is not supported on this platform.");
        }
    }
}
