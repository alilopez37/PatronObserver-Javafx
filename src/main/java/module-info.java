module com.example.example05 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.example05 to javafx.fxml;
    exports com.example.example05;
}