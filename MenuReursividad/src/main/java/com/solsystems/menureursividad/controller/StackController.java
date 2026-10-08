package com.solsystems.menureursividad.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Stack;

public class StackController {
    // Text field where the user enters a new element
    @FXML
    private TextField txtData;
    @FXML
    private TextArea txtArea;
    private final Stack<String> stack = new Stack<>();
    // Add an element to the top of the stack
    @FXML
    private void onPush() {
        String data = txtData.getText().trim();
        if (!data.isEmpty()) {
            stack.push(data);
            txtData.clear();
            updateDisplay();
        }}
    // Remove the top element from the stack
    @FXML
    private void onPop() {
        if (!stack.isEmpty()) {
            stack.pop();
            updateDisplay();
        }}
    // Remove all elements from the stack
    @FXML
    private void onClear() {
        stack.clear();
        updateDisplay();
    }
    // Display the current contents of the stack
    private void updateDisplay() {
        if (stack.isEmpty()) {
            txtArea.setText("Stack is empty.");
            return;
        }
        // Create a StringBuilder for the output
        StringBuilder result = new StringBuilder();
        result.append("Stack:\n\n");
        for (int i = stack.size() - 1; i >= 0; i--) {
            result.append(stack.get(i))
                    .append("\n");
        }
        // Show the stack in the text area
        txtArea.setText(result.toString());
    }
    // Return to the main menu
    @FXML
    private void backToMenu() {
        Stage currentStage =
                (Stage) txtArea.getScene().getWindow();
        // Close the current window
        currentStage.close();
    }
}
