package com.solsystems.menureursividad.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class ListController {

    // Text field where the user enters a new element
    @FXML
    private TextField txtData;

    // Text area used to display the list
    @FXML
    private TextArea txtArea;

    // Create an ArrayList to store the elements
    private final List<String> list = new ArrayList<>();

    // Add a new element to the list
    @FXML
    private void onAdd() {

        // Get the text entered by the user
        String data = txtData.getText().trim();

        // Check that the input is not empty
        if (!data.isEmpty()) {
            // Add the element to the list
            list.add(data);
            // Clear the input field
            txtData.clear();
            // Update the displayed list
            updateDisplay();
        }
    }
    // Remove the last element from the list
    @FXML
    private void onRemove() {
        // Check that the list is not empty
        if (!list.isEmpty()) {
            // Remove the last element
            list.remove(list.size() - 1);
            // Update the displayed list
            updateDisplay();
        }
    }
    // Remove all elements from the list
    @FXML
    private void onClear() {
        // Clear the entire list
        list.clear();
        // Update the display
        updateDisplay();
    }
    // Display the current contents of the list
    private void updateDisplay() {
        // Check if the list is empty
        if (list.isEmpty()) {
            txtArea.setText("List is empty.");
            return;
        }
        // Create a StringBuilder for the output
        StringBuilder result = new StringBuilder();
        result.append("List:\n\n");
        // Display each element with its index
        for (int i = 0; i < list.size(); i++) {
            result.append(i)
                    .append(": ")
                    .append(list.get(i))
                    .append("\n");
        }
        // Show the list in the text area
        txtArea.setText(result.toString());
    }
    // Return to the main menu
    @FXML
    private void backToMenu() {
        // Get the current window
        Stage currentStage =
                (Stage) txtArea.getScene().getWindow();
        // Close the current window
        // The main menu remains open in the background
        currentStage.close();
    }
}
