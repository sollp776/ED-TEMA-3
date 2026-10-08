package com.solsystems.menureursividad.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RecursionController {

    // Text field where the user enters a number
    @FXML
    private TextField txtNumber;

    // Text area used to display the result
    @FXML
    private TextArea txtArea;

    // Calculate the factorial using recursion
    @FXML
    private void calculateFactorial() {

        try {

            // Convert the input text into an integer
            int number = Integer.parseInt(
                    txtNumber.getText().trim()
            );

            // Check that the number is not negative
            if (number < 0) {

                txtArea.setText(
                        "Please enter a non-negative number."
                );

                return;
            }

            // Call the recursive factorial method
            long result = factorial(number);

            // Display the result
            txtArea.setText(
                    "Factorial of " + number + " = " + result
            );

        } catch (NumberFormatException e) {

            // Display an error for invalid input
            txtArea.setText(
                    "Please enter a valid integer."
            );
        }
    }

    // Calculate the Fibonacci number using recursion
    @FXML
    private void calculateFibonacci() {

        try {

            // Convert the input text into an integer
            int number = Integer.parseInt(
                    txtNumber.getText().trim()
            );

            // Check that the number is not negative
            if (number < 0) {

                txtArea.setText(
                        "Please enter a non-negative number."
                );

                return;
            }

            // Call the recursive Fibonacci method
            long result = fibonacci(number);

            // Display the result
            txtArea.setText(
                    "Fibonacci(" + number + ") = " + result
            );

        } catch (NumberFormatException e) {

            // Display an error for invalid input
            txtArea.setText(
                    "Please enter a valid integer."
            );
        }
    }

    // Recursive method for calculating factorial
    private long factorial(int number) {

        // Base case: 0! and 1! are equal to 1
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive case
        return number * factorial(number - 1);
    }

    // Recursive method for calculating Fibonacci
    private long fibonacci(int number) {

        // Base case: Fibonacci(0) is 0
        if (number == 0) {
            return 0;
        }

        // Base case: Fibonacci(1) is 1
        if (number == 1) {
            return 1;
        }

        // Recursive case
        return fibonacci(number - 1)
                + fibonacci(number - 2);
    }

    // Return to the main menu
    @FXML
    private void backToMenu() {

        // Get the current window
        Stage currentStage =
                (Stage) txtArea.getScene().getWindow();

        // Close the current window
        currentStage.close();
    }
}
