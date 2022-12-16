module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.project.pbo to javafx.fxml;
    exports com.project.pbo;
}