package com.solsystems.menureursividad;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    // Open the List window
    @FXML
    private void openList() {
        openWindow(
                "/com/solsystems/menureursividad/list-view.fxml",
                "List"
        );}
    // Open the Stack window
    @FXML
    private void openStack() {
        openWindow(
                "/com/solsystems/menureursividad/stack-view.fxml",
                "Stack"
        );}
    // Open the Queue window
    @FXML
    private void openQueue() {
        openWindow(
                "/com/solsystems/menureursividad/queue-view.fxml",
                "Queue"
        );}
    // Open the Recursion window
    @FXML
    private void openRecursion() {
        openWindow(
                "/com/solsystems/menureursividad/recursion-view.fxml",
                "Recursion"
        );
    }
    // Load an FXML file and open it in a new window
    private void openWindow(String fxmlFile, String title) {

        try {
            // Load the selected FXML file
            FXMLLoader loader = new FXMLLoader(
                    MainController.class.getResource(fxmlFile)
            );
            Parent root = loader.load();
            // Create a new window
            Stage stage = new Stage();
            // Set the window title
            stage.setTitle(title);
            // Create and configure the scene
            stage.setScene(new Scene(root, 600, 450));
            // Display the window
            stage.show();
        } catch (IOException e) {
            // Print the error if the FXML file cannot be loaded
            e.printStackTrace();
        }
    }
}
