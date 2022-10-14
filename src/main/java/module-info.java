module com.example.eleventhdayofjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eleventhdayofjava to javafx.fxml;
    exports com.example.eleventhdayofjava;
}