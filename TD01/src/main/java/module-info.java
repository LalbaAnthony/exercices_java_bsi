module org.example.td01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.td01 to javafx.fxml;
    exports org.example.td01;
}