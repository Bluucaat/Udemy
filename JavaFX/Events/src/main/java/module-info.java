module com.bluu.events {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bluu.events to javafx.fxml;
    exports com.bluu.events;
}