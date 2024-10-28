module com.bluu.todolistapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens com.bluu.todolistapp to javafx.fxml;
    exports com.bluu.todolistapp;
    exports com.bluu.todolistapp.controller;
    opens com.bluu.todolistapp.controller to javafx.fxml;
}