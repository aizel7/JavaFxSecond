module com.example.javafxsecond {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxsecond to javafx.fxml;
    exports com.example.javafxsecond;
}