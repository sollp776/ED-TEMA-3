package com.solsystems.menureursividad.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.LinkedList;
import java.util.Queue;

public class QueueController {
    // Text field where the user enters a new element
    @FXML
    private TextField txtData;
    @FXML
    private TextArea txtArea;
    private final Queue<String> queue = new LinkedList<>();
    // Add an element to the end of the queue
    @FXML
    private void onAdd() {
        String data = txtData.getText().trim();
        if (!data.isEmpty()) {
            queue.offer(data);
            txtData.clear();
            updateDisplay();
        }}
    // Remove the first element from the queue
    @FXML
    private void onRemove() {
        if (!queue.isEmpty()) {
            queue.poll();
            updateDisplay();
        }}
    // Remove all elements from the queue
    @FXML
    private void onClear() {
        queue.clear();
        updateDisplay();
    }
    // Display the current contents of the queue
    private void updateDisplay() {
        if (queue.isEmpty()) {
            txtArea.setText("Queue is empty.");
            return;
        }
        // Create a StringBuilder for the output
        StringBuilder result = new StringBuilder();
        result.append("Queue:\n\n");
        for (String item : queue) {
            result.append(item)
                    .append("\n");
        }
        txtArea.setText(result.toString());}
    // Return to the main menu
    @FXML
    private void backToMenu() {
        Stage currentStage =
                (Stage) txtArea.getScene().getWindow();
        currentStage.close();
    }
}
