package com.kshakes.kshakesbank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class loginScript {

    @FXML
    public TextField usernameField;
    @FXML
    public TextField passwordField;
    @FXML
    public Button loginButton;
    @FXML
    public Text WelcomeText;

    public void bankMainScreen(ActionEvent event) throws IOException, InterruptedException {
        usernameField.setVisible(false);
        passwordField.setVisible(false);
        loginButton.setVisible(false);

        Parent root = FXMLLoader.load(getClass().getResource("bankMainScreen.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setTitle("Hello " + usernameField.getText());
        stage.setScene(scene);
        stage.show();
    }
}