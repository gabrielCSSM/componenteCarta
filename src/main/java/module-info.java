module com.example.componentecarta {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.componentecarta to javafx.fxml;
    exports com.example.componentecarta;
}