module com.solsystems.menureursividad {

    // JavaFX modules required by the application
    requires javafx.controls;
    requires javafx.fxml;

    // Export the main application package
    exports com.solsystems.menureursividad;

    // Export the controller package
    exports com.solsystems.menureursividad.controller;

    // Allow JavaFX FXML to access the application classes
    opens com.solsystems.menureursividad to javafx.fxml;

    // Allow FXML to access the controller classes
    opens com.solsystems.menureursividad.controller to javafx.fxml;
}