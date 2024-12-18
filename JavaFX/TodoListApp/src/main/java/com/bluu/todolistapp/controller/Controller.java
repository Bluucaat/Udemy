package com.bluu.todolistapp.controller;

import com.bluu.todolistapp.model.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private @FXML Label deadLineLabel;

    private @FXML List<ToDoItem> toDoItems;

    private @FXML ListView<ToDoItem> toDoListView;

    private @FXML TextArea itemDetailsTextArea;


    public void initialize() {
        toDoItems = new ArrayList<>();
        toDoItems.add(new ToDoItem("Mail birthday card", "Buy some present for john",
                LocalDate.of(2025, Month.APRIL, 25)));
        toDoItems.add(new ToDoItem("Study courses", "Study your java course",
                LocalDate.of(2025, Month.FEBRUARY, 13)));
        toDoItems.add(new ToDoItem("Doctor's appointment", "see Dr. john at 123 main street, bring paperwork.",
                LocalDate.of(2025, Month.APRIL, 15)));
        toDoItems.add(new ToDoItem("Finish design proposal for client", "Promised the client an email describing the design proposal.",
                LocalDate.of(2025, Month.JANUARY, 5)));
        toDoItems.add(new ToDoItem("Pick up Doug at the train station", "Doug's arriving on march 23. (5 O'clock train)",
                LocalDate.of(2024, Month.MARCH, 23)));

        toDoListView.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<ToDoItem>() {
                    @Override
                    public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem oldValue, ToDoItem newValue) {
                        if(newValue != null){
                            ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
                            itemDetailsTextArea.setText(item.getDetails());
                            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                            deadLineLabel.setText(dtf.format(item.getDueDate()));
                        }
                    }
                }
        );

        toDoListView.getItems().setAll(toDoItems);
        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        toDoListView.getSelectionModel().selectFirst();
    }

    public @FXML void handleClickListView() {
        ToDoItem item = (ToDoItem) toDoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadLineLabel.setText(item.getDueDate().toString());
    }
}