module com.bluu.layouts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bluu.layouts to javafx.fxml;
    exports com.bluu.layouts;
}