module com.bluu.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bluu.helloworldfx to javafx.fxml;
    exports com.bluu.helloworldfx;
}