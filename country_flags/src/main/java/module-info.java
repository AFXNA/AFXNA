module com.example.country_flags {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.country_flags to javafx.fxml;
    exports com.example.country_flags;
}